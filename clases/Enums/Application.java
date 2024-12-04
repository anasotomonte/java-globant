
public class Application {

    public static void main(String[] args) {
        // Crear un arreglo de 10 días de la semana generados al azar
        DiaSemana[] diasAleatorios = generarDiasAleatorios(10);

        // Mostrar los días generados y si son laborales o no
        System.out.println("Días generados y su estado:");
        for (DiaSemana dia : diasAleatorios) {
            System.out.println(dia + ": " + imprimirDiaLaboral(dia));
        }
    }

    // Método para generar un arreglo de días de la semana aleatorios
    public static DiaSemana[] generarDiasAleatorios(int cantidad) {
        DiaSemana[] dias = new DiaSemana[cantidad];
        DiaSemana[] valores = DiaSemana.values();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            dias[i] = valores[random.nextInt(valores.length)];
        }

        return dias;
    }

    // Método para imprimir si un día es laboral o no
    public static String imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            return "Día laboral";
        } else {
            return "No es día laboral";
        }
    }
}


/* 
import ENUMSS.DiaSemana;
import java.util.random.RandomGenerator;
import jdk.jshell.Diag;

/*Actividad: Días de la semana

Crea el enum "DiaSemana" que represente los días de la semana, definiendo las constantes 
correspondientes a los días: LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO y DOMINGO.

En la clase "DiaSemana", agrega un método llamado "esDiaLaboral()" que devuelva un valor 
booleano indicando si el día es laboral o no. Para esto, los días SÁBADO y DOMINGO no serán 
considerados días laborales.

En la clase "Application", crea un arreglo de objetos "DiaSemana" con 10 días de la semana 
generados al azar, esto es para evitar la entrada manual de datos.

Implementa un método llamado "imprimirDiaLaboral()" en la clase "Application" que tome como
 parámetro un objeto de tipo "DiaSemana" y utilice el método "esDiaLaboral()" para determinar 
 si el día es laboral o no. Este método devolverá un mensaje indicando si es "Día laboral" o 
"No es día laboral", según corresponda al día proporcionado. */

//package ana.sotomonte.workspace.java-globant.clases.ENUMSS
/* 
public class Application {

//psv
public static void main(String[] args) {
    
}
//arreglo aleatorio de 10 dias

DiaSemana[] diaSemana = new DiaSemana[10];
public void cargarArray(DiaSemana[] arr) {
for (int i = 0; i<10; i++){
    arr[i] = Math.Random[10];
}
}

}

*/
