import java.util.Scanner;

public class espaciosblancos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa una palabra con espacios al final o al comienzo: ");
        String Palabra = scanner.nextLine();
        String PalabraSinEspacios = Palabra.trim();
        System.out.println("La Palabra sin espacios es: \"" + PalabraSinEspacios + "\"");
        scanner.close();
    }
}    