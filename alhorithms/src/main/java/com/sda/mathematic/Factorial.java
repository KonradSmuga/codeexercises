package com.sda.mathematic;

public class Factorial {

    public static long factorialI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }

    public static long factorialSquareI(int n) {

        if (n > 0) {
            return (long) (Math.pow(n, 2) + factorialSquareI(n - 1));
        } else {
            return 0;
        }
    }

    public static double recurention(double n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return  0.5;
        }else{
            return -recurention(n - 1) * recurention(n - 2);
        }
    }
}

