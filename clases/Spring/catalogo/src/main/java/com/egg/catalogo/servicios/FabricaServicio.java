package com.egg.catalogo.servicios;

import com.egg.catalogo.entidades.Fabrica;
import com.egg.catalogo.repositorios.FabricaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FabricaServicio {

    @Autowired
    private FabricaRepositorio fabricaRepositorio;

    // CRUD Create, Read, Update, Delete

    @Transactional
    public void crearFabrica(String nombre) throws MiException {
        validar(nombre);
        Fabrica fabrica = new Fabrica();
        fabrica.setNombre(nombre);

        fabricaRepositorio.save(fabrica);
    }

    @Transactional(readOnly = true)
    public List<Fabrica> ListarFabricas() {
        List<Fabrica> fabrica = new ArrayList<>();

        fabricas = fabricaRepositorio.findAll();
        return fabricas;
    }


    @Transactional
    public void modificarFabrica(String nombre, UUID id) throws MiException{
        validar(nombre);
        Optional<Fabrica> respuesta = fabricaRepositorio.findById();

        if (respuesta.isPresent()) {
            Fabrica fabrica = respuesta.get();
            fabrica.setNombreFabrica(nombre);
            fabricaRepositorio.save(fabrica);

        } else {
            throw new MiException(:"No se encontró una fabrica con ese ID");
        }

        @Transactional
                public void eliminar (Long id) throws MiException {
            Optional<Fabrica> fabricaOptional = fabricaRepositorio.findById(id);
            if (fabricaOptional.isPresent()) fabricaRepositorio.delete(fabricaOptional.get());
        }else {
                throw new MiException("La fabrica con ese ID no existe")
            }
        }

    }


    }



