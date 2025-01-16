import java.util.Scanner;

public class Adivinanumero {
public static void main(String[] args) {

String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
System.out.print(clear);

/*
* Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra
* por consola un mensaje pidiéndote que adivines ese número utilizando un bucle
* do-while. El programa te indicará si el número que ingresas es mayor o menor
* que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas
* correctamente.
*/

Scanner miScanner = new Scanner(System.in);
int numAleatorio = (int) (Math.random() * 20 + 1);

int respuesta = 0;

do {
System.out.println("Por favor ingresa un numero entre 1 y 20:");
respuesta = miScanner.nextInt(); // registro la respuesta del usuario
if (respuesta > numAleatorio) {
System.out.println("Tu numero es mayor al elegido por la computadora.");
} else if (respuesta < numAleatorio) {
System.out.println("Tu numero es menor al elegido por la computadora.");

}
} while (respuesta != numAleatorio);

System.out.println("Adivinaste! El numero elegido era: "+ numAleatorio);
miScanner.close();

}
}