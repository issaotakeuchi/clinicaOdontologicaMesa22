package com.example.clinicaOdontologicaMesa22.controller;

import com.example.clinicaOdontologicaMesa22.entity.Usuario;
import com.example.clinicaOdontologicaMesa22.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/addUsuario")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @PostMapping("/addUsuarios")
    private List<Usuario> addUsuarios(@RequestBody List<Usuario> usuarios){
        return usuarioService.createUsuarios(usuarios);
    }

    @GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@PathVariable int id){
        return usuarioService.getUsuarioById(id);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getUsuarios();
    }

    @PutMapping("/updateUsuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public String deleteUsuario(@PathVariable int id){
        return usuarioService.deleteUsuarioById(id);
    }
}
