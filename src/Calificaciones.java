/*En esta actividad, desarrollarás un programa que solicitará al usuario
 ingresar una calificación numérica del 1 al 5. Luego, 
 mostrará en pantalla la calificación correspondiente en letras, 
 utilizando la siguiente escala:

1: "Muy deficiente"

2: "Deficiente"

3: "Suficiente"

4: "Notable"

5: "Sobresaliente" */ 

import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {      
        Scanner notaScanner = new Scanner(System.in);
        System.out.println("Ingrese una calificación del 1 al 5:");
        int calificacion = notaScanner.nextInt();
        notaScanner.close();
        switch (calificacion) {
            case 1:  System.out.println("Muy deficiente"); break;
            case 2:  System.out.println("Deficiente"); break;   
            case 3:  System.out.println("Suficiente"); break;
            case 4:  System.out.println("Notable"); break;
            case 5:  System.out.println("Sobresaliente"); break;
            default: System.out.println("Calificación inválida"); break;
            }
        }
        

    }
    

