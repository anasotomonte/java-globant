public class Perro extends Animal {
    private String raza;

    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); // Llama al constructor de la clase padre (Animal)
        this.raza = raza;
    }

    // Getter para raza
    public String getRaza() {
        return raza;
    }

    // Método único para perros
    public void ladrar() {
        System.out.println(getNombre() + " está ladrando: ¡Guau guau!");
    }
}