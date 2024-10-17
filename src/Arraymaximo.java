import java.util.Scanner;

public class Arraymaximo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] enteros = new int[5];
        System.out.println("Ingrese un elemento del array.");
        enteros[0] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[1] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[2] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[3] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[4] = scan.nextInt();

        int maximo = enteros[0];

        if (enteros[1] > maximo) {
            maximo = enteros[1];
        }
        if (enteros[2] > maximo) {
            maximo = enteros[2];
        }
        if (enteros[3] > maximo) {
            maximo = enteros[3];
        }
        if (enteros[4] > maximo) {
            maximo = enteros[4];
        }

        System.out.println("el numero maximo es: " + maximo);
        scan.close();
    }
}
