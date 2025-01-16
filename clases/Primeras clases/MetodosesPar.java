/*. Es par: Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()" 
que no reciba parámetros y devuelva un entero. También reemplaza la condición del if por un 
método llamado "esPar()" que reciba por parámetro un entero y devuelva un booleano.

 */
import java.util.Scanner;

public class MetodosesPar {

    public static Scanner pepe = new Scanner(System.in);
        
    public static Integer solicitarNumero(){
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        return numero;
    }

public static Boolean esPar(Integer numero){
boolean resultado = numero % 2 == 0;
return resultado;

}

    public static void main(String[] args) {
        
        Integer numero = solicitarNumero();
        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
            
        }
        else{
            System.out.println("el numero no es par");
        } 
    }

}
