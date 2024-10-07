//El objetivo de este desafío es escribir un programa que 
//use un operador ternario para determinar si un número es par o impar.

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Usar el operador ternario para determinar si el número es par o impar
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        // Mostrar el resultado
        System.out.println("El número " + numero + " es " + resultado);
        
        // Cerrar el scanner
        scanner.close();
    }
}








