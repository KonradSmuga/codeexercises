package com.sda.search;

import java.util.Arrays;

public class BinarySearchAlgorithm implements SearchAlgorithm {


    @Override
    public int search(int[] array, int value) {
        int begin = 0;
        int last = array.length - 1;
        int middle = 0;

        for(int i =0; i< array.length; i++){

            middle = (begin + last) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                last = middle -1;
            } else{
                begin = middle +1;
            }
        }
        return -1;
    }

}
