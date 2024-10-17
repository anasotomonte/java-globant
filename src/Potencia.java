
import java.util.Scanner;

/*Escribe un programa que pida al usuario dos números enteros, representando la 
base y el exponente, y calcula el resultado de elevar la base al exponente utilizando 
el método pow() de la clase Math. 
Muestra el resultado en pantalla.  */

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base:");
        int base = scanner.nextInt();
        System.out.println("Introduce el exponente:");
        int exponente = scanner.nextInt();
        scanner.close();
        double resultado = Math.pow(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es " +
                resultado);
    }
}  // fin de la clase Potencia
    

