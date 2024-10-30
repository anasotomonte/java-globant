/*Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, 
imprime una representación visual de estos números en forma de gráfico de barras utilizando
 asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico, 
 donde cada */

import java.util.Scanner;

public class AsteriscosNumero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 4 números enteros positivos");
        
        int[] array =new int[4];
        for (int index = 0; index < array.length; index++) {
        array[index]= sc.nextInt();
        }
        sc.close();

        for (int  num : array) {
            System.out.println(num + "*".repeat(num) );
        } 
    }
    
}
