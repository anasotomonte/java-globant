public class Jugador {
    private String nombre;
    private Equipo equipo;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.equipo = null; // Por defecto, no tiene equipo
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    // Método para mostrar detalles del jugador
    public String getDetalles() {
        if (equipo != null) {
            return "Jugador: " + nombre + " | Equipo: " + equipo.getNombre();
        } else {
            return "Jugador: " + nombre + " | Equipo: Sin asignar";
        }
    }
}




