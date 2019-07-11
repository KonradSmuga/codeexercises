package com.sda.mathematic;

public class NwdAndNww {


    //euklides
    public double nwdOfNumbers(double number1, double number2) {

        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else if
            (number2 > number1) {
                number2 = number2 - number1;
            }
        }
        return number1;
    }

    //modulo
    public double nwdWithModulo(double number1, double number2) {

        while (number2 != 0) {
            double number3 = number1 % number2;
            number1 = number2;
            number2 = number3;
        }
        return number1;
    }
}