package strategy.impl;

import strategy.Sort;

import java.util.Arrays;

public class QuickSort implements Sort {
    @Override
    public void execute(int[] tab) {
        Arrays.sort(tab);
    }
}
