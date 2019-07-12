package com.sda.Strings;

public class PrintFigures {


    public void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSlash(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }


    public static void printCross(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {

            }
            System.out.println("*");
        }
    }
}


