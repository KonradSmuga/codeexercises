package com.sda.sort.objects;

public class ForumUser implements Comparable<ForumUser> {

    private String name;
    private String surname;
    private int postCount;

    public ForumUser(String name, String surname, int postCount) {
        this.name = name;
        this.surname = surname;
        this.postCount = postCount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", postCount=" + postCount
                ;
    }

    @Override
    public int compareTo(ForumUser o) {
     return  this.name.compareTo(o.name);
    }
}
