import java.util.Scanner;

public class ArrayordenABC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[4];
        System.out.println("Ingrese un nombre: ");
        array[0] = scanner.nextLine();
        System.out.println("Ingrese un nombre: ");
        array[1] = scanner.nextLine();
        System.out.println("Ingrese un nombre: ");
        array[2] = scanner.nextLine();
        System.out.println("Ingrese un nombre: ");
        array[3] = scanner.nextLine();

        String aux = "";

        if (array[0].compareToIgnoreCase(array[3]) > 0) {
            aux = array[3];
            array[3] = array[0];
            array[0] = aux;
        }
        if (array[1].compareToIgnoreCase(array[2]) > 0) {
            aux = array[2];
            array[2] = array[1];
            array[1] = aux;
        }
        if (array[0].compareToIgnoreCase(array[1]) > 0) {
            aux = array[1];
            array[1] = array[0];
            array[0] = aux;

        }
        if (array[2].compareToIgnoreCase(array[3]) > 0) {
            aux = array[3];
            array[3] = array[2];
            array[2] = aux;
        }
        scanner.close();
        System.out.println("");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
