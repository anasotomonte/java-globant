/*
 * @Autor: Darwin Neira Carrasco
 * @Email: dneirac@unsa.edu.pe
 * @Descripcion:
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Agregar libro
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el número de ISBN del libro: ");
                    String isbn = scanner.nextLine();

                    Libro libro = new Libro(titulo, autor, isbn);
                    libreria.agregarLibro(libro);
                    break;

                case 2:
                    // Eliminar libro
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    libreria.eliminarLibro(isbnEliminar);
                    break;

                case 3:
                    // Mostrar catálogo
                    libreria.mostrarCatalogo();
                    break;

                case 4:
                    // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
