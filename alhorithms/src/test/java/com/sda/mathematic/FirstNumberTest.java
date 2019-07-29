package com.sda.mathematic;


import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FirstNumberTest {


    @Test
    public void shouldReturnFirstNumber() {

        //given
        FirstNumber firstNumber = new FirstNumber();
        int range = 20;
        //when
        List<Integer> numbers = firstNumber.generatePrimeNumbers(range);

        //then
        assertThat(numbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19);
    }
}


