package claseArray_II;

import java.util.Arrays;
import java.util.Scanner;
/* Rellenando un arreglo de manera personalizada

Escribe un programa en Java que realice lo siguiente:
Solicita al usuario un tamaño para un arreglo.
Luego, pídele que ingrese un número con el que desea rellenar el array.
Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.
Asegúrate de validar lo siguiente:
La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar pidiendo
al usuario nuevos números e índices para rellenar el arreglo.
El índice siempre debe ser menor que el tamaño total del arreglo.
Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado
debe ser mayor que el último índice ingresado; a su vez, se debe rellenar el array con el nuevo número
desde el índice anterior hasta el nuevo índice.
Por último, el programa debe imprimir por consola el arreglo completo.

]

*/

public class complementario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Ingrese un número para rellenar el arreglo:");
        int num = scanner.nextInt();
        scanner.nextLine();
        int lastIndex = 0;
        while (true) {
            System.out.println("Ingrese el índice hasta donde quiere rellenar el arreglo (mayor o igual a " + lastIndex
                    + " y menor que " + size + "):");
            int index = scanner.nextInt();
            if (index < lastIndex || index > size) {
                System.out.println("Índice inválido. Inténtelo de nuevo.");
                continue;
            }
            Arrays.fill(array, lastIndex, index, num);
            lastIndex = index;
            if (lastIndex == size) {
                break;
            }
            System.out.println("Ingrese otro número para rellenar el arreglo:");
            num = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
