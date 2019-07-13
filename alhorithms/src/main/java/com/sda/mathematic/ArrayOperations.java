package com.sda.mathematic;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayOperations {

    public static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public int findMaxStream(int[] array) {
        return Arrays.stream(array)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

}
