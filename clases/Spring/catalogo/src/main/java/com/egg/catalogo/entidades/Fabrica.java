package com.egg.catalogo.entidades;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "fabricas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Fabrica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "id_fabrica")
    private Long idFabrica;

    @Column(name = "nombre_fabrica", nullable = false, length = 100)
    private String nombreFabrica;

    @OneToMany(mappedBy = "fabrica", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Articulo> articulos = new ArrayList<>();


}