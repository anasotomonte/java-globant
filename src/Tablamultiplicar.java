
import java.util.Scanner;

/*Escribe un programa que solicite al usuario un número entero y muestre la tabla de
 multiplicar de ese número utilizando un bucle while. El programa debe seguir solicitando 
 números hasta que el usuario ingrese un valor igual a cero, en cuyo caso debería 
salir del bucle. */




public class Tablamultiplicar {
public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);

    System.out.println("Ingrese un número entero ");
        int num = miScanner.nextInt();

        while (num != 0){
            for(int i = 1; i < 13; i++){
                int resultado = num * i;
                System.out.println( num+ "x" +i +" = " +resultado);
                
            }
            System.out.println("Ingrese un número entero ");
            num = miScanner.nextInt();

        }
        System.out.println("Finalizó el programa ");

}    
}
