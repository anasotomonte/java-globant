/*Generando números aleatorios
Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango
del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método 
floor() para redondear el número aleatorio hacia abajo. 

//Para que incluya el 355 se tiene que poner hasta 356

*/

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(1,356);
        System.out.println("El número aleatorio es: " + randomnumber);
    }
}

