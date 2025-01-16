/* Escribe un programa que recorra un array de enteros y muestre 
cada elemento en una línea separada. El tamaño, tipo de datos y 
la información a contener pueden ser de tu elección. */

public class PritingElements {
    public static void main(String[] args) {
        // definimos el array de enteros
        int[] numeros = { 5, 68, 20, 3, 16 };
        // hacemos ciclo recorriendo el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " con indice " + i);
        }

    }

}
