import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] enteros = new int[6];
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
        System.out.println("Ingrese un elemento del array.");
        enteros[5] = scan.nextInt();
        int pares = 0;

        if (enteros[0] % 2 == 0) {
            pares++;
        }
        if (enteros[1] % 2 == 0) {
            pares++;
        }
        if (enteros[2] % 2 == 0) {
            pares++;
        }
        if (enteros[3] % 2 == 0) {
            pares++;
        }
        if (enteros[4] % 2 == 0) {
            pares++;
        }
        if (enteros[5] % 2 == 0) {
            pares++;
        }

        System.out.println("La cantidad de numeros pares en el array es: " + pares);
        scan.close();

    }
}
