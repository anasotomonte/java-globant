/*Actividad: Copiando elementos
Desarrolla un programa que inicie creando un array de 3 
enteros, con valores predeterminados. Posteriormente, 
genera una copia del mismo con una extensión de 2 elementos 
adicionales.

Solicita al usuario que ingrese dos números para ser almacenados
 en las nuevas posiciones del array.

Finalmente, muestra por consola el contenido del nuevo array.

Es esencial emplear exclusivamente las herramientas aprendidas
 hasta el momento, evitando el uso de bucles en el proceso. */

import java.util.Scanner;


public class Arraycopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 1, 2, 3 };
        int[] arrayCopia = new int[array.length + 2];
        
        System.arraycopy(array, 0, arrayCopia, 0, array.length);
        
        System.out.println("Ingrese el primer número:");
        arrayCopia[array.length] = sc.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        arrayCopia[array.length + 1] = sc.nextInt();
        
        for (int i = 0; i < arrayCopia.length; i++) {
        System.out.println("Elemento en la posición " + i + ": " + arrayCopia[i]);
        }

        sc.close();
    }
}
