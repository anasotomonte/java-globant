import java.util.InputMismatchException;
import java.util.Scanner;

public class MetodoCalculadora {

public static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
System.out.println("\033\143");
menu("Andres");
scanner.close();
}

public static void menu(String nombre) {
System.out.printf("Hola %s, bienvenido a la calculadora \n\n", nombre);
double num1 = inputDouble("Ingrese el primer numero");
double num2 = inputDouble("Ingrese el segundo numero");
Integer option = null;
do {
System.out.println("Seleccione la operación que desea realizar:");
System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");
System.out.println("4. Dividir");
System.out.print("Ingrese su opción (1-4): ");
option = scanner.nextInt();

switch (option) {
case 1:
System.out.println("Resultado: " + (num1 + num2));
break;
case 2:
System.out.println("Resultado: " + (num1 - num2));
break;
case 3:
System.out.println("Resultado: " + (num1 * num2));
break;
case 4:
if (num2 != 0) {
System.out.println("Resultado: " + (num1 / num2));
} else {
System.out.println("Error: No se puede dividir entre cero.");
}
break;
default:
System.out.println("Opción no válida. Saliendo del programa");
option = null;
break;
}
} while (option != null);
}

static double inputDouble(String message) {
double num;
while (true) {
System.out.print(message + ": ");
try {
num = scanner.nextDouble();
scanner.nextLine();
return num;
} catch (InputMismatchException e) {
System.out.println("por favor ingrese un numero");
scanner.nextLine();
}
}
}
}



}
