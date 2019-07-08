package com.sda.fibonnaci;

public class Fibonacci {


    // 0,1,1,2,3,5,8,13,21

    //iteracyjnie
    public int fibonacciIteration(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        if (number < 2) {

            return number;
        }
        int a = 0;
        int b = 1;
        int result;
        for (int i = 2; i <= number; i++) {

            result = a + b;
            a = b;
            b = result;
        }
        return b;

    }


    //rekurencyjnie (wywołanie własnej metody)
    public int fibonacciRekurention(int number1) {
        if (number1 < 2) {
            return number1;
        }
        return (fibonacciRekurention(number1 - 1) + fibonacciRekurention(number1 - 2));

    }
}
