
import java.util.Scanner;

public class FibonacciSerie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la posicion del numero en la secuencua de fibonacci");
        int posicion = sc.nextInt();

        int[] fibonacci = new int[posicion];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;

        while (i < posicion) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }

        sc.close();

        for (int z = 0; z < fibonacci.length; z++) {
            System.out.println("Fibonacci en la posicion " + (z + 1) + " es " + fibonacci[z]);
        }

    }
}
