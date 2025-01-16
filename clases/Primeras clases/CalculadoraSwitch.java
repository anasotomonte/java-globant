
//Método de Sofia

import java.util.Scanner;
public class CalculadoraSwitch {
public static void main(String[] args) {

Scanner readNumber = new Scanner(System.in);

System.out.println("Calculadora");
System.out.print("Ingrese un número: ");
int num1 = readNumber.nextInt();
System.out.print("Ingrese otro número: ");
int num2 = readNumber.nextInt();
System.out.println("1 - Sumar");
System.out.println("2 - Restar");
System.out.println("3 - Multiplicar");
System.out.println("4 - Dividir");
System.out.println("Ingresa el número correspondiente a la operación que quieres hacer:");
int operation = readNumber.nextInt();

switch(operation) {
case 1:
System.out.println("El resultado es el siguiente: "+num1+" + "+num2+" = "+(num1+num2));
break;
case 2:
System.out.println("El resultado es el siguiente: "+num1+" - "+num2+" = "+(num1-num2));
break;
case 3:
System.out.println("El resultado es el siguiente: "+num1+" * "+num2+" = "+(num1*num2));
break;
case 4:
System.out.println("El resultado es el siguiente: "+num1+"/ "+num2+" = "+(num1/num2));
break;
default:
System.out.println("Opción inválida");
}
readNumber.close();
}
}
