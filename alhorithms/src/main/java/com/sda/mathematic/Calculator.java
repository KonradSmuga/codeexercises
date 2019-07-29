package com.sda.mathematic;

public class Calculator {

    public int addition(int a, int b) {

        return a + b;
    }

    public int subtraction(int a, int b) {

        return a - b;
    }

    public int multiplication(int a, int b) {


        if (a == 0 || b == 0) {
            throw new IllegalArgumentException();
        }
        return a * b;
    }

    public int division(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException();
        }

        return a / b;
    }

    public double powerMath(int number, int power) {
        if (number == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        return Math.pow(number, power);
    }



}
