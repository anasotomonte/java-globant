import java.util.ArrayList;
import java.util.Scanner;

// Clase Libro
class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    // Constructor
    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroDePaginas);
        System.out.println("------------------------");
    }
}

// Clase Biblioteca
class Biblioteca {
    private ArrayList<Libro> catalogo;

    // Constructor
    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    // Método para agregar libros al catálogo
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro agregado al catálogo.");
    }

    // Método para mostrar el catálogo
    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de libros:");
            for (Libro libro : catalogo) {
                libro.mostrarInformacion();
            }
        }
    }
}

// Clase principal
public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("=== Menú de la Biblioteca ===");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Mostrar el catálogo de libros");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar un libro
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el número de páginas: ");
                    int numeroDePaginas = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Libro nuevoLibro = new Libro(titulo, autor, numeroDePaginas);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;

                case 2:
                    // Mostrar el catálogo
                    biblioteca.mostrarCatalogo();
                    break;

                case 3:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}

/* 
Sofía Montiel
a

Everyone

18:48 hs
esofiamontiel@gmail.com

Dani Camacho
a

Everyone

18:48 hs
danicamachob@gmai..com

Ana María Sotomonte (Tú)
a

Everyone

18:48 hs
ana.sotomonte@gmail.com

Nohelia
a

Everyone

18:48 hs
ntacca@unsa.edu.pe

Diego Andres Bravo Trettenero
a

Everyone

18:48 hs
diegobravotre@gmail.com

Yeison Garcã­a Escobar
a

Everyone

18:48 hs
yegarces30@gmail.com
*/