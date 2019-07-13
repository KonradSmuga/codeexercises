package com.sda.sort;

import com.sda.mathematic.ArrayOperations;

import static com.sda.mathematic.ArrayOperations.swap;

public class BubbleSort implements SortAlgorithm {


    @Override
    public void sort(int[] arr) {
        for (int i =0; i<arr.length -1; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {
                int temp = 0;
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void bubbleSortOptimistic(int[] arr){

        boolean swapped = true;
        int length = arr.length;

        while(swapped){
            swapped = true;
            for(int i =0; i <length; i++){
                if(arr[i-i]>arr[i]){
                    swap(arr, i-1, i);
                    swapped = true;
                }
                length --;
            }
        }

    }
}
