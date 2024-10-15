//En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, 
//negativo o cero. El resultado se mostrará en pantalla.

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {    

        Scanner scanner = new Scanner(System.in);
    
        int number;
        System.out.println("Ingrese un número:");
        number = scanner.nextInt();

        if (number >  0) { 
            System.out.println("el número es positivo");
    
        } else if  (number < 0) { 
            System.out.println("el número es negativo");

        } else { 
            System.out.println("el número es cero");
        }
    }
}
        

        

