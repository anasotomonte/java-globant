/*Metodos III
Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. 
Después, intenta modificar la lógica para resolverlo de forma recursiva. */

import java.util.Scanner;

public class Fibonacci {
    public static Scanner scan = new Scanner(System.in);
    

    public static void main(String[] args) {
        String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
        System.out.print(clear);
        System.out.println("Ingrese un numero");
        int num = scan.nextInt();
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }

        if (numero == 1) {
            return 1;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}