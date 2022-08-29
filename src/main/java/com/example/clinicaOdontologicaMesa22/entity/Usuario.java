package com.example.clinicaOdontologicaMesa22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private int usuarioId;
    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;

}
