package day0809.zad2;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();
}
