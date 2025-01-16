/*Contar ocurrencias

Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.

Por ejemplo, si el array contiene la siguiente frase:

a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:

El carácter "d" aparece 2 veces.

Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:

El carácter "z" no aparece en la frase.

 */




// Black IA Vs
/* 
import java.util.Arrays;
import java.util.Scanner;

public class Contandoletras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "Curso Backend de Java con Globant";  
        char[] array = frase.toCharArray();
        System.out.println("Frase: " + Arrays.toString(array));
        System.out.println("Ingrese un carácter: ");
        char objetivo = scanner.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] == objetivo) {
        contador++;
        }
        }
        if (contador > 0) {
        System.out.println("El carácter \"" + objetivo + "\" aparece " + contador +
        " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase .");
            }
            scanner.close();
            }
}
*/


//Chat GPT

import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de 50 caracteres con una frase de ejemplo
        char[] frase = {
            'a', 'p', 'r', 'e', 'n', 'd', 'i', 'e', 'n', 'd', 'o', ' ',
            'j', 'a', 'v', 'a', ' ', 'e', 's', ' ', 'g', 'e', 'n', 'i',
            'a', 'l', '!', ' ', 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'a',
            'r', ' ', 'e', 's', ' ', 'd', 'i', 'v', 'e', 'r', 't', 'i', 'd', 'o'
        };

        // Solicitar al usuario un carácter objetivo
        System.out.print("Ingrese un carácter para buscar: ");
        char caracterObjetivo = scanner.next().charAt(0);

        // Inicializar contador para contar ocurrencias
        int contador = 0;

        // Recorrer el array y contar las ocurrencias del carácter objetivo
        for (int i = 0; i < frase.length; i++) {
            if (frase[i] == caracterObjetivo) {
                contador++;
            }
        }

        // Mostrar el resultado
        if (contador > 0) {
            System.out.println("El carácter \"" + caracterObjetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + caracterObjetivo + "\" no aparece en la frase.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}