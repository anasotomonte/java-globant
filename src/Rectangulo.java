/*Actividad: Trabajando con una figura geométrica
Crea una clase llamada Rectangulo

Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.(double)

Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y que lleve 
un registro del número total de instancias de 'Rectangulo' creadas.

Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y 
que incremente en uno el valor de 'contadorRectangulos'. 

Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables
 de calcular el área y el perímetro del rectángulo, respectivamente.

Implementa un método llamado imprimirArea para mostrar el resultado por consola;

Implementa un método llamado imprimirPerimetro para mostrar el resultado por consola;

Implementa un método estático que permita obtener el número total de rectángulos creados 
hasta el momento.

Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' 
y acceder a sus métodos para obtener información relevante.

📌 Sugerencia: Utiliza un arreglo de rectángulos para guardar las instancias de la clase 
“Rectángulo” creadas. */

//Crea una clase llamada Rectangulo
public class Rectangulo {
    // Definir dos atributos para la clase Rectangulo Ancho y Alto
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    // Diseña un constructor con argumentos que inicialice los valores del 'ancho' y
    // 'alto', y
    // que incremente en uno el valor de 'contadorRectangulos'.

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    // Implementa un método llamado 'area()' y otro método llamado 'perimetro()',
    // responsables
    // de calcular el área y el perímetro del rectángulo, respectivamente.

    //Generar Getters and setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public static int getContadorRectangulos() {
        return contadorRectangulos;
    }

    public static void setContadorRectangulos(int contadorRectangulos) {
        Rectangulo.contadorRectangulos = contadorRectangulos;
    }

    // Metodo para calcular el aera
    public double area() {
        return ancho * alto;
    }

    // Metodo para calcular el perimetro
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Implementa un método llamado imprimirArea para mostrar el resultado por
    // consola;

    public void imprimirArea() {
        System.out.println("El área del rectangulo es: " + area());
    }
    // Implementa un método llamado imprimirPerimetro para mostrar el resultado por
    // consola;

    public void imprimirPerimetro() {
        System.out.println("El perímetro del rectangulo es: " + perimetro());
    }

    // Implementa un método estático que permita obtener el número total de
    // rectángulos creados
    // hasta el momento.

    public static int totalRectangulosCreados() {
        return contadorRectangulos;
    }

}


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Rectangulo> rectangulos = new ArrayList<>();

    int option;
    do {
        System.out.println("1.  Crea un rectangulo");
        System.out.println("2.  Calcula el area del rectangulo");
        System.out.println("3.  Calcula el perímetro del rectangulo");
        System.out.println("4.  Numero de rectangulos creados");
        System.out.println("5.  Salir del programa");
        System.out.println("Que opción eliges?");
        option = scanner.nextInt();

        switch (option) {
            case 1:
            System.out.println("Ingrese ancho del rectangulo: ");
            double ancho = scanner.nextDouble();
            System.out.println("Ingrese el alto del rectangulo");
            double alto = scanner.nextDouble();
            


                
                break;
            default:
                throw new AssertionError();
        }

        




    }


}
/*
 * Chat GPT
 * 
 * import java.util.ArrayList;
 * import java.util.Scanner;
 * 
 * public class Rectangulo {
 * private double ancho;
 * private double alto;
 * private static int contadorRectangulos = 0;
 * 
 * // Constructor que inicializa ancho y alto y aumenta el contador de
 * rectángulos
 * public Rectangulo(double ancho, double alto) {
 * this.ancho = ancho;
 * this.alto = alto;
 * contadorRectangulos++;
 * }
 * 
 * // Método para calcular el área
 * public double area() {
 * return ancho * alto;
 * }
 * 
 * // Método para calcular el perímetro
 * public double perimetro() {
 * return 2 * (ancho + alto);
 * }
 * 
 * // Método para imprimir el área
 * public void imprimirArea() {
 * System.out.println("Área del rectángulo: " + area());
 * }
 * 
 * // Método para imprimir el perímetro
 * public void imprimirPerimetro() {
 * System.out.println("Perímetro del rectángulo: " + perimetro());
 * }
 * 
 * // Método estático para obtener el número total de rectángulos creados
 * public static int obtenerTotalRectangulos() {
 * return contadorRectangulos;
 * }
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * ArrayList<Rectangulo> rectangulos = new ArrayList<>();
 * 
 * int opcion;
 * do {
 * System.out.println("\n--- Menú de Rectángulos ---");
 * System.out.println("1. Crear un nuevo rectángulo");
 * System.out.println("2. Ver área de un rectángulo");
 * System.out.println("3. Ver perímetro de un rectángulo");
 * System.out.println("4. Ver total de rectángulos creados");
 * System.out.println("5. Salir");
 * System.out.print("Seleccione una opción: ");
 * opcion = scanner.nextInt();
 * 
 * switch (opcion) {
 * case 1:
 * System.out.print("Ingrese el ancho del rectángulo: ");
 * double ancho = scanner.nextDouble();
 * System.out.print("Ingrese el alto del rectángulo: ");
 * double alto = scanner.nextDouble();
 * Rectangulo rectangulo = new Rectangulo(ancho, alto);
 * rectangulos.add(rectangulo);
 * System.out.println("Rectángulo creado exitosamente.");
 * break;
 * 
 * case 2:
 * System.out.
 * print("Ingrese el índice del rectángulo para ver su área (comenzando en 0): "
 * );
 * int indiceArea = scanner.nextInt();
 * if (indiceArea >= 0 && indiceArea < rectangulos.size()) {
 * rectangulos.get(indiceArea).imprimirArea();
 * } else {
 * System.out.println("Índice no válido.");
 * }
 * break;
 * 
 * case 3:
 * System.out.
 * print("Ingrese el índice del rectángulo para ver su perímetro (comenzando en 0): "
 * );
 * int indicePerimetro = scanner.nextInt();
 * if (indicePerimetro >= 0 && indicePerimetro < rectangulos.size()) {
 * rectangulos.get(indicePerimetro).imprimirPerimetro();
 * } else {
 * System.out.println("Índice no válido.");
 * }
 * break;
 * 
 * case 4:
 * System.out.println("Total de rectángulos creados: " +
 * Rectangulo.obtenerTotalRectangulos());
 * break;
 * 
 * case 5:
 * System.out.println("Saliendo del programa...");
 * break;
 * 
 * default:
 * System.out.println("Opción no válida, intente de nuevo.");
 * break;
 * }
 * } while (opcion != 5);
 * 
 * scanner.close();
 * }
 * }
 * 
 */