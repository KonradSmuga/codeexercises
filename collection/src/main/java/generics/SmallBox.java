package generics;

public class SmallBox<T extends CharSequence> extends Box<T> {


    public SmallBox(Number value, String as) {
        super((T) value, as);
    }


}
