/*Actividad: Orden de mérito
Desarrolla un programa en Java que emplee un ArrayList para almacenar 
una serie de notas enteras en el rango del 1 al 10.

El programa debe permitir al usuario ingresar varios números a la 
lista, asegurándose de que cada número esté dentro del rango 
especificado. Luego, ordenará estos números de manera descendente y 
los imprimirá por pantalla en ambas direcciones.

Pasos a seguir:

Inicializa un ArrayList de tipo Integer para almacenar los números 
enteros.

Implementa un bucle que solicite al usuario ingresar números enteros 
uno por uno. Puedes usar un bucle while o for que pregunte al usuario 
si desea agregar un número en cada iteración.

En cada iteración del bucle, verifica que el número ingresado esté 
dentro del rango del 1 al 10 y agrégalo al ArrayList utilizando el 
método add. Continúa solicitando al usuario que ingrese números hasta 
que decida no agregar más.

Después de que el usuario haya ingresado todos los números, utiliza 
el método sort para ordenar la lista de números de forma descendente.

Imprime por pantalla la lista ordenada tanto en orden ascendente como
 descendente.


Este ejercicio te proporcionará práctica en la manipulación de 
ArrayLists en Java y te ayudará a comprender la ordenación de 
elementos de manera ascendente y descendente.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("Ingresa un numero entre 1 y 10");
            int entrada = scanner.nextInt();
            if (entrada >= 1 && entrada <= 10) {
                enteros.add(entrada);
            } else {
                System.out.println("El numero esta fuera de rango");
            }
            System.out.println("Desea ingresar otro numero");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opc = scanner.nextInt();
            continuar = (opc == 1);
        } while (continuar);

        Collections.sort(enteros);
        System.out.println(enteros);

        Collections.reverse(enteros);
        System.out.println(enteros);
    }
}