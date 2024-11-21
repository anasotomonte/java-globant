import java.util.ArrayList;

public class Bubbleexample {
    public static void main(String[] args) {
        // CASO 1: MANEJO DE ARREGLO ESTÁTICO
        // Agrego info al arreglo de manera predeterminada
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array antes de ordenar:");
        printArray(arr);// Imprimo el arreglo inicial
        bubbleSort(arr);// Invoco al método de ordenamiento
        System.out.println("\nArray ordenado:");
        printArray(arr); // Imprimo el arreglo ya ordenado
        // CASO 2: MANEJO DE ARREGLO DINÁMICO
        // Agrego info al Array de manera predeterminada
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(34);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);
        list.add(90);
        System.out.println("\nArrayList antes de ordenar:");
        printArrayList(list); // Imprimo el arreglo inicial
        bubbleSort(list);// Invoco al metodo de ordenamiento
        System.out.println("\nArrayList ordenado:");
        printArrayList(list);// Imprimo el arreglo ya ordenado
    }

    // Ordenamiento Burbuja para arreglos estáticos (int[])
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Ordenamiento Burbuja para listas dinámicas (ArrayList<Integer>)
    static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // Método para imprimir arreglos
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Método para imprimir ArrayList
    static void printArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}