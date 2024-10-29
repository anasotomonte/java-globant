/*Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera 
aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.

Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando l
as calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). 
Necesitarás convertir los String a double para lograrlo.

Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

Por último, imprimiré los resultados en consola. */

import java.util.Arrays;

public class CalificacionesDesafio {

    public static void main(String[] args) {
        String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
        System.out.print(clear);
        // Crea un array aleatoreo de 20 calificaciones de 0 a 10
        double[] notas = new double[20];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.floor(Math.random() * 11);
        }
        System.out.println("Notas de todos los alumnos del curso" + Arrays.toString(notas));
        System.out.println(" ");
        // Separar las calificaciones en 3 arreglos
        double[] desaprobado = new double[notas.length];
        System.out.println(" ");
        double[] aprobado = new double[notas.length];
        System.out.println(" ");
        double[] excelente = new double[notas.length];
        int desaprobadoCount = 0;
        int aprobadoCount = 0;
        int excelenteCount = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>0 && notas[i]<4) {
                desaprobado[desaprobadoCount] = notas[i];
                desaprobadoCount++;
            } else if (notas[i] >= 4 && notas[i] < 10) {
                aprobado[aprobadoCount] = notas[i];
                aprobadoCount++;
            } else if (notas[i]>=10){
                excelente[excelenteCount] = notas[i];
                excelenteCount++;
            
            }else {
                
            }
        }
        // Imprimir los arreglos
        System.out.println("Desaprobado: " + Arrays.toString(desaprobado));
        System.out.println("Aprobado: " + Arrays.toString(aprobado));
        System.out.println("Excelente: " + Arrays.toString(excelente));
        System.out.println(" ");
        // Imprimir el número de estudiantes en cada categoría
        System.out.println("Cantidad de estudiantes desaprobados: " + desaprobadoCount);
        System.out.println("Cantidad de estudiantes aprobados: " + aprobadoCount);
        System.out.println("Cantidad de estueduantes excelentes: " + excelenteCount);
        System.out.println(" ");
        // Imprimir el promedio de cada categoría
        
        double promedioDesaprobado = 0;
        double promedioAprobado = 0;
        double promedioExcelente = 0;
        for (int i = 0; i < desaprobadoCount; i++) {
            promedioDesaprobado += desaprobado[i];
        }
        for (int i = 0; i < aprobadoCount; i++) {
            promedioAprobado += aprobado[i];
        }
        for (int i = 0; i < excelenteCount; i++) {
            promedioExcelente += excelente[i];
        }
        
        promedioDesaprobado /= desaprobadoCount;
        promedioAprobado /= aprobadoCount;
        promedioExcelente /= excelenteCount;

    }
}
