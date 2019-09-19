package kodillaStream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String name;
    private final Sex sex;
    private final LocalDate dateOfBirth;
    private int postCount;

    public ForumUser(int id, String name, Sex sex, LocalDate dateOfBirth, int postCount) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}


