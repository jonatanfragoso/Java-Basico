import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testGetMensagem() {
        String resultado = HelloWorld.getMensagem();
        assertEquals("Hello, World!", resultado);
    }
}
