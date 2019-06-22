package generics;

public class Util {

    public static  <K extends Number,V> boolean compare(Pair<K,V> firstPair, Pair <K,V> secondPair){
        return firstPair.getKey().equals(secondPair.getKey()) &&
                firstPair.getValue().equals((secondPair.getValue()));
    }
}
