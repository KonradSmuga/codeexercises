package util;

public class PersonIncreasing {
    private int name;
    private int surname;

    public int getName() {
        return name;
    }

    public int getSurname() {
        return surname;
    }

    public void incrementName() {
        synchronized (this) {
            name++;

        }
    }

    public void incrementSurname() {
        synchronized (this) {
            name++;

        }

    }
}
