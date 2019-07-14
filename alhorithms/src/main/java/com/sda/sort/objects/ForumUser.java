package com.sda.sort.objects;

import java.util.Comparator;

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
        return this.name.compareTo(o.name);
    }

    public static Comparator<ForumUser> getPostComparator2() {
        return new Comparator<ForumUser>() {
            @Override
            public int compare(ForumUser o1, ForumUser o2) {
                return Integer.compare(o1.getPostCount(), o2.getPostCount());
            }
        };
    }

    public static Comparator<ForumUser> getPostComparator() {

//        return new Comparator<ForumUser>() {
//            @Override
//            public int compare(ForumUser o1, ForumUser o2) {
//                if (o1.getPostCount() > o2.getPostCount()) {
//                    return 1;
//                } else if (o1.getPostCount() == o2.getPostCount()) {
//                    return 0;
//                }
//                return -1;
//
        //nowszy sposób
        return Comparator.comparing(ForumUser::getPostCount);
    }
}