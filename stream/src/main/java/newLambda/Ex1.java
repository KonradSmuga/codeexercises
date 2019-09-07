package newLambda;


import java.util.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        sumOf(new LinkedList<>());
    }

    public static int sumOf(List<Integer> integers) {
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }

        for(int a : integers){

        }
        return sum;
    }
}
