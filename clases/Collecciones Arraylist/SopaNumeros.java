import java.util.*;
import java.util.ArrayList;


public class SopaNumeros {
public static void main(String[] args) {
ArrayList<Integer> valores = leerValores();
Integer suma = calcularSuma(valores);
Double promedio = calcularPromedio(valores);
mostrarResultados(valores, suma, promedio);
}

public static ArrayList<Integer> leerValores() {
Scanner pepe = new Scanner(System.in);
ArrayList<Integer> valores = new ArrayList<Integer>();
Integer valor;

do {
System.out.println("Ingresa un numero entero");
valor = pepe.nextInt();

if (valor != -99) {
valores.add(valor);
}
} while (valor != -99);

pepe.close();
return valores;
}

public static Integer calcularSuma(ArrayList<Integer> valores) {
Integer suma = 0;
for (Integer valor : valores) {
suma += valor;
}
return suma;
}


