/* Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para 
calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. 
El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras 
de números negativos.*/

import java.util.Scanner;
import java.util.regex.Matcher;

public class CantidadDigitos {
    public static void main(String[] args) {

    String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
    System.out.print(clear);

    Scanner miScanner = new Scanner (System.in);

    System.out.println("Ingrese un númrero entero");
    int numero = miScanner.nextint();
    int cuantosdigitos = 0

    while (numero != 0){
        for numero/10;
        cuantosdigitos++
    }        

    System.out.println("la cantidad de dígitos es: " +cuantosdigitos);

    }






