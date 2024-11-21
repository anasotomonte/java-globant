import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    // Método para agregar un jugador al equipo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método para mostrar detalles del equipo
    public String getDetalles() {
        return "Equipo: " + nombre + " | Jugadores: " + jugadores.size();
    }
}
