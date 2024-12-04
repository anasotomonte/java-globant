package geometriaAbstracta;

public class Triangulo extends Figura {
    private float base;
    private float altura;


    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override

    public void calcularArea(){
        System.out.println("El area del triángulo es: " + ((base*altura)/2));
    }
    
    @Override

    public void calcularPerimetro(){
        System.out.println("El perímetro del triangulo equilatero es: " + (base+base+base));
    }
    

    
}
