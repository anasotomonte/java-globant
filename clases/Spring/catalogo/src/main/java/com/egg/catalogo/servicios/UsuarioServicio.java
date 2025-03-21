package com.egg.catalogo.servicios;

import com.egg.catalogo.entidades.Usuario;
import com.egg.catalogo.enums.Rol;
import com.egg.catalogo.excepciones.MiException;
import com.egg.catalogo.repositorios.UsuarioRepositorio;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void  registrarUsuario(Usuario usuario) throws MiException {
        Optional<Usuario> usuarioRegistrado = usuarioRepositorio.findByEmail(usuario.getEmail());
        if (usuarioRegistrado.isPresent()) {
            throw new MiException("El email ya se encuentra registrado");
        }

        //Encriptar la contraseña antes de guardarla
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        //Asignar el rol por defecto como USER
        usuario.setRol(Rol.USER);

        //Guardar el Usuario en la base de datos
        usuarioRepositorio.save(usuario);

    }
}
