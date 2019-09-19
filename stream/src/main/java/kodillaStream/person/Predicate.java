package kodillaStream.person;


@FunctionalInterface
public interface Predicate <T> {

    boolean test(T t);

}
