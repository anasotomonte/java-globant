/*Desarrolla un programa que pida al usuario ingresar 4 nombres. 
Estos nombres serán ordenados alfabéticamente y posteriormente 
impresos en la consola. Es esencial emplear exclusivamente las 
herramientas aprendidas hasta el momento.

 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAlfabetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre " + (i + 1));
            nombres[i] = scanner.nextLine();
        }
        Arrays.sort(nombres);
        for (int i = 0; i < 4; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
        }
    }
}
