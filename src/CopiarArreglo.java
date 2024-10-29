/*Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al 
usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo 
original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange().
 Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos 
índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class CopiarArreglo {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println("Arreglo original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int indiceInicial = 0;
        int indiceFinal = 0;

            System.out.print("Ingrese el índice inicial: ");
            indiceInicial = scanner.nextInt();

            System.out.print("Ingrese el índice final: ");
            indiceFinal = scanner.nextInt();
            
        int[] nuevoArreglo = Arrays.copyOfRange(numeros, indiceInicial, indiceFinal+1);

        System.out.println("\nNuevo arreglo copiado entre los índices " + indiceInicial + " y " + indiceFinal + ":");
        System.out.println(Arrays.toString(nuevoArreglo));

        scanner.close();
    }
}









/*

import java.util.Arrays;
import java.util.Scanner;

public class CopiarArreglo {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo de enteros
        int[] numeros = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // Mostrar el arreglo con sus índices
        System.out.println("Arreglo original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int indiceInicial = 0;
        int indiceFinal = 0;

        // Solicitar índices al usuario con validaciones
        boolean indicesValidos = false;
        while (!indicesValidos) {
            // Solicitar el índice inicial
            System.out.print("Ingrese el índice inicial: ");
            indiceInicial = scanner.nextInt();

            // Solicitar el índice final
            System.out.print("Ingrese el índice final: ");
            indiceFinal = scanner.nextInt();

            // Validar que los índices sean correctos
            if (indiceInicial < 0 || indiceInicial >= numeros.length) {
                System.out.println(
                        "El índice inicial está fuera del rango. Debe estar entre 0 y " + (numeros.length - 1));
            } else if (indiceFinal < 0 || indiceFinal >= numeros.length) {
                System.out
                        .println("El índice final está fuera del rango. Debe estar entre 0 y " + (numeros.length - 1));
            } else if (indiceInicial > indiceFinal) {
                System.out.println("El índice inicial debe ser menor o igual que el índice final.");
            } else {
                indicesValidos = true; // Los índices son válidos
            }
        }

        // Copiar la parte del arreglo original utilizando Arrays.copyOfRange
        int[] nuevoArreglo = Arrays.copyOfRange(numeros, indiceInicial, indiceFinal + 1); // Se suma 1 al final porque
                                                                                          // el rango es exclusivo en
                                                                                          // copyOfRange()

        // Mostrar el nuevo arreglo
        System.out.println("\nNuevo arreglo copiado entre los índices " + indiceInicial + " y " + indiceFinal + ":");
        System.out.println(Arrays.toString(nuevoArreglo));

        // Cerrar el scanner
        scanner.close();
    }
}

 * Explicación del código:
 * Arreglo original:
 * El arreglo numeros contiene 10 elementos {10, 20, 30, 40, 50, 60, 70, 80, 90,
 * 100}. Se recorre e imprime cada elemento junto con su índice.
 * 
 * Solicitar índices al usuario:
 * Se utiliza un bucle while para solicitar el índice inicial y el índice final.
 * El bucle sigue solicitando los índices hasta que sean válidos:
 * 
 * El índice inicial debe estar en el rango de 0 a numeros.length - 1.
 * El índice final debe estar en el mismo rango.
 * El índice inicial debe ser menor o igual que el índice final.
 * Copia de la parte del arreglo:
 * Una vez que se obtienen índices válidos, se utiliza el método
 * Arrays.copyOfRange() para copiar la parte del arreglo comprendida entre los
 * dos índices (inclusivos). Hay que sumar 1 al índice final porque el segundo
 * argumento de copyOfRange es exclusivo.
 * 
 * Mostrar el nuevo arreglo:
 * El nuevo arreglo se imprime utilizando Arrays.toString().
 */

/*
 * import java.util.Arrays;
 * import java.util.Scanner;
 * public class Copypartarray {
 * public static void main(String[] args) {
 * int[] array = {1, 2, 3, 4, 5,
 * 6, 7, 8, 9, 10,
 * 11, 12, 13, 14, 15};
 * System.out.println("Arreglo original: ");
 * for (int i = 0; i < array.length; i++) {
 * System.out.println("Índice: " + i + " Valor: " + array[i
 * ]);
 * }
 * Scanner scanner = new Scanner(System.in);
 * System.out.println("Ingrese el índice inicial:");
 * int indexInitial = scanner.nextInt();
 * System.out.println("Ingrese el índice final:");
 * int indexFinal = scanner.nextInt();
 * if (indexInitial < indexFinal && indexInitial >= 0 && indexFinal <
 * array.length
 * )
 * }
 * int[] copyArray = Arrays.copyOfRange(array, indexInitial, indexFinal + 1);
 * System.out.println("Arreglo copiado: ");
 * for (int i = 0; i < copyArray.length; i++) {
 * System.out.println("Índice: " + i + " Valor: " + copyArray
 * [i]);
 * }
 * }
 */
