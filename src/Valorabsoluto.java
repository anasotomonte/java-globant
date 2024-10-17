/*Actividad: Calculando el valor absoluto
Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto 
utilizando el método abs() de la clase Math. */

import java.util.Scanner;

public class Valorabsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = sc.nextInt();
        int valorabsoluto = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es " + valorabsoluto);
        sc.close();
        }
}
