//Metodo de Pedro parecido a Pseint

import java.util.Scanner;

public class CalculadoraEnteros {
public static void main(String[] args) {

/*Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
Declara una variable para almacenar el resultado de la operación.
Permite al usuario elegir qué operación quiere realizar.
Muestra el resultado de la operación en la consola. */

//Las variables que necesitamos en numeros enteros, en decimales da error
int num1 , num2, resultado, operacion;

Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora");
System.out.println("Ingresa el primer numero");
num1 = scanner.nextInt();
System.out.println("Ingresa el segundo numero");
num2 = scanner.nextInt();

System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");
System.out.println("4. Dividir");

System.out.println("Ingrese el numero de la opcion del calculo a realizar: ");
operacion = scanner.nextInt();

//hacer las operaciones con el ternario ( condición ? [si se cumple] : [no se cumple])
//aveces los ":" se pueden poner al final de la linea (quieren decir sino)
resultado = operacion == 1 ? num1 + num2
: operacion == 2 ? num1 - num2
: operacion == 3 ? num1 * num2
: operacion == 4 ? (num2 != 0 ? num1 / num2 : 0)
: 0;

System.out.println("El resultado es: " + resultado);
}
}