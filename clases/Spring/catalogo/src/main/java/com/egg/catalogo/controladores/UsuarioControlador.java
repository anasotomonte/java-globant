package com.egg.catalogo.controladores;

import com.egg.catalogo.entidades.Usuario;
import com.egg.catalogo.excepciones.MiException;
import com.egg.catalogo.servicios.UsuarioServicio;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")

public class UsuarioControlador {
    private  final  UsuarioServicio usuarioServicio;

    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @PostMapping("/registrate")
    public ResponseEntity<String> usuarioRegistrado(@Valid @RequestBody Usuario usuario) {
        try {
            usuarioServicio.registrarUsuario(usuario);
            return ResponseEntity.ok("Usuario registrado correctamente");
        } catch (RuntimeException | MiException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
