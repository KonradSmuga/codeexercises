package com.sda.mathematic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RecursionTest {


    @Test
    public void shouldReturnCorrectValueForZero() {

        //given

        //given & when
        long result = Factorial.faactorialRecurention(0);
        //then
        Assert.assertEquals(0, 0);
    }

    @Test
    public void shouldReturnCorrectValue() {

        //given

        //given & when
        long result = Factorial.faactorialRecurention(4);
        //then
        Assert.assertEquals(result, 24);
    }


    @Test
    public void shouldReturnCorrectValueForOne() {

        //given

        //given & when
        long result = Factorial.faactorialRecurention(1);
        //then
        Assert.assertEquals(result, 1);
    }
}
