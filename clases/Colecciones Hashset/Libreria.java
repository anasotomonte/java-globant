/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

import java.util.HashSet;
import java.util.Iterator;

public class Libreria {

    private HashSet<Libro> catalogo;

    public Libreria() {
        this.catalogo = new HashSet<>();
    }

    public void agregarLibro(Libro lib) {
        if (catalogo.contains(lib)) {
            System.out.println("Dato ya ingresado anteriormente");
        } else {
            catalogo.add(lib);
            System.out.println("Dato ingresado");
        }
    }

    public void eliminarLibro(String isbn) {
        if (catalogo.removeIf(libro -> libro.getIsbn().equals(isbn))) {
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no existente");
        }
    }

    public void mostrarCatalogo() {
        Iterator<Libro> iterator = catalogo.iterator();
        System.out.println("Catalogo de libros:");
        if (catalogo.isEmpty()) {
            System.out.println("El catalogo está vacío.");
        } else {
            System.out.println("Catalogo de libros:");
            while (iterator.hasNext()) {
                Libro libro = iterator.next();
                System.out.println(libro);
            }
        }
    }
}
