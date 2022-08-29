package com.example.clinicaOdontologicaMesa22.dao;

import com.example.clinicaOdontologicaMesa22.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
