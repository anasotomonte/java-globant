import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Equipo> equipos = new ArrayList<>();
        List<Jugador> jugadores = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de la Liga ---");
            System.out.println("1. Crear equipo");
            System.out.println("2. Crear jugador");
            System.out.println("3. Asignar jugador a equipo");
            System.out.println("4. Mostrar lista de jugadores");
            System.out.println("5. Mostrar lista de equipos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Crear equipo
                    System.out.print("Ingrese el nombre del equipo: ");
                    String nombreEquipo = scanner.nextLine();
                    equipos.add(new Equipo(nombreEquipo));
                    System.out.println("Equipo creado exitosamente.");
                    break;

                case 2:
                    // Crear jugador
                    System.out.print("Ingrese el nombre del jugador: ");
                    String nombreJugador = scanner.nextLine();
                    if (equipos.isEmpty()) {
                        System.out.println("No hay equipos disponibles. El jugador será creado sin equipo.");
                        jugadores.add(new Jugador(nombreJugador));
                    } else {
                        System.out.println("Seleccione un equipo para el jugador:");
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
                        }
                        int equipoSeleccionado = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        if (equipoSeleccionado > 0 && equipoSeleccionado <= equipos.size()) {
                            Jugador nuevoJugador = new Jugador(nombreJugador);
                            Equipo equipo = equipos.get(equipoSeleccionado - 1);
                            nuevoJugador.setEquipo(equipo);
                            equipo.agregarJugador(nuevoJugador);
                            jugadores.add(nuevoJugador);
                            System.out.println("Jugador creado y asignado al equipo " + equipo.getNombre() + ".");
                        } else {
                            System.out.println("Selección inválida. El jugador será creado sin equipo.");
                            jugadores.add(new Jugador(nombreJugador));
                        }
                    }
                    break;

                case 3:
                    // Asignar jugador a equipo
                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores disponibles.");
                    } else if (equipos.isEmpty()) {
                        System.out.println("No hay equipos disponibles.");
                    } else {
                        System.out.println("Seleccione un jugador:");
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
                        }
                        int jugadorSeleccionado = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea

                        System.out.println("Seleccione un equipo:");
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
                        }
                        int equipoSeleccionado = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea

                        if (jugadorSeleccionado > 0 && jugadorSeleccionado <= jugadores.size() &&
                            equipoSeleccionado > 0 && equipoSeleccionado <= equipos.size()) {
                            Jugador jugador = jugadores.get(jugadorSeleccionado - 1);
                            Equipo equipo = equipos.get(equipoSeleccionado - 1);
                            jugador.setEquipo(equipo);
                            equipo.agregarJugador(jugador);
                            System.out.println("Jugador asignado exitosamente al equipo " + equipo.getNombre() + ".");
                        } else {
                            System.out.println("Selección inválida.");
                        }
                    }
                    break;

                case 4:
                    // Mostrar lista de jugadores
                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores registrados.");
                    } else {
                        System.out.println("Lista de jugadores:");
                        for (Jugador jugador : jugadores) {
                            System.out.println(jugador.getDetalles());
                        }
                    }
                    break;

                case 5:
                    // Mostrar lista de equipos
                    if (equipos.isEmpty()) {
                        System.out.println("No hay equipos registrados.");
                    } else {
                        System.out.println("Lista de equipos:");
                        for (Equipo equipo : equipos) {
                            System.out.println(equipo.getDetalles());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}

/*package AdvancedOOP.LigaDeFutbol;
import AdvancedOOP.LigaDeFutbol.Modelos.Equipo;
import AdvancedOOP.LigaDeFutbol.Modelos.Jugador;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
Equipo equipo = new Equipo();
equipo.setNombre("Real Madrid");
// Jugador jugador1 = new Jugador("Modric", equipo);
// Jugador jugador2 = new Jugador("Cortouis", equipo);
// Jugador jugador3 = new Jugador("Vinicius", equipo);
// Jugador jugador4 = new Jugador("Valverde", equipo);
// Jugador jugador5 = new Jugador("Rodrigo", equipo);
Jugador[] jugadores = {
jugador1,
jugador2,
jugador3,
jugador4,
jugador5,
};
Equipo[] equipos = new Equipo[3];
int eleccion;
do {
menu();
eleccion = scn.nextInt();
ejec...

SEND TO

Gina Paola Vasquez Cañas
Ana María Sotomonte
Victor Hugo Cuartas Ruiz
Estefanía Vago

Team 27
02:22











Messages
Total connected: 8

Chat
Diffusion
Victor Hugo Cuartas Ruiz
a

Everyone

18:49 hs
package AdvancedOOP.LigaDeFutbol;
import AdvancedOOP.LigaDeFutbol.Modelos.Equipo;
import AdvancedOOP.LigaDeFutbol.Modelos.Jugador;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
Equipo equipo = new Equipo();
equipo.setNombre("Real Madrid");
// Jugador jugador1 = new Jugador("Modric", equipo);
// Jugador jugador2 = new Jugador("Cortouis", equipo);
// Jugador jugador3 = new Jugador("Vinicius", equipo);
// Jugador jugador4 = new Jugador("Valverde", equipo);
// Jugador jugador5 = new Jugador("Rodrigo", equipo);
Jugador[] jugadores = {
jugador1,
jugador2,
jugador3,
jugador4,
jugador5,
};
Equipo[] equipos = new Equipo[3];
int eleccion;
do {
menu();
eleccion = scn.nextInt();
ejec...

Victor Hugo Cuartas Ruiz
a

Everyone

18:49 hs
package AdvancedOOP.LigaDeFutbol.Modelos;

public class Equipo {
private String nombre;

public Equipo() {}

public Equipo(String nombre) {
this.nombre = nombre;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public void imprimirAtributos() {
System.out.println(nombre);
}
}

Victor Hugo Cuartas Ruiz
a

Everyone

18:50 hs
package AdvancedOOP.LigaDeFutbol.Modelos;

public class Jugador {
private String nombre;
private Equipo equipo;

public Jugador() {}

public Jugador(String nombre, Equipo equipo) {
this.nombre = nombre;
this.equipo = equipo;
}

public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getEquipo() {
return this.equipo.getNombre();
}
public void setEquipo(Equipo equipo) {
this.equipo = equipo;
}

public void imprimirAtributos() {
System.out.printf("Nombre: %s, Equipo: %s\n", nombre, getEquipo());
}
}

SEND TO

Everyone
package AdvancedOOP.LigaDeFutbol;
import AdvancedOOP.LigaDeFutbol.Modelos.Equipo;
import AdvancedOOP.LigaDeFutbol.Modelos.Jugador;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static Scanner scn = new Scanner(System.in)

You will be sent to the general room in 2 minutes.
Inseconds a broadcast message will be played
Victor Hugo Cuartas Ruiz está compartiendo su pantalla
 */

