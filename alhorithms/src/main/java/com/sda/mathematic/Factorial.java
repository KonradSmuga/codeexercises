package com.sda.mathematic;

public class Factorial {

    public static long factorialI(int n){
        int result = 1;
        for(int i =1; i <= n; i++) {
            result = i *result;
        }
        return result;
    }
}
