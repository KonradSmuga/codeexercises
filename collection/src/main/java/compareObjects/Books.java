package compareObjects;

public class Books {

    private String title;
    private int yearOfRelease;

    public Books(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (yearOfRelease != books.yearOfRelease) return false;
        return title != null ? title.equals(books.title) : books.title == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + yearOfRelease;
        return result;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
