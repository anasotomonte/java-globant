import java.util.Scanner;

public class App {
public static void main(String[] args) {

String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
System.out.print(clear);

/*
* ✏️ Actividad: Validación de contraseña
* Escribe un programa que solicite que ingreses una contraseña y la valide
* utilizando un bucle while. La contraseña correcta es "secreto". Continuará
* pidiéndote que ingreses la contraseña hasta que sea correcta.
*/

String contraValida = "Secreto";
Scanner miScanner = new Scanner(System.in);

System.out.print("por favor ingrese una contraseña: ");
String password = miScanner.nextLine(); //hola

while (!password.equals(contraValida)) { // password != contraValida funciona tambien
System.out.println("contraseña invalida!");

System.out.print("por favor ingrese una contraseña: ");
password = miScanner.nextLine();

}

System.out.println("Contraseña correcta! Ingresando al sistema :)");

}
}