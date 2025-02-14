import java.util.List;
import java.util.Scanner;

import entidades.Casa;
import servicios.CasaServicio;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CasaServicio casaServicio = new CasaServicio();

    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            System.out.println("\n--- Menú de Consultas ---");
            System.out.println("1. Listar familias con al menos 3 hijos y edad máxima < 10 años");
            System.out.println("2. Listar casas disponibles en Reino Unido (agosto 2020)");
            System.out.println("3. Listar familias con correo Hotmail");
            System.out.println("4. Buscar casas disponibles a partir de una fecha dada y número de días");
            System.out.println("5. Listar clientes con estancias y descripción de la casa");
            System.out.println("6. Listar estancias reservadas por clientes con detalles de la casa");
            System.out.println("7. Incrementar precio de casas en Reino Unido en un 5%");
            System.out.println("8. Obtener el número de casas por país");
            System.out.println("9. Listar casas en Reino Unido con comentarios que dicen 'limpias'");
            System.out.println("10. Insertar una nueva estancia verificando disponibilidad");
            System.out.println("0. Salir");

            System.out.print("\nElige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {/* 
                case 1 -> listarFamiliasConHijos();
                case 2 -> listarCasasDisponiblesReinoUnido();
                case 3 -> listarFamiliasHotmail();
                case 4 -> buscarCasasPorFechaYDias();
                case 5 -> listarClientesConEstancias();
                case 6 -> listarEstanciasPorCliente();
                case 7 -> incrementarPreciosReinoUnido(); */
                case 8 -> obtenerNumeroCasasPorPais();
                case 9 -> listarCasasLimpiasReinoUnido();
                //case 10 -> insertarNuevaEstancia();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }
    private static void obtenerNumeroCasasPorPais() throws Exception {
        List<String> casasPorPais = casaServicio.obtenerNumeroCasasPorPais();
        casasPorPais.forEach(System.out::println);
    }
    
    private static void listarCasasLimpiasReinoUnido() throws Exception {
        List<Casa> casas = casaServicio.obtenerCasasLimpiasEnReinoUnido();
        casas.forEach(System.out::println);
    }
}









