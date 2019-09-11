package day0809.streamTask1;

import day0809.streamTask1.iterate.NumbersGenerator;
import day0809.streamTask1.iterate.People;

public class StreamMain {
    public static void main(String[] args) {

NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(s->s.toUpperCase())

                .filter(s -> s.length() <10)
                .forEach(System.out::println);

    }
}
