/*Escribe un programa que recorra un array de enteros y los imprima 
en orden inverso, comenzando desde el último elemento.. El tamaño y 
los números  a contener pueden ser de tu elección.

 */
public class OrdenInverso {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            if (i == 14) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + "," +" ");
            }
        }
        System.out.println("\nArray en orden inverso:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " " + ",");
        }
    }
}

// Otra forma de alguien

/*
 * public class ejercicio3 {
 * public static void main(String[] args) {
 * //declarra y definir un arreglo
 * int[] numeros = {1,2,3,4,5,6};
 * 
 * //ciclo que recorra el arreglo
 * for (int i = numeros.length - 1; i >= 0 ; i--) {
 * System.out.println(numeros[i]);
 * }
 * }
 * }
 * 
 */

/*
 * public class ArrayInverso {
 * public static void main(String[] args) {
 * // Declaración e inicialización de un array de enteros
 * int[] numeros = {10, 20, 30, 40, 50, 60};
 * 
 * // Imprimir los elementos en orden inverso
 * System.out.println("Elementos del array en orden inverso:");
 * for (int i = numeros.length - 1; i >= 0; i--) {
 * System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
 * }
 * }
 * }
 * Explicación del código:
 * Declaración e inicialización del array:
 * El array numeros contiene los valores {10, 20, 30, 40, 50, 60}.
 * 
 * Bucle for inverso:
 * El bucle comienza desde el último elemento del array (numeros.length - 1) y
 * va decreciendo hasta llegar al primer elemento (índice 0). En cada iteración,
 * imprime el valor de la posición actual.
 * 
 * Mostrar el resultado:
 * A medida que el bucle recorre el array en sentido inverso, imprime los
 * elementos desde el último hasta el primero.
 * 
 * Salida esperada:
 * yaml
 * Copy code
 * Elementos del array en orden inverso:
 * Elemento en la posición 5: 60
 * Elemento en la posición 4: 50
 * Elemento en la posición 3: 40
 * Elemento en la posición 2: 30
 * Elemento en la posición 1: 20
 * Elemento en la posición 0: 10
 * 
 */