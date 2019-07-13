package mathematic;

import com.sda.mathematic.NwdAndNww;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NwdAndNwwTest {

    NwdAndNww nwdAndNww = new NwdAndNww();

    @Test
    public void shouldReturnCorrectNwd() {

        //given
        double number1 = 100;
        double number2 = 36;

        //when
        double nwd = nwdAndNww.nwdWithModulo(number1, number2);

        //then

        Assert.assertEquals(4, nwd, 0);
    }

    @Test
    public void shouldReturnCorrectNwd2() {

        //given
        double number1 = 100;
        double number2 = 36;

        //when
        double nwd = nwdAndNww.nwdOfNumbers(number1, number2);

        //then
        Assert.assertEquals(4, nwd, 0);

    }
}

