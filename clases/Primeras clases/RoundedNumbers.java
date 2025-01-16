/*Actividad: Redondeo de números
Escribe un programa que pida al usuario un número decimal y muestra en pantalla 
su valor redondeado utilizando el método round() de la clase Math.
 */

import java.util.Scanner;

public class RoundedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número decimal:");
        double number = scanner.nextDouble();
        double roundedNumber = Math.round(number);
        System.out.println("El número redondeado es: " + roundedNumber);
        scanner.close();
    }
}
