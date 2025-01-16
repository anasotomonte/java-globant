/*Generando un número aleatorio entre dos límites

Escribe un programa en el que se cree una variable de tipo array que 
contenga seis elementos de tipo entero. El programa debe contar la 
cantidad de elementos pares presentes en el array y mostrar el resultado 
por consola utilizando solo las herramientas aprendidas hasta el momento. */

import java.util.Scanner;

public class ArrayAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int contador = 0;
        int numero;
        for (int i = 0; i < array.length; i++) {
            numero = (int) (Math.random() * 100);
            array[i] = numero;
            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("La cantidad de números pares en el array es: " + contador);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + array[i]);
        }
    }
}
