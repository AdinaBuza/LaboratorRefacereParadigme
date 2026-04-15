package lab6.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewIntCalculatorTest {

    @Test
    public void testAdd() {
        NewIntCalculator calc = new NewIntCalculator();
        Integer res = calc.init().add(10).add(5).result();
        Assertions.assertEquals(15, res);
    }

    @Test
    public void testDivideByZero() {
        NewIntCalculator calc = new NewIntCalculator();
        calc.init().add(10);

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(0);
        });
    }
}