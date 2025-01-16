import java.util.Scanner;

public class PintaCuadrado {

public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese el lado del cuadrado: ");
int numUsu = scanner.nextInt();

scanner.close();

// Dibujamos el cuadrado
for (int i = 0; i < numUsu; i++) {
for (int j = 0; j < numUsu; j++) {
if (i == 0 || i == (numUsu - 1) || j == 0 || j == (numUsu - 1)) {
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
}

