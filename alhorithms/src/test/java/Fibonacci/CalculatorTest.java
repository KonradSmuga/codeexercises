package Fibonacci;

import com.sda.calculator.Mathematic;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Mathematic mathematic = new Mathematic();

    @Test
    public void shouldReturnPowerIfNumberIsZero() {
        //given
        int number = 0;
        //when
        int result = (int) mathematic.powerMath(number, 2);
        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldReturnCorrectNumberWithPowerOfMath() {
        //given
        int number = 3;
        //when
        int result = (int) mathematic.powerMath(number, 2);
        //then
        Assert.assertEquals(9, result);
    }

    @Test
    public void shouldReturnExceptionWithZeroNumber() {
        //given
        int number = 0;
        int number2 = 1;
        //when
        int result = (int) mathematic.multiplication(number, number2);
        //then

        assertThrows(IllegalArgumentException.class, () -> {
            mathematic.multiplication(0, 1);
        });
    }

}

