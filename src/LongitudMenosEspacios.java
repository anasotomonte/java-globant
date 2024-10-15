import java.util.Scanner;

public class LongitudMenosEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();

        String textoSinEspacios = texto.replace(" ", "");

        int longitudSinEspacios = textoSinEspacios.length();

        System.out.println("La longitud de la cadena sin contar los espacios es: " + longitudSinEspacios);

        scanner.close();
    }
}