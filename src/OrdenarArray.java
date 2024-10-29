/*Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. 
Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y
luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos 
ordenados en la consola. */

public class OrdenarArray { 
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            }
            System.out.println("Arreglo inicial: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");

            //Que el array se escriba en orden inverso
            Arrays.sort(array);
            System.out.println("\nArreglo ordenado en forma descendente: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                }
                }
                }
                }
                








//chat gpt
/* 
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class OrdenarArray {
    public static void main(String[] args) {
        // Declarar e inicializar un array de 10 enteros
        Integer[] numeros = new Integer[10]; // Usamos Integer para que funcione con Collections.reverseOrder()
        Random random = new Random();

        // Rellenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        }

        // Imprimir el array inicial
        System.out.println("Array inicial: " + Arrays.toString(numeros));

        // Ordenar el array en orden descendente
        Arrays.sort(numeros, Collections.reverseOrder());

        // Imprimir el array ordenado
        System.out.println("Array ordenado de forma descendente: " + Arrays.toString(numeros));
    }
}
*/

