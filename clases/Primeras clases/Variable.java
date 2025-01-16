

public class Variable {

    public static void main(String[] args) {
        ////La temperatura media de una ciudad durante el verano (en grados Celsius).
        int enteroTemperaturaCelsius = 25;

        //El precio de un producto en una tienda (en dólares y centavos).
        float decimalDolarCentavos = 25.50f;

        //El nombre completo de una persona.
        String cadenaNombreCompleto = "Juan Carlos Pérez";

        //La fecha de nacimiento de una persona.
        int enteroFechaNacimiento = 1990;

        //El número de habitantes de una ciudad.
        long enteroHabitantes = 1000000L;

        //La duración de una película (en minutos).
        int enteroPeliculaDuracion = 120;

        //Si un artículo está disponible o no en una tienda (true/false).
        boolean booleanDisponible = true;

        //La distancia entre dos ciudades (en kilómetros).
        double decimalDistancia = 100.50;

        //El número de teléfono de una persona.
        String cadenaTelefono = "1234567890";

        //La cantidad de existencias de un producto en una tienda.
        int enteroInventarioExistencias = 100;

        System.out.println("La temperatura media de una ciudad durante el verano es: " + enteroTemperaturaCelsius);
        System.out.println("El precio de un producto en una tienda es: $" + decimalDolarCentavos);
        System.out.println("El nombre completo de una persona es: " + cadenaNombreCompleto);
        System.out.println("La fecha de nacimiento de una persona es: " + enteroFechaNacimiento);
        System.out.println("El número de habitantes de una ciudad es: " + enteroHabitantes);
        System.out.println("La duración de una película es: " + enteroPeliculaDuracion + " minutos");
        System.out.println("Un artículo está disponible en una tienda: " + booleanDisponible);
        System.out.println("La distancia entre dos ciudades es: " + decimalDistancia + " kilómetros");
        System.out.println("El número de teléfono de una persona es: " + cadenaTelefono);
        System.out.println("La cantidad de existencias de un producto en una tienda es:" + enteroInventarioExistencias);
    }
}
