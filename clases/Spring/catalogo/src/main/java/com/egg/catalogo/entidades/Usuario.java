package com.egg.catalogo.entidades;


import com.egg.catalogo.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID idUsuario;

    private String nombre;
    private String apellido;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

}