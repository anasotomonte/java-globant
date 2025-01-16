import java.util.Scanner;

public class Validpassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar contraseña al usuario
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar si la contraseña es segura
        if (esContrasenaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si la contraseña es segura
    public static boolean esContrasenaSegura(String contrasena) {
        // Verificar longitud mínima de 8 caracteres
        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        // Recorrer cada carácter de la contraseña para verificar los criterios
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (esCaracterEspecial(c)) {
                tieneCaracterEspecial = true;
            }
        }

        // Verificar si cumple todos los criterios
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
    }

    // Método para verificar si un carácter es un carácter especial
    public static boolean esCaracterEspecial(char c) {
        String caracteresEspeciales = "!@#$%^&*()-+";
        return caracteresEspeciales.contains(String.valueOf(c));
    }
}
// otro método sería asi 

/* import java.util.Scanner;

public class Integrador2Contrasena {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese su nueva contraseña:");
String contrasena = scanner.nextLine();
boolean cLong = contrasena.length() >= 8;
boolean cNum = contrasena.matches(".*[0-9].*+");
boolean cMayus = contrasena.matches(".*[A-Z].*");
boolean cMinus = contrasena.matches(".*[a-z].*");
boolean cSimb = contrasena.matches(".*[!@#$%^&*()_+|\\-=\\[\\]{};:'\",<.>/?].*+");
System.out.println(cLong + " " + cNum + " " + cMayus + " " + cMinus + " " + cSimb);
if (cLong && cNum && cMayus && cMinus && cSimb) {
System.out.println("Su nueva contraseña es segura");
} else {
System.out.println("Su nueva contraseña no es segura");
}
scanner.close();
}
}


U otro método


if(!(password.chars().anyMatch(Character::isUpperCase)
&& password.chars().anyMatch(Character::isLowerCase)
&& password.chars().anyMatch(Character::isDigit)
&& password.chars().anyMatch((c) -> simbols.indexOf(c) >= 0))
)

 */