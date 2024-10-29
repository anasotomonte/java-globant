import java.util.Arrays;
/*Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.
Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo.
Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.
Por último, imprimiré los resultados en consola. */

public class CalificacionesSofia {
    public static void main(String[] args) {
        String clear = "\033\143"; // estas dos lineas borran el parrafo de inicio de programa
        System.out.print(clear);
        String[] grades = new String[10];
        int failedCount = 0, approvedCount = 0, excellentCount = 0;
        double totalGrade = 0;

        for (int i = 0; i < grades.length; i++) {
            double randomGrade = (double) (Math.random() * 20 + 1);
            if (randomGrade < 4) {
                failedCount++;
            } else if (randomGrade >= 4 && randomGrade < 10) {
                approvedCount++;
            } else {
                excellentCount++;
            }
            grades[i] = String.valueOf(randomGrade);
            totalGrade += randomGrade;
        }

        Double[] failedGrades = new Double[failedCount];
        Double[] approvedGrades = new Double[approvedCount];
        Double[] excellentGrades = new Double[excellentCount];
        int fIdx = 0, aIdx = 0, eIdx = 0;
        double failedTotal = 0.0, approvedTotal = 0.0, excellentTotal = 0.0;

        for (String gradeString : grades) {
            double grade = Double.parseDouble(gradeString);
            if (grade < 4) {
                failedGrades[fIdx++] = grade;
                failedTotal += grade;
            } else if (grade >= 4 && grade < 10) {
                approvedGrades[aIdx++] = grade;
                approvedTotal += grade;
            } else {
                excellentGrades[eIdx++] = grade;
                excellentTotal += grade;
            }
        }
        double averageGrade = totalGrade / grades.length;
        double failedAverage = failedCount > 0 ? failedTotal / failedCount : 0.0;
        double approvedAverage = approvedCount > 0 ? approvedTotal / approvedCount : 0.0;
        double excellentAverage = excellentCount > 0 ? excellentTotal / excellentCount : 0.0;

        System.out.printf("Todas las notas: " + Arrays.toString(grades) + "\n");
        System.out.printf("Notas Desaprobadas: " + Arrays.toString(failedGrades) + "\n");
        System.out.printf("Notas Aprobadas: " + Arrays.toString(approvedGrades) + "\n");
        System.out.printf("Notas Excelentes: " + Arrays.toString(excellentGrades) + "\n");

        System.out.println("Promedio de todas las notas: " + averageGrade);
        System.out.println("Promedio notas desaprobadas: " + failedAverage);
        System.out.println("Promedio notas aprobadas: " + approvedAverage);
        System.out.println("Promedio notas excelentes: " + excellentAverage);

    }
}
