package com.egg.catalogo.repositorios;

import com.egg.catalogo.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepositorio extends JpaRepository<Usuario, UUID> {
}
