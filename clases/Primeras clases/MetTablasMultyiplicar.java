/*
* En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero()) y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente.
*
*/
import java.util.Scanner;
public class MetTablasMultyiplicar {

static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
imprimirTablaMultiplicar(perdirNumero());
}

public static int[] perdirNumero(){
int [] numbers = new int[3];
System.out.print("Ingresar Numeros: ");
numbers[0] = scan.nextInt();
numbers[1] = scan.nextInt();
numbers[2] = scan.nextInt();
return numbers;

}

public static void imprimirTablaMultiplicar(int[] number) {
for (int i = 0; i < number.length; i++) {
for (int j = 1; j <= 10; j++) {
System.out.println(number[i] + " * " + j + " = " + (j * number[i]));
}
}

}
}