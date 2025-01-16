
import java.util.Scanner;

public class MetodoManipularOraciones {

    public static Scanner myScanner = new Scanner(System.in);
    public static String oracion = null;
    public static int longitud = 0;

    public static void Menu() {
        int opcion;
        do {
            String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
            System.out.print(clear);

            System.out.println("Ingrese una opción del menú: ");//
            System.out.println("1. Crear oración o Borrar oración:");// ya
            System.out.println("2. Cantidad de caracteres de la oración: ");// ya
            System.out.println("3. Cantidad de palabras de la oración: ");// ya
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente: ");// ya
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente: ");// ya
            System.out.println("6. Buscar palabra dentro de la oración: ");// ya
            System.out.println("7. Modificar palabra dentro de la oración: ");
            System.out.println("8. Agregar contenido a la oración:");
            System.out.println("9. Salir:");

            opcion = myScanner.nextInt();
            myScanner.nextLine();

            switch (opcion) {
                case 1 -> CrearoBorrarOracion(oracion);
                case 2 -> CantidadCaracteres(oracion);
                case 3 -> CantidadPalabras(oracion);
                case 4 -> OrdenarPalabras(oracion);
                case 5 -> DevolverPalabra(oracion);
                case 6 -> BuscarPalabra(oracion);
                case 7 -> ModificarPalabra(oracion);
                case 8 -> AgregrarContenido(oracion);
                case 9 -> System.out.println("Saliendo del programa");
                default -> System.out.println("No ha ingresado una opción correcta");

            }

        } while (opcion != 9);

    }

    public static void main(String[] args) {

        Menu();

    }

    public static void CrearoBorrarOracion(String oracion) {

        // En Java, la palabra clave null es un literal que indica que una variable de
        // referencia no apunta a ningún objeto

        if (oracion == null) {
            System.out.println("No hay oración. Crear una oración:");
            oracion = myScanner.nextLine();
            System.out.println("Oración creada: " + oracion);
        } else {
            System.out.println("Oración actual: " + oracion);
            System.out.println("¿Desea borrarla? (s/n)");
            String respuesta = myScanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                oracion = null;
                System.out.println("Oración borrada.");
                myScanner.nextLine();
        }
        }
    }

public static void CantidadCaracteres(String oracion){

if (oracion == null) {
System.out.println("Primero debes crear una oración.");    
} else {
longitud = oracion.length();
System.out.
println("La cantidad de caracteres dentro de la oración es igual a: " +
longitud);
myScanner.nextLine();
}
}


public static void CantidadPalabras(String oracion){

    if (oracion == null) {
    System.out.println("Primero debes crear una oración.");
        } else {
        String[] palabras = oracion.trim().split("\\s+");
        int cantidadDePalabras = palabras.length;
        System.out.println("La cantidad de palabras dentro de la oración es: " +
        cantidadDePalabras);
        }
    }
}

