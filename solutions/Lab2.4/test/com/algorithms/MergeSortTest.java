package com.algorithms;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MergeSortTest {

    @Test
    public void mergeSortPositive() {
        int[] unsortedArray = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        int[] sortedArray = new int[]{1, 3, 4, 5, 16, 17, 21, 33};
        new MergeSort().mergeSort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    public void mergeSortNullArrayPositive() {
        int[] unsortedArray = null;
        try {
            new MergeSort().mergeSort(unsortedArray);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test
    public void mergeSortEmptyArrayPositive() {
        int[] unsortedArray = new int[]{};
        int expectedSize = 0;
        try {
            new MergeSort().mergeSort(unsortedArray);
        } catch (Exception e) {
            fail("Exception thrown");
        }
        assertEquals(expectedSize, unsortedArray.length);
    }

}