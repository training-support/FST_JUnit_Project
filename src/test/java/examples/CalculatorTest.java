package examples;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for addition")
    public void addTest() {
        int result1 = calc.add(10, 5);
        int result2 = calc.add(12, 3);
        int result3 = calc.add(14, 2);

        // Assertion
        assertAll(
            () -> assertEquals(15, result1),
            () -> assertEquals(15, result2),
            () -> assertEquals(15, result3)
        );
    }

    @Test
    @DisplayName("Test for multiply")
    public void multiplyTest() {
        int result = calc.multiply(10, 5);

        assertEquals(50, result);
    }
}