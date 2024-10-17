/*1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).

2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.

De Celsius a Fahrenheit	De Fahrenheit a Celsius
[°F] = ([°C] × 9 ⁄ 5) + 32	[°C] = ([°F] − 32) × 5 ⁄ 9
3. El programa debe manejar al menos las siguientes situaciones:

Si ingresa una unidad de medida inválida, mostrará un mensaje de error.

Si ingresa una temperatura no válida, mostrará un mensaje de error.*/



import java.util.Scanner;

public class TemperaturaCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Ingrese una Temperatura ");
            double Temp = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Ingrese la unidad de Temperatura °C o °F ");
            String unidad = sc.nextLine().toUpperCase();

            if (unidad.equals("C")) {
                double fahrenheit = (Temp * 9 / 5) + 32;
                System.out.printf("Su temperatura en grados Fahrenheit es: " + fahrenheit + " °F ");

            } else if (unidad.equals("F")) {
                double celcius = (Temp - 32) * 5 / 9;
                System.out.printf("Su temperatura en grados Celcius es: " + celcius + " °C ");


            } else if (unidad != "C" && unidad != "F") {
                System.out.println("La unidad de temperatura ingresada no es valida.");

            }}

        catch(Exception e )
            {
                System.out.printf("Usted no ingreso una temperatura válida");

            }
            sc.close();

    }
}



