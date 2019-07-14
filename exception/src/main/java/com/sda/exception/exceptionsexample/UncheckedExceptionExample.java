package com.sda.exception.exceptionsexample;

public class UncheckedExceptionExample {

    public static void main(String[] args) {

        int[] arr = new int[5];

        try {
            arr[10] = 5;
        } catch(Exception e) {
            //e.printStackTrace();
        }

        System.out.println("Some code...");

    }

}
