package ENUMSS;
public enum DiaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;

    // Método para determinar si el día es laboral
    public boolean esDiaLaboral() {
        return this != SÁBADO && this != DOMINGO;
    }
}


/*
public enum  DiaSemana {
    LUNES(true), 
    MARTES(true), 
    MIERCOLES(true), 
    JUEVES(true), 
    VIERNES(true), 
    SABADO(false), 
    DOMINGO(false);

    private  boolean esDiaLaboral;

    private DiaSemana(boolean esDiaLaboral) {
        this.esDiaLaboral = esDiaLaboral;
    }

    public boolean isEsDiaLaboral() {
        return esDiaLaboral;
    }

    public boolean esDiaLaboral(DiaSemana dia){
        return dia.esDiaLaboral;
    }

}
*/