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
            if(probablePrime == true){
                numbers.add(i);
            }

        }
        return numbers;
//        List<Integer> numbers = new ArrayList<>();
//
//        for (int i = 1; i < range; i++) {
//
//                if (i>3 && i%2!=0 && i%3!=0 && i%5!= 0) {
//                    numbers.add(i);
//            }
//        }
//        return numbers;
    }
}
