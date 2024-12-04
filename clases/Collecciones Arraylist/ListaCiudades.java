

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCiudades {
    public static void main(String[] args) {
        // Inicializar un ArrayList para almacenar los nombres de las ciudades
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("Bienvenido al programa de lista de ciudades.");
        do {
            // Solicitar al usuario que ingrese el nombre de una ciudad
            System.out.print("Ingresa el nombre de una ciudad: ");
            String ciudad = scanner.nextLine();

            // Agregar la ciudad al ArrayList
            ciudades.add(ciudad);

            // Preguntar al usuario si desea agregar otra ciudad
            System.out.print("¿Deseas agregar otra ciudad? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("sí") || respuesta.equals("si"));

        // Mostrar la lista completa de ciudades
        System.out.println("\nLista de ciudades ingresadas:");
        for (String ciudad : ciudades) {
            System.out.println("- " + ciudad);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}




/*import java.util.ArrayList;
public class ListaCiudades {

    public static void main(String[] args) {
// Crear un ArrayList de tipo String

ArrayList<String> lista = new ArrayList<>();
// Agregar elementos a la lista
lista.add("Bogotá");
lista.add("Medellín");
lista.add("Manizales");
// Imprimir la lista
System.out.println("Lista después de agregar elementos: " + lista);
}
}
*/

/* 
import java.util.ArrayList;
import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
ArrayList<String> listaDeCiudades = new ArrayList<>();
Scanner sc = new Scanner(System.in);
String ciudad = "";

do {
System.out.println("Ingrese una ciudad o escriba salir");
ciudad= sc.nextLine();
listaDeCiudades.add(ciudad);
} while (!ciudad.equals("salir"));

listaDeCiudades.remove("salir");


System.out.println( "La lista de ciudades es "+listaDeCiudades);

sc.close();
}


/*import java.util.ArrayList;
import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
ArrayList<String> listaDeCiudades = new ArrayList<>();
Scanner sc = new Scanner(System.in);
String ciudad = "";

do {
System.out.println("Ingrese una ciudad o escriba salir");
ciudad= sc.nextLine();
listaDeCiudades.add(ciudad);
} while (!ciudad.equals("salir"));

listaDeCiudades.remove("salir");


System.out.println( "La lista de ciudades es "+listaDeCiudades);

sc.close();
}

*/
