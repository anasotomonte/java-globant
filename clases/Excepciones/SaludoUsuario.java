

/*Actividad: Saludo al usuario
Para completar esta actividad, debes desarrollar un programa que 
salude a las personas por consola. Sigue estos pasos:


Crea una clase con un método main que llame a otro método encargado 
}de solicitar al usuario su nombre y luego imprima un saludo en 
pantalla.

Este método deberá lanzar una excepción si el nombre ingresado por
el usuario tiene menos de 2 caracteres.

Utiliza el bloque "finally" para asegurarte de cerrar el Scanner 
después de usarlo. */

import java.util.Scanner;
public class SaludoUsuario {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            solicitarNombre(sc);  
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Cerramos el Scanner");
            sc.close();
        }
    }

    //Metodo que solicita el nombre al usuario
    public static void solicitarNombre(Scanner sc){
        
        
        System.out.println("Ingrese su nombre de usuario");
        String nombre = sc.nextLine();
        
        if (nombre.length()<2) 
        throw new IllegalArgumentException("Ingrese un nombre con al menos tres caracteres");
        
        System.out.println("Hola " +nombre +" Bienvenido ");

    }
}
