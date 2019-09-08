package day0809.zad2;

import java.util.Random;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();
//1
    public static IntSequence randomInts(int min, int max) {
        return new RandomSequence(min, max);
    }
//2
    public static IntSequence randomInts2(int min, int max) {
        Random random = new Random();
        return () -> random.nextInt(max - min +1) +5;

    }

}
