package lab6.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest {
    private DoubleCalculator calc;

    @BeforeEach
    public void setup() {
        calc = new DoubleCalculator();
        calc.init();
    }

    @Test
    @DisplayName("Test adunare Double")
    public void testAdd() {
        // Act
        calc.add(10.5).add(4.5);

        Assertions.assertEquals(15.0, calc.result(), 0.001);
    }

    @Test
    @DisplayName("Test scadere Double")
    public void testSubtract() {

        calc.add(20.0).subtract(5.5);

        Assertions.assertEquals(14.5, calc.result(), 0.001);
    }

    @Test
    @DisplayName("Test inmultire Double")
    public void testMultiply() {

        calc.add(2.0).multiply(3.5);

        Assertions.assertEquals(7.0, calc.result(), 0.001);
    }

    @Test
    @DisplayName("6.8.2: Test robustete - Impartire la zero Double")
    public void testDivideByZero() {
        calc.add(10.0);
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(0.0));
    }
}