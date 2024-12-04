package geometriaAbstracta;


public class Circulo extends Figura implements InterfazDibujable {
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override 
    public void calcularArea(){
        System.out.println("El area del círculo es: " + Math.PI*Math.pow(radio, 2));
    }

    @Override 
    public void calcularPerimetro(){
        System.out.println("El perímetro del círculo es: " + Math.PI*2*radio);
    }


  
}

