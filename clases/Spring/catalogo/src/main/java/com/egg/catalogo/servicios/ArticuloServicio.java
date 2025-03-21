package com.egg.catalogo.servicios;

import com.egg.catalogo.entidades.Articulo;
import com.egg.catalogo.repositorios.ArticuloRepositorio;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ArticuloServicio {

    //CRUD Create, Read, Update and Delete

    private  final ArticuloRepositorio articuloRepositorio;

@Transactional
    public Articulo createArticulo(String nombre) {
    int number = nroArticulo
}

}

///Voy aca en articulo Servicio....... Jueves