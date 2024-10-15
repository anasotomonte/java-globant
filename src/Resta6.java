import java.util.Scanner;

public class Resta6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese el primer número
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();

            // Solicitar al usuario que ingrese el segundo número
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            // Realizar la resta
            double resultado = num1 - num2;

            // Mostrar el resultado de la resta
            System.out.println("El resultado de la resta es: " + resultado);

        } catch (Exception e) {
            // Capturar cualquier excepción si el usuario no ingresa un número válido
            System.out.println("Error: Debes ingresar un número válido.");
        } finally {
            // Cerrar el objeto Scanner
            scanner.close();
        }
    }
}