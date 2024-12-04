/* Actividad: Division Segura
Escribe un programa que pida al usuario que ingrese dos números enteros
 y realice la división del primer número entre el segundo número.

Invocar un método llamado “obtenerNumerador()” que solicite el número 
por el cual se desea dividir.

Este método, "obtenerNumerador()", verificará que ingreses un número 
distinto de 0. Si ingresas 0, el método lanzará una excepción que será 
controlada por el método que lo invocó. */


import java.util.Scanner;

public class DivisionSegura {
static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {

try {
System.out.print("Ingrese el numerador ");
int numerador = Integer.valueOf(scanner.nextLine());
System.out.print("Ingrese el denominador: ");
int denominador = obtenerDenominador();

System.out.printf("%d / %d = %d", numerador, denominador, (numerador / denominador));

} catch (Exception e) {
System.out.println(e.getMessage());
}

}

public static int obtenerDenominador() throws Exception {

int denominador = Integer.valueOf(scanner.nextLine());

if (denominador == 0) {
throw new Exception("El denominador no puede ser 0");
}

return denominador;
}

}

SEND TO
