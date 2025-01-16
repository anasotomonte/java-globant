/*Actividad: Sumando elementos
Escribe un programa en el cual se cree una variable de tipo array que 
contenga tres elementos de tipo entero. El programa debe sumar los tres 
elementos de forma manual e imprimir por consola el resultado utilizando 
solamente las herramientas adquiridas hasta el momento.
 */

public class ArrayVacio {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}

/*
 * class Personas {
 * String nombre;
 * 
 * Persona(String nombre) {
 * this.nombre = nombre;
 * }
 * 
 * void saludar() {
 * System.out.println("Hola, mi nombre es " + nombre);
 * }
 * }
 * 
 * public class ArrayVacio {
 * public static void main(String[] args) {
 * // Declaración e inicialización de un array de objetos Persona
 * Persona[] personas = {
 * new Persona("Juan"),
 * new Persona("Lucía"),
 * new Persona("Andrés")
 * };
 * 
 * // Accediendo a los métodos de los objetos en el array
 * for (Persona persona : personas) {
 * persona.saludar();
 * }
 * }
 * }
 */

/*
 * 5. Array de tamaño dinámico (ArrayList):
 * Aunque no es estrictamente un array, un ArrayList es una estructura de datos
 * que se comporta de manera similar, pero con tamaño dinámico.
 * 
 * 
 * import java.util.ArrayList;
 * 
 * public class ArrayVacio {
 * public static void main(String[] args) {
 * // Crear un ArrayList de enteros
 * ArrayList<Integer> numeros = new ArrayList<>();
 * 
 * // Añadir elementos al ArrayList
 * numeros.add(10);
 * numeros.add(20);
 * numeros.add(30);
 * 
 * // Imprimir los elementos del ArrayList
 * for (int numero : numeros) {
 * System.out.println("Número: " + numero);
 * }
 * }
 * }
 */

/*
 * 6. Inicialización y llenado posterior de un array:
 * public class ArrayVacio {
 * public static void main(String[] args) {
 * // Declarar un array de enteros con espacio para 5 elementos
 * int[] array = new int[5];
 * 
 * // Llenar el array
 * array[0] = 10;
 * array[1] = 20;
 * array[2] = 30;
 * array[3] = 40;
 * array[4] = 50;
 * 
 * // Imprimir el array
 * for (int i = 0; i < array.length; i++) {
 * System.out.println("Elemento en la posición " + i + ": " + array[i]);
 * }
 * }
 * }
 */