
import geometriaAbstracta.Triangulo;

public class Main {

    public static void main(String[] args) {
        
        
        Circulo circulo1 = new Circulo(10);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        Rectangulo rectangulo1 = new Rectangulo(4, 8);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
    

        Triangulo triangulo1 = new Triangulo(3, 10);
        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();

        

    }
    

}
