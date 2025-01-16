import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class AleatoriosTest {
  

    @Test
    void testNumeroAleatorio() {

        //Entero
        int numero = Aleatorios.numeroAleatorio();

        assertTrue(Aleatorios.isInteger(numero));
        
        //< 355
        assertTrue(resultado >= 1 && resultado <= 355);
        
    }
}
