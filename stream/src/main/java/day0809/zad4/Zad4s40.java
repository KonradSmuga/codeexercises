package day0809.zad4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class Zad4s40 {

    public static void main(String[] args) {
        String[] tab = {"Kasia", "Ada", "Ryszard"};


        //rosnąco
        Arrays.sort(tab, compareInDirection(true));
        System.out.println(Arrays.toString(tab));


        //malejąco
        Arrays.sort(tab, compareInDirection(true));
        System.out.println(Arrays.toString(tab));
    }

    private static Comparator<String> compareInDirection(boolean ascending) {
        //1 opcja
//        if (ascending) {
//            Comparator<String> stringComparator = (o1, o2) -> o1.compareTo(o2);
//            return stringComparator;
//
//        } else {
//            Comparator<String> stringComparator = (o1, o2) -> o1.compareTo(o2) * -1;
//            return stringComparator;
//        }
        //2 opcja
        return ascending ? (x, y) -> x.compareTo(y) : (x, y) -> x.compareTo(y) * -1;
    }
}
