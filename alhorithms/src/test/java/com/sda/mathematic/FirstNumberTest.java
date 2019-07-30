package com.sda.mathematic;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FirstNumberTest {


    @Test
    public void shouldReturnFirstNumber() {

        //given
        FirstNumber firstNumber = new FirstNumber();
        int range = 1000;
        //when
        List<Integer> numbers = firstNumber.generatePrimeNumbers(range);
        List<Integer> numbersWithMethod = firstNumber.generatePrimeNumbersOwn(range);
        //then

        Assert.assertEquals(numbers, numbersWithMethod);
    }
}


