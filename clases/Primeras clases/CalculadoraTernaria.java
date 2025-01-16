
import java.util.Scanner;

public class CalculadoraTernaria {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Mostrar las operaciones disponibles
        System.out.println("Elige una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        // Leer la opción seleccionada por el usuario
        int opcion = scanner.nextInt();

        // Usar operadores ternarios para realizar la operación seleccionada
        String resultado = (opcion == 1) ? ("Resultado de la suma: " + (num1 + num2)) :
                          (opcion == 2) ? ("Resultado de la resta: " + (num1 - num2)) :
                          (opcion == 3) ? ("Resultado de la multiplicación: " + (num1 * num2)) :
                          (opcion == 4) ? ((num2 != 0) ? ("Resultado de la división: " + (num1 / num2)) : "Error: No se puede dividir por cero.") :
                          "Opción no válida.";

        // Mostrar el resultado
        System.out.println(resultado);

        // Cerrar el scanner
        scanner.close();
    }
}

