package com.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortPositive() {
        int[] array = {3, 7, 2, 15, 8, 4, 6, 5, 1};
        BubbleSort.sort(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 15);
        HashSet<Integer> actual = new HashSet<Integer>();
        actual.addAll(expected);

        assertEquals(new HashSet<>(expected), actual);
    }

    @Test
    public void sortNullArrayPositive() {
        int[] array = null;
        BubbleSort.sort(array);
        HashSet<Integer> actual = null;
        List<Integer> expected = null;

        assertEquals(expected, actual);
    }

    @Test
    public void sortEmptyArrayPositive() {
        int[] array = {};
        BubbleSort.sort(array);
        HashSet<Integer> actual = new HashSet<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        actual.addAll(expected);
        assertEquals(new HashSet<>(expected), actual);
    }


}