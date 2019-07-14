package com.sda.sort.objects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ForumUserTest {

    private List<ForumUser> userList;

    @BeforeEach
    public void setUp() {
        System.out.println("set up");
        userList = new ArrayList<>();
        userList.add(new ForumUser("Konrad", "Smuga", 10));
        userList.add(new ForumUser("Matylda", "Kowalska", 121));
        userList.add(new ForumUser("Dawid", "Bronek", 300));
        userList.add(new ForumUser("Anna", "Zarebska", 24));
        userList.add(new ForumUser("Matylda", "Kowalska", 679));
        userList.add(new ForumUser("Dawid", "Bronek", 621));
        userList.add(new ForumUser("Anna", "Smuga", 2));

    }

    @Test
    public void shouldSortByFirstName() {

        // given & when
        Collections.sort(userList);
        //then
        Assert.assertEquals(userList.get(0).getName(), "Anna");
    }

    @Test
    public void shouldSortByFirstNameUsingStream() {

        // given & when
        List<ForumUser> sortedList = userList.stream()
                .sorted()
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(userList.get(0).getName(), "Anna");
    }


    @Test
    public void shouldSortByFirstNameAndLastName() {

        // given & when
        Collections.sort(userList, new Comparator<ForumUser>() {
            @Override
            public int compare(ForumUser o1, ForumUser o2) {
                int firstNameResult = o1.getName().compareTo(o2.getName());
                if (firstNameResult == 0) {
                    return o1.getSurname().compareTo(o2.getSurname());
                }
                return firstNameResult;
            }
        });

        //then
        Assert.assertEquals(userList.get(0).getName(), "Anna");
        Assert.assertEquals(userList.get(0).getSurname(), "Smuga");
    }

    @Test
    public void shouldSortByPostsUsingStaticComparatorFromClass() {

        // given & when
        Collections.sort(userList, ForumUser.getPostComparator() );

        //then
        Assert.assertEquals(userList.get(0).getPostCount(), 2);
        Assert.assertEquals(userList.get(6).getPostCount(), 679);
    }


}