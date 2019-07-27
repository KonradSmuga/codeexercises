package List;

public interface SdaGenericList<T> {

    void add(T input);

    T get(int index);

    boolean remove(int index);

    int size();

    boolean contains(T value);

    boolean isEmpty();

    void clear();
}
