/*Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza 
la resta del primer número menos el segundo número. Implementa un bloque "try-catch" 
para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. 
}En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. 
Si no se produce ninguna excepción, muestra el resultado de la resta. */

import java.util.Scanner;

public class Restavs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.println("Ingrese el primer número:");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número:");
            num2 = sc.nextInt();
            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            int resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
