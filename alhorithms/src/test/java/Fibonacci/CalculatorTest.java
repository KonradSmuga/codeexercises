package Fibonacci;

import com.sda.mathematic.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnPowerIfNumberIsZero() {
        //given
        int number = 0;
        //when
        int result = (int) calculator.powerMath(number, 2);
        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldReturnCorrectNumberWithPowerOfMath() {
        //given
        int number = 3;
        //when
        int result = (int) calculator.powerMath(number, 2);
        //then
        Assert.assertEquals(9, result);
    }

    @Test
    public void shouldReturnExceptionWithZeroNumber() {
        //given
        int number = 0;
        int number2 = 1;
        //when
        int result = (int) calculator.multiplication(number, number2);
        //then

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.multiplication(0, 1);
        });
    }
}

