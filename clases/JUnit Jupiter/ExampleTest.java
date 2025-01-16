import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    
    @Test
    
    public void testSumar(){
        //Given 
        Example example = new Example();
        int numeroA = 4;
        int numeroB = 6;

        //When
        int result = Example.sumar(numeroA, numeroB);


        //Then
        assertEquals(10, result);
        assertInstanceOf(Integer.class, result);
    }
}
