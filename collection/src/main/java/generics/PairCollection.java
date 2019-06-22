package generics;

public class PairCollection<T> {

    private T pairType;

    public PairCollection(T pairType) {
        this.pairType = pairType;
    }

    public T getPairType() {
        return pairType;
    }
}
