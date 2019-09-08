package day0809.Zad3;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class print5 {

    public static void main(String[] args) {
        printWords(5, () -> System.out.println("hello"));
        upgradePrintWords(5, (i) -> System.out.println("hello " + i));

    }

    public static void printWords(int n, Runnable runnable) {
        for (int i = 0; i < n; i++) {
            runnable.run();
        }
    }

    public static void upgradePrintWords(int n, IntConsumer consumer) {

        for (int i = 0; i < n; i++) {
            consumer.accept(i);

        }
    }
}
