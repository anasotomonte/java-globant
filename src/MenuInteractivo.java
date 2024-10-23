import java.util.Scanner;
import java.util.regex.Matcher;

public class MenuInteractivo {
    public static void main(String[] args) {

    String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
    System.out.print(clear);

    boolean condicion = true;
Scanner miScanner = new Scanner(System.in); // para que el usuario elija una opcion
    while(condicion)
    {
        System.out.println("----Menu Principal----");
        System.out.println("1-Comprar producto");
        System.out.println("2-Realizar devolucion");
        System.out.println("3-Ver mis pedidos");
        System.out.println("4-Preguntas frecuentes");
        System.out.println("5-Salir");
        System.out.println("Por favor elija una opcion: ");
        int opcion = miScanner.nextInt(); // atrapar la opcion del usuario
        switch (opcion) {
            case 1:
                System.out.println("Realizaste una compra!");
                break;
            case 2:
                System.out.println("Realizaste una devolucion!");
                break;
            case 3:
                System.out.println("Mostrando pedidos!");
                break;

            case 4:
                System.out.println("Mostrando preguntas frencuentes!");
                break;

            case 5:
                condicion = false;
                break;

            default:
                System.out.println("opcion no valida!por favor intente nuevamente");
                break;
        }

}

System.out.println("Saliste del menu, gracias por venir :)");miScanner.close();
}


/* 
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0; // Inicialización de la opción elegida por el usuario

        // Bucle que continuará hasta que el usuario elija salir
        while (opcion != 5) {
            // Mostrar el menú de opciones
            System.out.println("\nMenú interactivo:");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Comprobar la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción: Comprar producto.");
                    break;
                case 2:
                    System.out.println("Has elegido la opción: Realizar devolución.");
                    break;
                case 3:
                    System.out.println("Has elegido la opción: Ver mis pedidos.");
                    break;
                case 4:
                    System.out.println("Has elegido la opción: Preguntas frecuentes.");
                    break;
                case 5:
                    System.out.println("Has elegido la opción: Salir. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
            }
        }
        // Cerrar el scanner
        scanner.close();
    }
}

*/
/* 
Explicación del código:
Bucle while:
El bucle while continúa ejecutándose mientras el usuario no elija la opción 5 (Salir). El valor de la variable opcion se actualiza cada vez que el usuario selecciona una opción.

Menú interactivo:
Se imprime el menú en cada iteración del bucle para que el usuario vea las opciones disponibles. El usuario ingresa su opción y esta se captura con scanner.nextInt().

Estructura switch:
La estructura switch evalúa el valor de la opción ingresada por el usuario y ejecuta el código correspondiente. Si elige una opción válida, se imprime el mensaje asociado; si elige una opción fuera de las válidas, se muestra un mensaje de error.

Salida del programa:
El programa finaliza cuando el usuario elige la opción 5 (Salir), mostrando un mensaje de despedida.

Ejemplo de ejecución:
markdown
Copy code
Menú interactivo:
1. Comprar producto
2. Realizar devolución
3. Ver mis pedidos
4. Preguntas frecuentes
5. Salir
Elige una opción: 1
Has elegido la opción: Comprar producto.

Menú interactivo:
1. Comprar producto
2. Realizar devolución
3. Ver mis pedidos
4. Preguntas frecuentes
5. Salir
Elige una opción: 5
Has elegido la opción: Salir. ¡Hasta luego!
Este programa cumple con lo que solicitaste y proporciona un menú interactivo hasta que el usuario elige salir. 

