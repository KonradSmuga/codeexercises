package com.sda.exception.exceptionsexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        File file = new File("file.txt");
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            //kod który wykona sie po zlapaniu wyjatku FileNotFoundException
        }

    }

}
