/*Pide al usuario que ingrese dos números, y:

A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. 
67cl678B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
💡Los operadores de comparación más utilizados en Java son: igualdad (==), distinto que (!=), mayor que (>), 
menor que (<), mayor o igual que (>=), menor o igual que (<=). */

import java.util.Scanner;
public class NumbersVs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo número");
            } else {
                System.out.println("El primer número no es mayor que el segundo número");
                }
                if (num1 != num2) {
                    System.out.println("El primer número es distinto al segundo número");
                    } else {
                        System.out.println("El primer número no es distinto al segundo número");
                        }
                        if (num1 % 2 == 0) {
                            System.out.println("El primer número es divisible por 2");
                            } else {
                                System.out.println("El primer número no es divisible por 2");
                                }
                                }
                            }
                                
