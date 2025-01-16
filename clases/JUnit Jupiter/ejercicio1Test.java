import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ejercicio1Test {
@Test
void testDoble() {

Integer resultado = ejercicio1.doble(3);
Assertions.assertEquals(6, resultado);

}
}