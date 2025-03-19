package com.egg.catalogo.entidades;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "articulos")

public class Articulo {

    private static final AtomicInteger atomicInteger = new AtomicInteger(1);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long idArticulo;

    @Column(name = "nro_articulo", unique = true, nullable = false)
    private Integer nroArticulo=atomicInteger.incrementAndGet();

    @Column(name = "nombre_articulo", length = 100, nullable = false)
    private String nombreArticulo;

    @Column(name = "descripcion_articulo", length = 255, nullable = false)
    private String descripcionArticulo;

    @ManyToOne
    @JoinColumn(name = "id_fabrica")
    private Fabrica fabrica;




}