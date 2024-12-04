package geometriaAbstracta;

public class Rectangulo extends Figura {
    private float base;
    private float altura;
    
    public Rectangulo(float base, float altura) {
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
        System.out.println("El area del rectángulo es: " + base*altura);
    }
    
    @Override

    public void calcularPerimetro(){
        System.out.println("El perímetro del rectángulo es: " + (base+base+altura+altura));
    }

}
