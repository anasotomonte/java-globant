/* En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
Si la puntuación está entre 90 y 100, se mostrará "A".
Si la puntuación está entre 80 y 89, se mostrará "B".
Si la puntuación está entre 70 y 79, se mostrará "C".
Si la puntuación está entre 60 y 69, se mostrará "D".
Si la puntuación es menor a 60, se mostrará "F".
Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
El programa mostrará en la consola el valor de la calificación obtenida. */


import   java.util.Scanner;

public class notesABFD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una nota entre entre 0 y 100");
        double nota = scanner.nextInt();

        if (nota  >= 0 && nota <= 100) {
            if (nota >= 90 && nota <= 100) {
                System.out.println("Nota A");
                } else if (nota >= 80 && nota < 90) {
                    System.out.println("Nota B");
                    } else if (nota >= 70 && nota < 80) {
                        System.out.println("Nota C");
                        } else if (nota >= 60 && nota < 70) {
                            System.out.println("Nota D");
                            } else {
                                System.out.println("Nota F");
                                }
                                } 
        else {
            System.out.println("Nota fuera de rango");
        }
        scanner.close();
    }
}





