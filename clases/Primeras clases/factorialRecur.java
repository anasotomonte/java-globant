import java.util.Scanner;

public class factorialRecur {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
        System.out.print(clear);
        System.out.println("Ingrese un numero");
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int numero) {

        if (numero == 1) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}

/*
 * public class MetodosFactorial {
 * 
 * public static int factorial(int n) {
 * // Caso base: si n es 0, retorna 1
 * if (n == 0) {
 * return 1;
 * } else {
 * // Caso recursivo: n * factorial(n - 1)
 * return n * factorial(n - 1);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de
 * programa
 * System.out.print(clear);
 * int numero = 5;
 * System.out.println("El factorial de " + numero + " es: " +
 * factorial(numero));
 * }
 * }
 * 
 */
