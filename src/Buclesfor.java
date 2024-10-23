/*Escribe un programa que recorra un array de enteros y muestre 
cada elemento en una línea separada. El tamaño, tipo de datos y 
la información a contener pueden ser de tu 
elección. */

//Mi solución es

public class Buclesfor {
    public static void main(String[] args) {
        //Array de números enteros
        int[] array = { 20, 40, 60, 80, 90, 100 };
        //Bucle for para que muestre el arreglo en cada lineas separadas
        for (int i = 0; i < array.length; i++) {
            System.out.println("El elemento es : " + array[i]);
        }
    }
}

/* Terminal
El elemento es : 20
El elemento es : 40
El elemento es : 60
El elemento es : 80
El elemento es : 90
El elemento es : 100 */








/* 
BLACK IA 
public class Buclesfor {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.println("El elemento es : " +array[i]);
        }
    }
}

Terminal se ve:

El elemento es : 1
El elemento es : 2
El elemento es : 3
El elemento es : 4
El elemento es : 5


/*
 * public class Buclesfor {
 * 
 * }
 */

// Chat GPT
/*
 * public class Buclesfor {
 * public static void main(String[] args) {
 * // Declaración e inicialización de un array de enteros
 * int[] numeros = {5, 10, 15, 20, 25, 30};
 * 
 * // Recorriendo el array e imprimiendo cada elemento en una línea separada
 * for (int i = 0; i < numeros.length; i++) {
 * System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
 * }
 * }
 * }
 * 
 */
/*
 * Terminal:
 * Elemento en la posición 0: 5
 * Elemento en la posición 1: 10
 * Elemento en la posición 2: 15
 * Elemento en la posición 3: 20
 * Elemento en la posición 4: 25
 * Elemento en la posición 5: 30
 */
