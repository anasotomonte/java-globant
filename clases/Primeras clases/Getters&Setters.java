package encapsulamiento.modelos;

public class Circulo {
private Double radio;

public Circulo() {

}

public Circulo(Double radio) {
this.radio = radio;
}

public void mostrarDatos() {
System.out.println("El área es: " + this.radio * this.radio * Math.PI + " y el perímetro es: " + (2 * Math.PI * this.radio));
}

public Double getRadio() {
return radio;
}

public void setRadio(Double radio) {
this.radio = radio;
}
}

Norberto Jorge Rodriguez Vaquero
a

Everyone

18:21 hs
package encapsulamiento.modelos;

public class Rectangulo {

private Double ancho;
private Double alto;

// constructores
public Rectangulo() {

}

public Rectangulo(Double ancho, Double alto) {
this.ancho = ancho;
this.alto = alto;
}

// metodos
public Double area() {
return this.ancho * this.alto;
}

public Double perimetro() {
return (2 * this.ancho + 2 * this.alto);
}

public void mostrarDatos() {
System.out.println("\nAncho: " + this.ancho + " - Alto: " + this.alto);
System.out.println("Área: " + this.area() + " - Perímetro: " + this.perimetro());
}

public Double getAncho() {
return ancho;
}

public void setAncho(Double ancho) {
this.ancho = ancho;
}

public Double getAlto() {
return alto;
}

public void setAlto(Double alto) {
this.alto = alto;
}


}

Norberto Jorge Rodriguez Vaquero
a

Everyone

18:21 hs
package encapsulamiento.modelos;

public class Triangulo {
private Double base;
private Double altura;

// constructores
public Triangulo() {

}

public Triangulo(Double base, Double altura) {
this.base = base;
this.altura = altura;
}

// metodos
public Double area() {
return this.base * this.altura / 2;
}

public void mostrarDatos() {
System.out.println("El área es: " + this.area());
}

public Double getBase() {
return base;
}

public void setBase(Double base) {
this.base = base;
}

public Double getAltura() {
return altura;
}

public void setAltura(Double altura) {
this.altura = altura;
}
}

Norberto Jorge Rodriguez Vaquero
a

Everyone

18:21 hs
package encapsulamiento;

import java.util.Scanner;

import encapsulamiento.modelos.Circulo;
import encapsulamiento.modelos.Rectangulo;
import encapsulamiento.modelos.Triangulo;

public class Menu {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int opcion;
Double ancho;
Double alto;
Double base;
Double altura;
Double radio;

int indiceRectangulos = 0;
int indiceTriangulos = 0;
int indiceCirculos = 0;
Rectangulo[] rectangulos = new Rectangulo[10];
Triangulo[] triangulos = new Triangulo[10];
Circulo[] circulos = new Circulo[10];

do {
mostrarMenu();
opcion = sc.nextInt();

switch (opcion) {
case 1:
if (indiceRectangulos < 10) {
System.out.println("\nNuevo rectángulo: ");
System.out.print("\nIngresar ancho: ");
ancho = sc.nextDouble();
System.out.print("\nIngresar alto: ");
alto = sc.nextDouble();

rectangulos[indiceRectangulos] = new Rectangulo(ancho, alto);
indiceRectangulos++;
} else {
System.out.println("\nSe creó la cantidad máxima de rectangulos.\n");
}
break;
case 2:
if (indiceTriangulos < 10) {
System.out.println("\nNuevo triangulo: ");
System.out.print("\nIngresar base: ");
base = sc.nextDouble();
System.out.print("\nIngresar altura: ");
altura = sc.nextDouble();

triangulos[indiceTriangulos] = new Triangulo(base, altura);
indiceTriangulos++;
} else {
System.out.println("\nSe creó la cantidad máxima de rectangulos.\n");
}
break;
case 3:
if (indiceCirculos < 10) {
System.out.println("\nNuevo circulo: ");
System.out.print("\nIngresar radio: ");
radio = sc.nextDouble();

circulos[indiceCirculos] = new Circulo(radio);
indiceCirculos++;
} else {
System.out.println("\nSe creó la cantidad máxima de rectangulos.\n");
}
break;
case 4:
System.out.println("\nRectangulos: \n");
for(Rectangulo r : rectangulos) {
if (r != null) {
r.mostrarDatos();
}
}

System.out.println("\nTriangulos: \n");
for(Triangulo t : triangulos) {
if (t != null) {
t.mostrarDatos();
}
}

System.out.println("\nCirculos: \n");
for(Circulo c : circulos) {
if (c != null) {
c.mostrarDatos();
}
}
break;
case 5:
System.out.println("\nSaliendo...\n");
break;
default:
break;
}
} while (opcion != 5);

sc.close();
}

private static void mostrarMenu() {
System.out.println("\nMenú de opciones:");
System.out.println("1. Rectangulo");
System.out.println("2. Triangulo");
System.out.println("3. Circulo");
System.out.println("4. Calcular y mostrar los datos");
System.out.println("5. Salir");
System.out.print("Opcion: ");
}
}
