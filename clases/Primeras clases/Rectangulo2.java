import java.util.ArrayList;
import java.util.Scanner;

public class Rectangulo {
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    // Constructor que inicializa ancho y alto y aumenta el contador de rectángulos
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    // Método para calcular el área
    public double area() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir el área
    public void imprimirArea() {
        System.out.println("Área del rectángulo: " + area());
    }

    // Método para imprimir el perímetro
    public void imprimirPerimetro() {
        System.out.println("Perímetro del rectángulo: " + perimetro());
    }

    // Método estático para obtener el número total de rectángulos creados
    public static int obtenerTotalRectangulos() {
        return contadorRectangulos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangulo> rectangulos = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- Menú de Rectángulos ---");
            System.out.println("1. Crear un nuevo rectángulo");
            System.out.println("2. Ver área de un rectángulo");
            System.out.println("3. Ver perímetro de un rectángulo");
            System.out.println("4. Ver total de rectángulos creados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    rectangulos.add(rectangulo);
                    System.out.println("Rectángulo creado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el índice del rectángulo para ver su área (comenzando en 0): ");
                    int indiceArea = scanner.nextInt();
                    if (indiceArea >= 0 && indiceArea < rectangulos.size()) {
                        rectangulos.get(indiceArea).imprimirArea();
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el índice del rectángulo para ver su perímetro (comenzando en 0): ");
                    int indicePerimetro = scanner.nextInt();
                    if (indicePerimetro >= 0 && indicePerimetro < rectangulos.size()) {
                        rectangulos.get(indicePerimetro).imprimirPerimetro();
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 4:
                    System.out.println("Total de rectángulos creados: " + Rectangulo.obtenerTotalRectangulos());
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}