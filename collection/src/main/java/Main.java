
import generics.*;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        List<String> listTwo = new ArrayList<>();
//
//        listTwo.add("Yellow");
//        listTwo.add("Black");
//        listTwo.add("Red");
//        Collections.sort(listTwo);
//        for (int i = listTwo.size() -1; i >= 0; i --){
//            System.out.println(listTwo.get(i));
//        }
//
//        System.out.println(listTwo.get(0));
//        System.out.println(listTwo.get(listTwo.size()-1));
//
//        Color color = new Color("Red");
//        Color color1 = new Color("Black");
//        Color color2 = new Color("Blue");
//
//        TreeSet<Color> colors = new TreeSet<>();
//        colors.add(color);
//        colors.add(color1);
//        colors.add(color2);
//
//        for(Color typeColor : colors){
//            System.out.println(typeColor);


        Box<Integer> stringBox = new Box<>(5, "asd");
        Box<Integer> integerBox = new Box<>(4, "as");

        Pair<Integer, String> pairBox = new Pair<>(1, "as");
        Pair<Integer, String> pairBox2 = new Pair<>(2, "ds");


        PairCollection<Pair<Integer, String>> pairCollection = new PairCollection<>(pairBox);
        Util.compare(pairBox, pairBox2);

        Integer number1 = 6;


        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int method = Box.method(intArr, number1);

        System.out.println(method);

//        SmallBox<CharSequence> smallBox1 = new SmallBox<>(1, "asd");
//        LinkedList<Box> listBox = new LinkedList<>();
//        listBox.add(smallBox1);
        Box<String> an = new SmallBox<>(1, "an");


    }
}
