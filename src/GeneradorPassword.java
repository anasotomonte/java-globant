import java.util.Scanner;

public class GeneradorPassword {
    public static void main(String[] args) {
        String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
        System.out.print(clear);
        System.out.println("GENERADOR DE CONTRASEÑAS");
        try (Scanner scanner = new Scanner(System.in)) {
            boolean tieneMayus = false;
            boolean tieneMinus = false;
            boolean tieneNum = false;
            System.out.print("Indica la longitud de la contraseña: ");
            int sizePassword = scanner.nextInt();
            char[] passwordArray = new char[sizePassword];

            for (int idx = 0; idx < passwordArray.length; idx++) {
                passwordArray[idx] = generateChar();
            }

            do {
                for (int idx = 0; idx < passwordArray.length; idx++) {
                    if (Character.isUpperCase(passwordArray[idx])) {
                        tieneMayus = true;
                    } else if (Character.isLowerCase(passwordArray[idx])) {
                        tieneMinus = true;
                    } else if (Character.isDigit(passwordArray[idx])) {
                        tieneNum = true;
                    }
                }

                if (!tieneMayus) {
                    int opcion = (int) (Math.random() * passwordArray.length);
                    do {
                        passwordArray[opcion] = generateChar();
                    } while (Character.isUpperCase(passwordArray[opcion]));
                }

                if (!tieneMinus) {
                    int opcion = (int) (Math.random() * passwordArray.length);
                    do {
                        passwordArray[opcion] = generateChar();
                    } while (Character.isUpperCase(passwordArray[opcion]));
                }
                if (!tieneNum) {
                    int opcion = (int) (Math.random() * passwordArray.length);
                    do {
                        passwordArray[opcion] = generateChar();
                    } while (Character.isDigit(passwordArray[opcion]));
                }
            } while (!tieneMayus && !tieneMinus && !tieneNum);

            System.out.println("Contraseña generada");

            String password = "";
            for (int idx = 0; idx < passwordArray.length; idx++) {
                password = password.concat(Character.toString(passwordArray[idx]));

            }

            System.out.println("La contraseña generada es: " + password);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static char generateChar() {
        // Caracteres a incluir:
        // 48-57 -> 0-9
        // 65-90 A-Z
        // 97-122 a-z
        char randomChar;
        int opcion = (int) (Math.random() * 3); // 3 excluido

        switch (opcion) {
            case 0 -> randomChar = (char) (48 + Math.random() * (57 - 48 + 1));
            case 1 -> randomChar = (char) (65 + Math.random() * (90 - 65 + 1));
            default -> randomChar = (char) (97 + Math.random() * (122 - 97 + 1));

        }

        return randomChar;
    }
}