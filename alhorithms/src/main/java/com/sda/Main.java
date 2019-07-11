package com.sda;

import com.sda.Strings.PrintFigures;
import com.sda.Strings.ReverseWord;

public class Main {

    public static void main(String[] args) {

//        Fibonacci fibonacci = new Fibonacci();
//        int i = fibonacci.fibonacciIteration(4);
//        System.out.println(i);

        PrintFigures printFigures = new PrintFigures();
        printFigures.printTriangle(6);

        ReverseWord reverse = new ReverseWord();
        System.out.println(reverse.reverse("Konrad"));
    }
}
