import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
       public static void main(String[] args) {

              String clear = "\033\143";
              System.out.print(clear);

/*
               
Escribe un programa que solicite al usuario ingresar una serie de números
enteros. Utiliza un bucle while para contar la cantidad de números pares e
impares ingresados hasta que el usuario decida terminar la entrada de
números. Al finalizar, muestra la cantidad de números pares e impares
ingresados*/
    Scanner miScanner = new Scanner(System.in);
    int par = 0;
    int impar = 0;

              System.out.println("Por favor ingrese un numero distinto a 0");
              int num = miScanner.nextInt();
              while (num != 0) {
                     if (num % 2 == 0) {
                            par++;
                     } else {
                            impar++;
                     }

                     System.out.println("Por favor ingrese un numero distinto a 0 (escribir 0 terminara el prorgama)");
                     num = miScanner.nextInt();
              }

              System.out.println("numeros pares: " + par);
              System.out.println("numeros impares: " + impar);


       }
}