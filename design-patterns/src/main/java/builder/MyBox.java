package builder;

public class MyBox <T> {

    private T someType;


    public MyBox(T dom) {
        someType = dom;
    }

    public T getDom() {
        return someType;
    }
}
