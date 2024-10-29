/*Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals().
El programa debe imprimir si los arreglos son iguales o no.*/


import java.util.Arrays;


public class Arraysequals {
    public static void main(String[] args) {
        

String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
System.out.print(clear);

    //Escribe dos arrays de enteros//
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {1, 2, 3, 4, 5};
    
    //Compara con arrays.Equals si los arrays son iguales
    if(Arrays.equals(array1, array2)){
        
        System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Los arrays no son iguales");
            }
        }
}
