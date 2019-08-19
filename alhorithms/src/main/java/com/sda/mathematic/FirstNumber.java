package com.sda.mathematic;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstNumber {

    public List<Integer> generatePrimeNumbers(int range) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < range; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime(i);
            if (probablePrime == true) {
                numbers.add(i);
            }

        }
        return numbers;
    }

    public List<Integer> generatePrimeNumbersOwn(int range) {

        List<Integer> numbers = new ArrayList<>();
        List<Boolean> isItPrime = new ArrayList<>();

        for (int i = 0; i <= range; i++) {

            for (int j = 2; j + i <= range; j = j + i) {

            }
        }
        return numbers;
    }

}


