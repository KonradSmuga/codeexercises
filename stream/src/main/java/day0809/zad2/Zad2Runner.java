package day0809.zad2;

import java.util.stream.IntStream;

public class Zad2Runner {
    public static void main(String[] args) {
        SquareSequence squareSequence = new SquareSequence();
        System.out.println(squareSequence.next());
        System.out.println(squareSequence.next());
        System.out.println(squareSequence.next());

        DigitSequence digitSequence = new DigitSequence(1235);
        digitSequence.next();
//
//        final long l = System.currentTimeMillis();
//        final int[] ints = IntStream.rangeClosed(1, 10000)
//                .filter(e -> PrimeSequence.isPrime(e))
//                .toArray();
//        final long i2 = System.currentTimeMillis();
//
//        System.out.println(i2 - l + " ms");

        IntSequence square = new PrimeSequence();
        System.out.println("square next() " + square.next());
        System.out.println("square next() " + square.next());

    }

    public static void average(IntSequence intSequence, int n) {
        while (intSequence.hasNext()) ;
    }

}
