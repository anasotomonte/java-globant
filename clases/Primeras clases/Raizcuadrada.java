/*Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada }
utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo, 
muestra un mensaje adecuado en pantalla. */

import java.util.Scanner;

public class Raizcuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número positivo");
        double num = sc.nextDouble();
        sc.close();
        if (num < 0) {
            System.out.println("El número ingresado es negativo");
        } else {
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada del número ingresado es: " +
                    raiz);
        }
    }
}
