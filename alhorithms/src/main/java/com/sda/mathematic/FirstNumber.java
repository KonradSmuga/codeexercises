package com.sda.mathematic;

import java.math.BigInteger;
import java.util.ArrayList;
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

        for (int i = 2; i < range; i++) {

        }
    return numbers;
    }



}

