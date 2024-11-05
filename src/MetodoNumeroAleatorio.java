
/* 1. Generación de números aleatorios: Basándote en el ejercicio que ya has realizado,
* crea un método "numeroAleatorio()" que no requiera parámetros y devuelva un "int" dentro del rango especificado.

Ejercicio anterior: “Generando números aleatorios” Escribe un programa que genere y muestre en pantalla un número
aleatorio en el rango del 1 al 355 utilizando el método random() de la clase Math.
Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
*/
public class MetodoNumeroAleatorio {

    public static void main(String[] args) {
        int num = numeroAleatorio();
        System.out.printf("El numero aleatorio es: %d", num);
    }

    public static int numeroAleatorio() {
        int numeroAleatorio = (int) Math.floor(Math.random() * 355 + 1);
        return numeroAleatorio;
    }
}
