package day0809.streamTask1;

import java.util.List;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        final List<String> lorem = List.of("Lorem", "Ipsum", "Katarzyna", "Kowalska", "Ada", "XYZ");


        System.out.println(getFirstLetter(List.of("Lorem", "Ipsum")));
//streamem to samo co u dało
        lorem.stream()
                .filter(e -> e.length() > 5)
                .collect(Collectors.toList());

    }

    public static List<Character> getFirstLetter(List<String> words) {
        List<Character> collect = words.stream()
                .map(e -> e.charAt(0))
                .collect(Collectors.toList());

        return collect;
    }

    //zwykly sposob
    private static List<String> getLongWords(List<String> lorem) {

        List<String> list = new ArrayList<>();
        for (String word : lorem) {
            if (word.length() > 5) {
                list.add(word);
            }
        }
        return list;
    }
}

