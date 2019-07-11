package fibonacci;

import com.sda.fibonnaci.Fibonacci;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @BeforeAll
    public static void startTests() {
        System.out.println("test of fibonacci two methods");
    }

    @Test
    public void shouldReturnZeroValueWithIteration() {
        //given
        int number = 0;

        //when
        int value = fibonacci.fibonacciIteration(number);
        //then
        assertEquals(0, value);
    }

    @Test
    public void shouldReturnZeroValueWithRecurention() {
        //given
        int number = 0;

        //when
        int value = fibonacci.fibonacciRekurention(number);
        //then
        assertEquals(0, value);

    }

    @Test
    public void shouldReturnCorrectValueWithIteration() {
        //given
        int number = 4;

        //when
        int value = fibonacci.fibonacciIteration(number);
        //then
        assertEquals(3, value);
    }

    @Test
    public void shouldReturnCorrectValueWithRecurention() {
        //given
        int number = 4;

        //when
        int value = fibonacci.fibonacciRekurention(number);
        //then
        assertEquals(3, value);
    }

    @Test
    public void shouldReturnException() {
        final int number = -1;

        //when and Then
        assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.fibonacciIteration(number);
        });

    }
}
