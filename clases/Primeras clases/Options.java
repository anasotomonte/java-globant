/*En esta actividad, vas a desarrollar un programa que mostrará un menú con 
las siguientes opciones:

Opción 1: "Guardar"

Opción 2: "Cargar"

Opción 3: "Salir"

El programa solicitará al usuario que ingrese un número del 1 al 3 
para seleccionar una opción. 

Utilizarás la estructura "switch" para implementar este programa y 
mostrar en pantalla el mensaje correspondiente a la opción seleccionada. */

import java.util.Scanner;

    public class Options{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int option;
            System.out.println("Opción 1: Guardar");
            System.out.println("Opción 2: Cargar");
            System.out.println("Opción 3: Salir");
            System.out.println("Ingrese una opción:");
            option = scanner.nextInt();
            System.out.println( switch (option) {
                case 1->"Guardado";
                case 2->"Cargado";
                case 3->"Saliendo";
                default-> "No es una opción";
                });
                scanner .close();
            }
        }
    
            

            
