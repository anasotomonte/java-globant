package com.egg.biblioteca.servicios;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.repositorios.EditorialRepositorio;

import jakarta.transaction.Transactional;



@Service
public class EditorialServicio {
    

    @Autowired
private EditorialRepositorio editorialRepositorio;


@Transactional
public void crearEditorial(String nombre){
            
    Editorial editorial = new Editorial();// Instancio un objeto del tipo Editorial
  editorial.setNombre(nombre); // Seteo el atributo, con el valor recibido como parámetro


    editorialRepositorio.save(editorial); // Persisto el dato en mi BBDD
    }


    @Transactional
    public void modificarEditorial(String nombre, String id){     
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
        }
    
    }

}
