/*Escribe un programa que pida al usuario que ingrese dos números enteros y realice la 
división del primer número entre el segundo número. Implementa un bloque "try-catch" 
para manejar la excepción en caso de que se intente realizar una división por cero. 
En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla. */

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextInt();
        try {
            if (num2 == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("La división es: " + (num1 / num2));
            }
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
    }
}

