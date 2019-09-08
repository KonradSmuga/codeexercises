package day0809.zad2;

import java.util.Random;

public class RandomSequence implements IntSequence {

    private int min;
    private int max;
    private static Random random = new Random();

    public RandomSequence(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {

        return random.nextInt(6) +5;
    }
}
