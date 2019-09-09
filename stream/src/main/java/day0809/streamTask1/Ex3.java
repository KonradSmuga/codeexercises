package day0809.streamTask1;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println(randomNumbers());
        System.out.println(listOfNumbers());

//        System.out.println(sum());
    }

    public static List<Integer> randomNumbers() {

//        return Stream.generate(() -> Math.random())
//                .limit(100)
//                .collect(Collectors.toList());
//
//
        Random random = new Random();
        random.nextInt(1001);
        return Stream.generate(() -> random.nextInt(1000))
                .limit(100)
                .collect(Collectors.toList());

    }

    public static List<Integer> listOfNumbers() {

        return Stream.iterate(0, n -> n + 1)
                .limit(11)
                .collect(Collectors.toList());
    }

    public static int sum(Stream<Integer> integerStream) {
        int sum = integerStream.mapToInt(Integer::intValue)
                .sum();

        return sum;
    }

    public static int sum2(Stream<Integer> integerStream) {


        //do poprawy
        return sum(integerStream);
    }
}