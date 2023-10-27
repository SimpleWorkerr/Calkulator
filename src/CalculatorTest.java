import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Ввод строки подлкючения")
    void evaluate() {
        assertAll(() -> assertEquals(-5, Calculator.evaluate("2 / ( ( 2 + 0 ) * 1 ) - 6")),
                () -> assertEquals(0.0, Calculator.evaluate("")));
    }
}