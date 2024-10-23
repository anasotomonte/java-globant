
/*Escribe un programa que genere un array de 10 elementos de tipo 
entero. Inicializa cada elemento con un número aleatorio menor a 100 y 
luego imprime todos los elementos del array en una única línea. 
Posteriormente, recorre el array para contar los elementos pares y 
muestra el total en la consola. */

public class PairElements {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (i == 9) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("");

        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("La cantidad de pares es : " + count);
    }

}
