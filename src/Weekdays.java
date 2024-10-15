/*En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7,
que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día.
Utilizaremos la estructura "switch" para implementar este programa.*/

import java.util.Scanner;
    public class Weekdays {

        public static void main(String[] args) {
            Scanner myscanner = new Scanner(System.in);

            System.out.println("Ingresa un número del 1 al 7");
                int diaDelaSemana=myscanner.nextInt();
                String dia;
                dia=switch (diaDelaSemana){
                    case 1 -> "Hoy es Lunes";
                    case 2 -> "Hoy es Martes";
                    case 3 -> "Hoy es Miércoles";
                    case 4 -> "Hoy es Jueves";
                    case 5 -> "Hoy es Viernes";
                    case 6 -> "Hoy es Sábado";
                    case 7 -> "Hoy es Domingo";
                    default -> "no es una opción válida";
                };
            System.out.println(dia);
                       myscanner.close();
        }

}
