package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ParametersTest {
    Calculator calc = new Calculator();

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"Sa", " ", "\n", "\t"})
    public void userNameTest(String inputStr) {
        System.out.println("Input value is: " + inputStr);
        assertThrows(IllegalArgumentException.class, () -> {
            User user = new User();
            user.setName(inputStr);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {10, -5, 0})
    public void squareTest(int num1) {
        int result = calc.square(num1);
        System.out.println("Input is: " + num1);
        System.out.println("Output is: " + result);
        System.out.println("-----------------------");

        // Assertions
        assertEquals(num1 * num1, result);
        assertTrue(result >= 0);
    }

    @ParameterizedTest
    @CsvSource(value = {
        "1, 2, 3",
        "9, 6, 15",
        "10, 50, 60",
        "90, 100, 190"
    })
    public void addMethodTest(int num1, int num2, int answer) {
        int result = calc.add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);

        // Assertions
        assertEquals(answer, result);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input.csv", numLinesToSkip = 1, nullValues = {"N/A", "NA"})
    public void csvTest(ArgumentsAccessor args) {
        System.out.println(
                    args.getString(0) +
            ", " + args.get(1, Date.class) +
            ", " + args.getDouble(2) +
            ", " + args.getInteger(3)

        );
    }

}
