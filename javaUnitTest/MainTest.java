import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testOutput() {
        assertEquals("Hello, Jenkins!", getHelloMessage());
    }

    private String getHelloMessage() {
        return "Hello, Jenkins!";
    }
}

