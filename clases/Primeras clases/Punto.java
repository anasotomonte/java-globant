public class Punto {

    private Integer x;
    private Integer y;
    
    // Constructores
    public Punto() {
    
    }
    
    public Punto(Integer x, Integer y) {
    this.x = x;
    this.y = y;
    }
    
    // Getters y Setters
    public Integer getX() {
    return x;
    }
    
    public void setX(Integer x) {
    this.x = x;
    }
    
    public Integer getY() {
    return y;
    }
    
    public void setY(Integer y) {
    this.y = y;
    }
    
    //Distancia del origen
    public void distanciaDesdeOrigen(){
    System.out.println("La distancia desde el origen "+ Math.sqrt((this.x*this.x)+(this.y+this.y)));
    
    }
    
    public void calcularDistancia(Punto punto1, Punto punto2){
    Integer distX = punto2.getX() - punto1.getX();
    Integer distY = punto2.getY() - punto1.getY();
    System.out.println("La distancia entre los puntos es: "+ Math.sqrt((distX*distX)+(distY+distY)));
    }
    
    public void estanAlineado(Punto punto1, Punto punto2, Punto punto3){
    if ((punto2.getY()-punto1.getY())/(punto2.getX()-punto1.getX()) == (punto3.getY()-punto2.getY())/(punto3.getX()-punto2.getX())){
    System.out.println("Los puntos estan alineados.");
    
    }else{
    System.out.println("No estan alineados.");
    }
    }
    
    }
    
    Valentín Bustos
    a
    
    Everyone
    
    18:49 hs
    package POO_Intro.modelos;
    
    public class Punto {
    
    private Integer x;
    private Integer y;
    
    // Constructores
    public Punto() {
    
    }
    
    public Punto(Integer x, Integer y) {
    this.x = x;
    this.y = y;
    }
    
    // Getters y Setters
    public Integer getX() {
    return x;
    }
    
    public void setX(Integer x) {
    this.x = x;
    }
    
    public Integer getY() {
    return y;
    }
    
    public void setY(Integer y) {
    this.y = y;
    }
    
    //Distancia del origen
    public void distanciaDesdeOrigen(){
    System.out.println("La distancia desde el origen "+ Math.sqrt((this.x*this.x)+(this.y+this.y)));
    
    }
    
    public void calcularDistancia(Punto punto1, Punto punto2){
    Integer distX = punto2.getX() - punto1.getX();
    Integer distY = punto2.getY() - punto1.getY();
    System.out.println("La distancia entre los puntos es: "+ Math.sqrt((distX*distX)+(distY+distY)));
    }
    
    public void estanAlineado(Punto punto1, Punto punto2, Punto punto3){
    if ((punto2.getY()-punto1.getY())/(punto2.getX()-punto1.getX()) == (punto3.getY()-punto2.getY())/(punto3.getX()-punto2.getX())){
    System.out.println("Los puntos estan alineados.");
    
    }else{
    System.out.println("No estan alineados.");
    }
    }
    
    }
    
    