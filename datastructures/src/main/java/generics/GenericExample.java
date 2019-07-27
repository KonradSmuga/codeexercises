package generics;

public class GenericExample {

    public static void main(String[] args) {
        Box <String> box = new Box<>("asd");
        Box <Integer> box1 = new Box<>(1);
        System.out.println(box.getValue());



    }

}
