package com.egg.biblioteca.servicios;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.repositorios.AutorRepositorio;

import jakarta.transaction.Transactional;



@Service
public class AutorServicio {
    
    @Autowired
private AutorRepositorio autorRepositorio;

    @Transactional
public void crearAutor(String nombre){
            
    Autor autor = new Autor();// Instancio un objeto del tipo Autor
autor.setNombre(nombre);// Seteo el atributo, con el valor recibido como parámetro


    autorRepositorio.save(autor); // Persisto el dato en mi BBDD
    }

    @Transactional
    public void modificarAutor(String nombre, String id){     
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
           
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }
    }


}
