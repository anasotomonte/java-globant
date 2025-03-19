package com.egg.catalogo.repositorios;

import com.egg.catalogo.entidades.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepositorio extends JpaRepository<Articulo, Long> {
}
