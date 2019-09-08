package newLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class E3Sort {

    public static void main(String[] args) {


        String[] strings = {"Rafał", "Justyna", "Katarzyna", "Dawid"};
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings, new StringLenghComparator());
        System.out.println(Arrays.toString(strings));


    }


}

class StringLenghComparator implements Comparator<String> {
    //przy minusie zostawia pierwszy, prrzy plusie zamienia
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}