package com.egg.catalogo.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "articulos")
public class Articulo {

    private static final AtomicInteger atomicInteger = new AtomicInteger(1);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long idArticulo;

    @Column(name = "nro_articulo", unique = true, nullable = false)
    private Integer nroArticulo;

    @Column(name = "nombre_articulo", length = 100, nullable = false)
    private String nombreArticulo;

    @Column(name = "descripcion_articulo", length = 255, nullable = false)
    private String descripcionArticulo;

    @ManyToOne
    @JoinColumn(name = "id_fabrica", nullable = false)
    private Fabrica fabrica;

    @PrePersist
    private void generateNroArticulo() {
        this.nroArticulo = atomicInteger.getAndIncrement();
    }
}
