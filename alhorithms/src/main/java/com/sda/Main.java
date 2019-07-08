package com.sda;

import com.sda.fibonnaci.Fibonacci;
import com.sda.starfigures.PrintFigures;

public class Main {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int i = fibonacci.fibonacciIteration(4);
        System.out.println(i);

        PrintFigures printFigures = new PrintFigures();
        printFigures.printTriangle(6);
    }
}
