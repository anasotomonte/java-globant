public class Gato extends Animal {
    private String color;

    // Constructor
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad); // Llama al constructor de la clase padre (Animal)
        this.color = color;
    }

    // Getter para color
    public String getColor() {
        return color;
    }

    // Método único para gatos
    public void maullar() {
        System.out.println(getNombre() + " está maullando: ¡Miau miau!");
    }
}
