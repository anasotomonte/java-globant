import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica para calcular su área:");
        System.out.println("1: Círculo\n2: Cuadrado\n3: Triángulo");
        System.out.print("Ingrese un número del 1 al 3: ");
        int option = scanner.nextInt();

        double area = switch (option) {
            case 1 -> {
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                yield Math.PI * radio * radio;
            }
            case 2 -> {
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                yield lado * lado;
            }
            case 3 -> {
                System.out.print("Ingresa la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double altura = scanner.nextDouble();
                yield (base * altura) / 2;
            }
            default -> {
                System.out.println("Opción no válida");
                yield 0;
            }
        };
        System.out.println("El área de la figura es: " + area);
        scanner.close();
    }
}
