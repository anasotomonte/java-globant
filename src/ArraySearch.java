/*Actividad: Buscando un elemento
El programa debe crear un array de tamaño 3 que almacene 
números enteros. Luego, solicita un número al usuario y 
muestra por consola si ese número está presente en el array o 
no. Es importante utilizar únicamente las herramientas 
aprendidas hasta el momento, sin emplear bucles en el proceso.*/

import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] enteros = new int[3];
    System.out.println("Ingrese un elemento del array.");
    enteros[0] = scan.nextInt();
    System.out.println("Ingrese un elemento del array.");
    enteros[1] = scan.nextInt();
    System.out.println("Ingrese un elemento del array.");
    enteros[2] = scan.nextInt();
   
    int maximo = enteros[0];