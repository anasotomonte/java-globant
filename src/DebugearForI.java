
import java.util.Arrays;
import java.util.Scanner;


public class DebugearForI {


    public static void main(String[] args) {
    calcularSuma(arrayAleatorio());
    }
    public static int[] arrayAleatorio(){
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[6];
        int contador = 0;
        int numero;
        for (int i = 0; i < array.length; i++) {
            numero = (int) (Math.random() * 100);
            array[i] = numero;
            if (numero % 2 == 0) {
                contador++;
            }    
        }
        System.out.println("El array es : " + Arrays.toString(array));
        return array;
    }
    
        public static void calcularSuma(int[] numero) {
            int suma = 0;
            for (int i = 0; i < numero.length; i++) {
                suma += numero[i];
            }
            System.out.println("La suma de los números en el array es: " + suma);
        }
            
}


