/*Escribe un programa que recorra un array de enteros y encuentre el valor 
mínimo presente en el array. El tamaño y los números  a contener pueden 
ser de tu elección.*/

//Mi solución:

public class ValorMinimoArray{
    public static void main(String[] args) {
        //Escribir e inicializar el array
        int[] notas = { 9, 7, 6, 5, 3, 10, 9, 8, 7 };
        //Escribir el bucle for que encuentre la nota mas baja comprarandolas

        int masbaja = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < masbaja) {
                masbaja = notas[i];
            }
        }
        System.out.println("La nota mas baja es : " +masbaja);
    }
}











//Black IA VS
/* 
public class ValorMinimoArray {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 9, 3, 7, 4, 6, 10 };
        
        int minimo = array [0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
            minimo = array[i];
            }
            }
            System.out.println("El valor mínimo del array es : " +minimo);
        }
}

*/





// ChatGPT
/*
 * public class ValorMinimoArray {
 * public static void main(String[] args) {
 * // Declaración e inicialización de un array de enteros
 * int[] numeros = {25, 14, 7, 30, 5, 42, 19};
 * 
 * // Suponemos que el primer elemento es el valor mínimo
 * int valorMinimo = numeros[0];
 * 
 * // Recorremos el array para encontrar el valor mínimo
 * for (int i = 1; i < numeros.length; i++) {
 * if (numeros[i] < valorMinimo) {
 * valorMinimo = numeros[i]; // Actualizamos el valor mínimo si encontramos uno
 * menor
 * }
 * }
 * 
 * // Mostrar el valor mínimo
 * System.out.println("El valor mínimo en el array es: " + valorMinimo);
 * }
 * }
 * 
 * Explicación del código:
 * Declaración e inicialización del array:
 * El array numeros contiene los valores {25, 14, 7, 30, 5, 42, 19}.
 * 
 * Asignación del valor mínimo inicial:
 * Asumimos que el primer elemento del array (numeros[0]) es el valor mínimo.
 * Luego, lo comparamos con los demás elementos.
 * 
 * Bucle for:
 * Se recorre el array comenzando desde el segundo elemento (índice 1). Si se
 * encuentra un número menor que el actual valor mínimo, este se actualiza.
 * 
 * Mostrar el resultado:
 * Al finalizar el recorrido del array, se imprime el valor mínimo encontrado.
 * 
 * Salida esperada:
 * 
 * Terminal:
 * 
 * El valor mínimo en el array es: 5
 */
