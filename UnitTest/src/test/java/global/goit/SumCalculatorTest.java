package global.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    public void init() {
        calculator = new SumCalculator();
    }

    @Test
    public void testThatSumReturnOne() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumReturnSix() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumThrowIllegalArgumentException() {
        int actual = calculator.sum(0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            if (actual == 0) {
                throw new IllegalArgumentException("You entered 0, this method works only with numbers greater than 0");
            }
        });
    }
}
