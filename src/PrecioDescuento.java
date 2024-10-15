import java.util.Scanner;
public class Divisibilidad {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese numero a verificar -> ");
int num = scanner.nextInt();


if (num%5 == 0 && num%3 == 0 ) { //ambos
System.out.println("Es divisible entre 5 y 3");
}
else if( num%5 == 0 ) { //5
System.out.println("Es divisible entre 5");
}
else if( num%3 == 0 ) { //3
System.out.println("Es divisible entre 3");
}
else { //ninguno
System.out.println("No es divisible por ninguno");
}
}
}

import java.util.Scanner;
public class PrecioDescuento {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese precio -> ");
float precio = scanner.nextFloat();

if( precio >= 100 ) {
System.out.println("El precio con descuento es: " + precio*0.90);
}
else {
System.out.println("El precio es: " + precio);

}
}
}

// Online Java Compiler se llama Programiz
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int age = scan.nextInt();
if (age < 18)
System.out.println("Eres menor de edad");
else if(age >= 18 && age <= 64)
System.out.println("Eres adulto");
else
System.out.println("Eres adulto mayor");

}
}