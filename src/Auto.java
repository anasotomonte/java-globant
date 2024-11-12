public class Auto {
    String marca;
    String modelo;
    Integer anio;
    
    public Auto() {
    
    }
    
    public Auto(String marca, String modelo, int anio){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    }
    
    public Auto(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    }
    
    public Auto(String marca){
    this.marca = marca;
    }
    
    public void ImprimirDatos(){
    
    if (marca == null && modelo == null && anio == null ) {
    System.out.println("El auto no tiene datos.");
    }
    
    if (marca != null) {
    System.out.println("Marca: " + marca);
    } if (modelo != null) {
    System.out.println("Modelo: " + modelo);
    }if (anio != null) {
    System.out.println("Anio: " + anio);
    }
    
    }
    
    }