

public class Concesionario {
    private String marca;
    private String modelo;
    private Integer año;

    // Constructor que inicializa marca, modelo y año
    public Concesionario(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Constructor que inicializa marca y modelo
    public Concesionario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor que inicializa solamente la marca
    public Concesionario(String marca) {
        this.marca = marca;
    }

    // Constructor sin parámetros
    public Concesionario() {}

    // Método para imprimir los datos del auto
    public void imprimirDatos() {
        if (marca == null && modelo == null && año == null) {
            System.out.println("Este auto no tiene datos asignados.");
        } else {
            System.out.println("Información del carro:");
            if (marca != null) System.out.println("Marca: " + marca);
            if (modelo != null) System.out.println("Modelo: " + modelo);
            if (año != null) System.out.println("Año: " + año);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Objeto 1: Inicializa marca, modelo y año
        Concesionario auto1 = new Concesionario("Toyota", "Corolla", 2020);
        auto1.imprimirDatos();

        // Objeto 2: Inicializa marca y modelo
        Concesionario auto2 = new Concesionario("Honda", "Civic");
        auto2.imprimirDatos();

        // Objeto 3: Inicializa solamente la marca
        Concesionario auto3 = new Concesionario("Ford");
        auto3.imprimirDatos();

        // Objeto 4: Constructor sin parámetros
        Concesionario auto4 = new Concesionario();
        auto4.imprimirDatos();
    }
}