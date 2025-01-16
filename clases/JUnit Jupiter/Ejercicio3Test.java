public class Ejercicio3Test {

    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    @BeforeEach
    public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    public void tearDown() {
    System.setOut(standarOut);
    }
    
    @Test
    void testImprimeNombreyEdad() {
    int edadTest=24;
    String nombreTest= "juane";
    
    String resultadoEsperado= "Me llamo "+nombreTest +"y tengo " + edadTest +" años\r\n";
    
    Ejercicio3.imprimeNombreyEdad(nombreTest, edadTest);
    String resultadoTest= outputStreamCaptor.toString();
    
    Assertions.assertEquals(resultadoEsperado, resultadoTest);
    
    }
    }
