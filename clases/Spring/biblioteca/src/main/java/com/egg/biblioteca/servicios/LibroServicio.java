package com.egg.biblioteca.servicios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;

import jakarta.transaction.Transactional;

@Service
public class LibroServicio {


    @Autowired
private LibroRepositorio libroRepositorio;

@Autowired
private AutorRepositorio autorRepositorio;
@Autowired
private EditorialRepositorio editorialRepositorio;

@Transactional
public void crearLibro(Long isbn , String titulo, Integer ejemplares ,String id_autor, String id_editorial){


    Autor autor = autorRepositorio.findById(id_autor).get();

    Editorial editorial = editorialRepositorio.findById(id_editorial).get();

            
    Libro libro= new Libro();// Instancio un objeto del tipo Autor
    libro.setIsbn(isbn);
    libro.setTitulo(titulo);
    libro.setEjemplares(ejemplares);
    libro.setAlta(new Date(0));
    libro.setAutor(autor);
    libro.setEditorial(editorial);


    libroRepositorio.save(libro); // Persisto el dato en mi BBDD
    }


@Transactional()
    public List<Libro> listarLibros() {


        List<Libro> libros = new ArrayList<>();



        libros = libroRepositorio.findAll();
        return libros;
    }


}
