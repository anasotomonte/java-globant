
// Ejercicio de Nohelia 
import java.util.Scanner;

public class calificacion {
public static void main(String[] args) {
int puntuacion;
Scanner sc = new Scanner(System.in);
System.out.println("Introduce tu puntuacion, que debe de ser entre 0 y 100");
puntuacion = sc.nextInt();

if(puntuacion >= 0 && puntuacion <= 100){
if(puntuacion >= 90){
System.out.println("A");
} else if(puntuacion >= 80){
System.out.println("B");
} else if(puntuacion >= 70){
System.out.println("C");
} else if(puntuacion >= 60){
System.out.println("D");
}
else{
System.out.println("F");
}
}else{
System.out.println("La puntuacion ingresada está fuera del rago de 0 y 100");


}
}