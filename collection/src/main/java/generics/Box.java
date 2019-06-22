package generics;

import java.util.List;

public class Box<T> implements CharSequence {
    private T value;

    public Box(T value, String as) {
        this.value = value;
    }

    public T getValue() {

        return value;
    }

    public static <T extends Comparable> int method(T[] list, T b) {
        int sum = 0;
        for (T item : list) {
            if (b.compareTo(item) < 0) {
                sum++;
            }

        }
        return sum;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
