import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Turnero {
    public static void main(String[] args) {
        ArrayList<Integer> turnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ultimoTurno = 0;
        String opcion;

        System.out.println("Bienvenido al sistema de asignación de turnos.");

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Generar un nuevo turno");
            System.out.println("2. Atender al siguiente cliente (turno más antiguo)");
            System.out.println("3. Realizar sorteo y atender a un cliente al azar");
            System.out.println("4. Mostrar la lista de turnos pendientes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1": // Generar nuevo turno
                    ultimoTurno++;
                    turnos.add(ultimoTurno);
                    System.out.println("Turno generado: " + ultimoTurno);
                    break;

                case "2": // Atender al cliente más antiguo
                    if (!turnos.isEmpty()) {
                        int turnoAtendido = turnos.remove(0);
                        System.out.println("Atendiendo al cliente con turno: " + turnoAtendido);
                    } else {
                        System.out.println("No hay turnos pendientes.");
                    }
                    break;

                case "3": // Realizar sorteo
                    if (!turnos.isEmpty()) {
                        int indiceSorteado = random.nextInt(turnos.size());
                        int turnoSorteado = turnos.remove(indiceSorteado);
                        System.out.println("Turno sorteado: " + turnoSorteado + ". Cliente atendido inmediatamente.");
                    } else {
                        System.out.println("No hay turnos disponibles para el sorteo.");
                    }
                    break;

                case "4": // Mostrar turnos pendientes
                    if (!turnos.isEmpty()) {
                        System.out.println("Turnos pendientes: " + turnos);
                    } else {
                        System.out.println("No hay turnos pendientes.");
                    }
                    break;

                case "5": // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (!opcion.equals("5"));

        scanner.close();
    }
}
