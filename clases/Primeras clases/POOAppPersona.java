
public class POOAppPersona {

    public static void main(String[] args) {

        POOPersona persona1 = new POOPersona();
        persona1.nombre= "Ana";
        persona1.edad = 30;

        POOPersona persona2 = new POOPersona();
        persona2.nombre= "Rebeca";
        persona2.edad = 18;

        POOPersona persona3 = new POOPersona();
        persona3.nombre= "Camilo";
        persona3.edad = 24;

        persona1.imprimirDatos();
        persona2.imprimirDatos();
        persona3.imprimirDatos();

    }

    

}


