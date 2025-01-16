

/*Actividad: Generación de números 
aleatorios
Tu programa debe generar y mostrar 
en pantalla un número aleatorio en 
el rango del 1 al 355 utilizando el 
método random() de la clase Math. 

Crea un método "numeroAleatorio()" 
que no requiera parámetros y devuelva 
un "int" dentro del rango especificado.

Crea una clase para testear esa actividad,
 incluyendo cada uno de los métodos. */

 public class Aleatorios {

    public static void main(String[] args) {
    
        System.out.println("el aleatorio numero es " +numeroAleatorio());
    }
    
    public static int numeroAleatorio(){

        return (int) (Math.random() * 355) + 1;

    }
    
 }