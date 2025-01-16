import java.util.Scanner;

public class Divisiontrycatch {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese el primer número
            System.out.print("Introduce el primer número entero: ");
            int num1 = scanner.nextInt();

            // Pedir al usuario que ingrese el segundo número
            System.out.print("Introduce el segundo número entero: ");
            int num2 = scanner.nextInt();

            // Intentar realizar la división
            int resultado = num1 / num2;

            // Mostrar el resultado
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturar la excepción de división por cero y mostrar un mensaje
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            // Cerrar el objeto Scanner
            scanner.close();
        }
    }
}