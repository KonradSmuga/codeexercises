package com.sda.search;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchAlgorithmTest {

    SearchAlgorithm searchAlgorithm = new BinarySearchAlgorithm();

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void shouldFindElementInRandomArray() {
        //given
        int arr[] = {3, 4, 5, 6, 10, 12};
        //when
        int result = searchAlgorithm.search(arr, 6);
        //then
        Assert.assertEquals(result, 3);
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
        int arr[] = {3, 4, 5, 6, 10, 12};
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