public static void OrdenarPalabras(String oracion){

    if (oracion == null) {
        * System.out.println("Primero debes crear una oración.");
        * 
        * } else {
        * // Dividir la oración en palabras
        * String[] ordenAlfa = oracion.split(" ");
        * Arrays.sort(ordenAlfa);
        * // String palabra: Cada elemento de ordenAlfa (que es una colección de
        * String)
        * // se asignará a la variable palabra en cada iteración.
        * // : ordenAlfa: Significa que el bucle recorrerá todos los elementos dentro
        * de
        * // ordenAlfa, asignando cada uno a palabra en cada vuelta del ciclo.
        * System.out.println("Palabras ordenadas alfabéticamente:");
        * for (String palabra : ordenAlfa) {
        * System.out.println(palabra);
        * }
        * }
        * 
        * }

}









    
    
    /*
         * switch (opcion) {
         * case 1 -> {
         * // En Java, la palabra clave null es un literal que indica que una variable
         * de
         * // referencia no apunta a ningún objeto
         * if (oracion == null) {
         * System.out.println("No hay oración. Crear una oración:");
         * oracion = myScanner.nextLine();
         * System.out.println("Oración creada: " + oracion);
         * } else {
         * System.out.println("Oración actual: " + oracion);
         * System.out.println("¿Desea borrarla? (s/n)");
         * String respuesta = myScanner.nextLine();
         * if (respuesta.equalsIgnoreCase("s")) {
         * oracion = null;
         * System.out.println("Oración borrada.");
         * myScanner.nextLine();
         * }
         * }
         * }
         * 
         * case 2 -> {
         * 
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * 
         * longitud = oracion.length();
         * System.out.
         * println("La cantidad de caracteres dentro de la oración es igual a: " +
         * longitud);
         * myScanner.nextLine();
         * 
         * }
         * }
         * case 3 -> {
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * String[] palabras = oracion.trim().split("\\s+");
         * int cantidadDePalabras = palabras.length;
         * 
         * System.out.println("La cantidad de palabras dentro de la oración es: " +
         * cantidadDePalabras);
         * }
         * }
         * // split(String regex) aparece en metodos de instancia en el matrial
         * // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
         * // Divide esta cadena en torno a las coincidencias de la expresión regular
         * dada
         * // .
         * 
         * // La expresión regular \\s nos sirve para encontrar espacios en blanco, al
         * // agregarle el símbolo + le indicamos que el espacio en blanco puede ser de
         * // cualquier longitud.
         * // La expresión regular .* indica que puede haber cualquier cosa después del
         * // espacio en blanco que buscamos.
         * // https://4geeks.com/es/lesson/expresiones-regulares-java
         * 
         * case 4 -> {
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * // Dividir la oración en palabras
         * String[] ordenAlfa = oracion.split(" ");
         * Arrays.sort(ordenAlfa);
         * // String palabra: Cada elemento de ordenAlfa (que es una colección de
         * String)
         * // se asignará a la variable palabra en cada iteración.
         * // : ordenAlfa: Significa que el bucle recorrerá todos los elementos dentro
         * de
         * // ordenAlfa, asignando cada uno a palabra en cada vuelta del ciclo.
         * System.out.println("Palabras ordenadas alfabéticamente:");
         * for (String palabra : ordenAlfa) {
         * System.out.println(palabra);
         * }
         * }
         * 
         * }
         * case 5 -> {
         * 
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * System.out.
         * println("Ingrese un número para buscar la palabra ubicada en esa posición:");
         * int buscar2 = myScanner.nextInt();
         * String[] palabras = oracion.split(" ");
         * // Dividimos oracion en palabras y verificamos que buscar2 esté dentro del
         * rango
         * // antes de acceder al arreglo palabras.1
         * if (buscar2 >= 0 && buscar2 < palabras.length) {
         * System.out.println("La palabra en la posición " + buscar2 + " es: " +
         * palabras[buscar2]);
         * } else {
         * System.out.println("Posición fuera de rango. Ingrese un número entre 0 y "
         * + (palabras.length - 1) + ".");
         * 
         * }
         * }
         * }
         * case 6 -> {
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * System.out.println("Ingrese una palabara para buscar dentro de la oración: "
         * );
         * String buscar = myScanner.nextLine();
         * boolean encontrado = oracion.contains(buscar);
         * 
         * // contains(CharSequence s)
         * // Devuelve verdadero si y solo si esta cadena contiene la secuencia
         * // especificada de valores de caracteres.
         * if (encontrado) {
         * System.out.println("La palabra :" + buscar +
         * " se encuentra dentro de la cadena");
         * } else {
         * System.out.println("La palabra :" + buscar +
         * " no se encuentra dentro de la cadena");
         * }
         * 
         * }
         * }
         * case 7 -> {
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * System.out.println("Ingrese la palabra que desea cambiar:");
         * String cambiar = myScanner.nextLine();
         * //contains(CharSequence s)
         * 
         * if (oracion.contains(cambiar)) {
         * System.out.println("Ingrese la nueva palabra:");
         * String nuevaPalabra = myScanner.nextLine();
         * oracion = oracion.replace(cambiar, nuevaPalabra);
         * System.out.println("Oración modificada: " + oracion);
         * } else {
         * System.out.println("La palabra \"" + cambiar +
         * "\" no se encuentra en la oración.");
         * }
         * }
         * }
         * 
         * case 8 -> {
         * if (oracion == null) {
         * System.out.println("Primero debes crear una oración.");
         * 
         * } else {
         * System.out.println("Ingrese el contenido que desea agregar a la oración:");
         * String contenidoAdicional = myScanner.nextLine();
         * oracion += " " + contenidoAdicional;
         * System.out.println("Oración actualizada: " + oracion);
         * }
         * }
         * case 9 -> System.out.println("Saliendo del programa!");
         * 
         * default -> System.out.println("Opción inválida. Intente de nuevo.");
         * 
         * }
         */
        myScanner.close();

    }
}
