import  java.util.scanner;

public class app4 {

    public static void main(String[] args) {

//Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
let nombre = prompt("Ingrese su nombre: ");
console.log("Hola, " + nombre);

//Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
let edad = Number(prompt("Ingrese su edad: "));
console.log("Su edad es: " + edad);

//Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
console.log("Su nombres es " + nombre + " y su edad es " + edad);
System.out.println("Su nombres es " + nombre + " y su edad es " + edad);

    } 
    }

/*Actividad: Operaciones básicas 
En esta actividad, practicarás el uso de operaciones aritméticas en Java. A través de la realización de diversas operaciones entre números, fortalecerás tu conocimiento sobre las operaciones básicas disponibles en el lenguaje, como la suma (+), resta (-), multiplicación (*), división (/) y módulo (%).

Realizarás operaciones tanto con valores predeterminados como con valores ingresados por el usuario por teclado.

Aplica lo aprendido resolviendo los siguientes ejercicios:

Declara dos variables, y asígnales un valor a cada una de ellas.

Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;

Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola. */

import  java.util.scanner;

public class app4 {

    public static void main(String[] args) {

//Declara dos variables, y asígnales un valor a cada una de ellas.
int num1 = 10;
int num2 = 5;
System.out.println("La suma de las 2 variables es : " + (num1 + num2));
System.out.println("La resta de las 2 variables es : " + (num1 - num2));
System.out.println("La multiplicación de las 2 variables es : " + (num1 *num2));
System.out.println("La división de las 2 variables es : " + (num1 /num2));
System.out.println("El módulo de las 2 variables es : " + (num1 % num2));
System.out.println("La potencia de las 2 variables es : " + (num1 ** num2));
System.out.println("La raíz cuadrada de las 2 variables es : " + (Math.sqrt(num1)));

    }
    }


/*Pide al usuario que ingrese dos números, y:

A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. 
B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
💡Los operadores de comparación más utilizados en Java son: igualdad (==), distinto que (!=), mayor que (>), 
menor que (<), mayor o igual que (>=), menor o igual que (<=). */

import java.util.Scanner;
public class app5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo número");
            } else {
                System.out.println("El primer número no es mayor que el segundo número");
                }
                if (num1 != num2) {
                    System.out.println("El primer número es distinto al segundo número");
                    } else {
                        System.out.println("El primer número no es distinto al segundo número");
                        }
                        if (num1 % 2 == 0) {
                            System.out.println("El primer número es divisible por 2");
                            } else {
                                System.out.println("El primer número no es divisible por 2");
                                }
                                }
                                




