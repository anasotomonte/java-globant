import java.util.Scanner;

public class MetodoCalificaciones {
    public static void main(String[] args) {

        int puntuacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu puntuacion, que debe de ser entre 0 y 100");
        puntuacion = sc.nextInt();

        if (puntuacion >= 0 && puntuacion <= 100) {
            System.out.println("Tu nota es: " + obtenerNota(puntuacion));
        } else {
            System.out.println("La puntuacion ingresada está fuera del rago de 0 y 100");
        }
        sc.close();
    }

    /*
     * 3. Ejercicio de calificación: Basándote en el siguiente ejercicio que ya has
     * realizado, crea un método
     * "obtenerNota()" que reciba por parámetro un "int" y devuelva un "String". El
     * método debe utilizar la estructura
     * de control "switch expression".
     */

    public static String obtenerNota(int nota) {
        String calificacion;

        switch ((int) Math.floor(nota / 10.0)) {

            case 10, 9 -> calificacion = "A";
            case 8 -> calificacion = "B";
            case 7 -> calificacion = "C";
            case 6 -> calificacion = "D";
            default -> calificacion = "F";
        }
        return calificacion;
    }

}
