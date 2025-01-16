import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimos {
public static void main(String[] args) {
boolean isValidNumber;
int numUsu = 0;
Scanner scanner = new Scanner(System.in);
try {
do {
isValidNumber = false;
try {
System.out.print("Ingrese el total de números primos que desea obtener: ");
numUsu = Integer.parseInt(scanner.nextLine());
if (numUsu < 1) {
System.out.println("Valor inválido, solo se aceptan números enteros positivos, inténtelo nuevamente");
} else {
isValidNumber = true;
}
} catch (NumberFormatException e) {
System.out.println("Valor inválido, solo se aceptan números enteros, inténtelo nuevamente");
}
} while (!isValidNumber);

// Calculamos los números primos
int[] primos = new int[numUsu];
int initNum = 2, countPrimos = 0;
boolean isPrimo;
do {
isPrimo = true;
// validamos si es un número primo
for (int i = 2; i <= Math.sqrt(initNum); i++) {
if (initNum % i == 0) {
isPrimo = false;
break;
}
}
if (isPrimo) {
primos[countPrimos] = initNum;
countPrimos++;
}
initNum++;
} while (numUsu > countPrimos);

if (numUsu == 1) {
System.out.println("El primer número primo es: "+Arrays.toString(primos));
} else {
System.out.println("Los "+numUsu+" primeros números primos son: "+Arrays.toString(primos));
}


} catch (Exception e) {
System.out.println();
System.out.println("Ocurrió un error. "+e);
} finally {
scanner.close();
}
}
}