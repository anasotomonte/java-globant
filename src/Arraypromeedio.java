import java.util.Scanner;

public class Arraypromeedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] enteros = new int[4];
        System.out.println("Ingrese un elemento del array.");
        enteros[0] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[1] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[2] = scan.nextInt();
        System.out.println("Ingrese un elemento del array.");
        enteros[3] = scan.nextInt();

        System.out.println("El resultado es: " + ((enteros[0] + enteros[1] + enteros[2] + enteros[3]) / 4));
        scan.close();
    }
}
