/*En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número 
(incluida la lógica en un método llamado pedirNumero())  y luego imprime la tabla de multiplicar
} de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()).
 Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprimir
la tabla de multiplicar correspondiente.*/


import java.util.Scanner;

public class MetTablaMultiplicar {

    public static void main(String[] args) {
        int numero = cualNumero();
        imprimirTablaMultiplicar(numero);
    }

    public static int cualNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número para ver su tabla de multiplicar: ");
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }
    
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
    }
}







/* Black AI
  import java.util.Scanner;

public class MetTablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = pedirNumero(scanner);
        imprimirTablaMultiplicar(numero);
        }
        public static int pedirNumero(Scanner scanner){
            int numero = 0;
            while (true) {
                try {
                    System.out.println("Ingrese un número:");
                    numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("El número ingresado debe ser positivo.");
                        } else {
                            break;
                            }
                            } catch (Exception e) {
                                System.out.println("Error: Debe ingresar un número entero.");
                                scanner.next(); // Limpiar el buffer
                                }
                                }
                                return numero;
                                }
                                public static void imprimirTablaMultiplicar(int numero){
                                    for (int i = 1; i <= 10; i++) {
                                        System.out.println(numero + " x " + i + " = " + (numero * i
                                        ));
                                        }
                                        }
                                        }
                                        
*/