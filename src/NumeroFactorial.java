/*El objetivo de esta actividad es que desarrolles un programa que solicite al usuario ingresar un número y posteriormente calcule su factorial mediante un bucle do-while. El factorial de un número se define como el producto de todos los enteros desde 1 hasta ese número. A continuación, te presentamos  algunos ejemplos para mayor claridad:

El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.

El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.

Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que da 5040. */   


import java.util.Scanner;

public class NumeroFactorial {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int numero=0;

do {
try {
System.out.println("Ingresa el numero: ");
numero= sc.nextInt();
} catch (Exception e) {
System.out.println("Ingresa ingresa un entero positivo - "+e);
sc.nextLine();
}


} while (numero<1);

sc.close();

int resultado=1;
int i=1;

do {

resultado=resultado*i;
i++;

} while (i<=numero);

System.out.println("El calculo factorial dio como resultado: "+resultado);

}
}