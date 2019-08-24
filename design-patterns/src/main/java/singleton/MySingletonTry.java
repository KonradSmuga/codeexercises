package singleton;

public class MySingletonTry {
    private static MySingletonTry ourInstance = null;

    public static MySingletonTry getInstance() {
        if (ourInstance == null) {
            ourInstance = new MySingletonTry();
        }
        return ourInstance;
    }

    private MySingletonTry() {
    }
}
