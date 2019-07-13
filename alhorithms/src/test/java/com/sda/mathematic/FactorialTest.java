package com.sda.mathematic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void shouldReturnCorrectValueForZero(){

        //given

        //given & when
        long result = Factorial.factorialI(0);
        //then
        Assert.assertEquals(0, 0);
    }

    @Test
    public void shouldReturnCorrectValue(){

        //given

        //given & when
        long result = Factorial.factorialI(4);
        //then
        Assert.assertEquals(result, 24);
    }


    @Test
    public void shouldReturnCorrectValueForOne(){

        //given

        //given & when
        long result = Factorial.factorialI(1);
        //then
        Assert.assertEquals(result, 1);
    }


    @Test
    public void shouldReturnCorrectValueForPow(){

        //given

        //when & then
        Factorial.factorialSquareI(5);


    }


    @Test
    public void shouldReturnCorrectValueFor(){

        //when & then
        double recurention = Factorial.recurention(4);
        Assert.assertEquals(0.25, recurention, 0);
    }

}