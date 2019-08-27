package strategy.impl;

import strategy.Sort;

public class BubbleSort implements Sort {


    @Override
    public void execute(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i] > tab[i + 1]) {
                    swap(i, i + 1, tab);


                }

            }
        }
    }
}
