package day0809.streamTask1.library;

public class Immutable {

    private final String title;
    private final int yearOfReleaese;

    public Immutable(String title, int yearOfReleaese) {
        this.title = title;
        this.yearOfReleaese = yearOfReleaese;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfReleaese() {
        return yearOfReleaese;
    }
}
