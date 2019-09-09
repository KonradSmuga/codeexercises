package day0809.streamTask1;

import java.util.List;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<String> lorem = List.of("Lorem", "Ipsum");


    }

    public static Stream<String> literki(String word) {


        List<String> tab = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            tab.add(word.substring(i, i + 1));
        }
        return tab.stream();
    }


}