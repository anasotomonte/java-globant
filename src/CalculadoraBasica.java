899//Metodo de Jymmy

import java.util.Scanner;

public class CalculadoraBasica {
public static void main(String[] args) {
// Crear un objeto Scanner para leer la entrada del usuario
Scanner scanner = new Scanner(System.in);

// Solicitar al usuario que ingrese dos números
System.out.print("Ingresa el primer número: ");
double numero1 = scanner.nextDouble();

System.out.print("Ingresa el segundo número: ");
double numero2 = scanner.nextDouble();

// Solicitar al usuario que elija una operación
System.out.print("Elige una operación (+, -, *, /): ");
char operacion = scanner.next().charAt(0);

// Declarar una variable para almacenar el resultado y utilizar operador ternario para cada operación
double resultado = (operacion == '+') ? (numero1 + numero2) :
(operacion == '-') ? (numero1 - numero2) :
(operacion == '*') ? (numero1 * numero2) :
(operacion == '/' && numero2 != 0) ? (numero1 / numero2) : Double.NaN;

// Mostrar el resultado en la consola
String mensaje = (Double.isNaN(resultado)) ? "Error: división por cero o operación inválida." : "El resultado es: " + resultado;
System.out.println(mensaje);

// Cerrar el objeto Scanner
scanner.close();
}
}
