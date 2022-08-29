package com.example.clinicaOdontologicaMesa22.service;

import com.example.clinicaOdontologicaMesa22.dao.UsuarioRepository;
import com.example.clinicaOdontologicaMesa22.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> createUsuarios(List<Usuario> usuarios){
        return usuarioRepository.saveAll(usuarios);
    }

    public Usuario getUsuarioById(int id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> getUsuarios(){
        return  usuarioRepository.findAll();
    }

    public Usuario updateUsuario(Usuario usuario){
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(usuario.getUsuarioId());
        Usuario oldUsuario = null;
        if(optionalUsuario.isPresent()){
            oldUsuario = optionalUsuario.get();
            oldUsuario.setNome(usuario.getNome());
            oldUsuario.setEmail(usuario.getEmail());
            oldUsuario.setSenha(usuario.getSenha());
            oldUsuario.setNivelAcesso(usuario.getNivelAcesso());
            usuarioRepository.save(oldUsuario);
        }else {
            return new Usuario();
        }
        return oldUsuario;
    }

    public String deleteUsuarioById(int id){
        usuarioRepository.deleteById(id);
        return "usuario foi deletado";
    }
}
