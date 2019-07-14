package com.sda.search;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NaiveSearchTest {

    SearchAlgorithm searchAlgorithm = new NaiveSearch();

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void shouldFindElementInRandomArray() {
        //given
        int arr[] = {4, 5, 10, 3, 6, 12};
        //when
        int result = searchAlgorithm.search(arr, 6);
        //then
        Assert.assertEquals(result, 4);
    }

    @Test
    public void shouldFindElementInSortedArray() {
        //  given
        int arr[] = {3, 4, 5, 6, 10, 12};
        //when

        int result = searchAlgorithm.search(arr, 5);
        //then

        Assert.assertEquals(result, 2);
    }


    @Test
    public void shouldReturnInvalidIndexIfElementNotPresent() {
        //given
        int arr[] = {4, 5, 10, 3, 6, 12};
        //when
        int result = searchAlgorithm.search(arr, 13);
        //then
        Assert.assertEquals(result, -1);
    }

    @Test
    public void shouldThrowExceptionIfArrayIsNull() {
        //given
        int[] arr = null;

        //when & then
        assertThrows(NullPointerException.class, () -> {
            searchAlgorithm.search(arr, 21);
        });

    }

    @Test
    public void shouldReturnInvalidIndexIfArrayLengthIsZero() {
        //given
        int arr[] = {};
        //when
        int result = searchAlgorithm.search(arr, 6);
        //then
        Assert.assertEquals(result, -1);
    }
}