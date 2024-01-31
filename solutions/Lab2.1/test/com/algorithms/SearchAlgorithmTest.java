package com.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchAlgorithmTest {

    private static final int[] haystack = {2, 4, 6, 8, 10, 12, 14, 16};
    private static final int PRESENT_NEEDLE = 12;
    private static final int MISSING_NEEDLE = 13;
    private static final int PRESENT_NEEDLE_POSITION = 5;
    private static final int MISSING_NEEDLE_POSITION = -7;
    private static final int MISSING_NEEDLE_UNKNOWN_POSITION = -1;

    @Test
    public void linearSearch_found() {
        assertEquals(PRESENT_NEEDLE_POSITION,
                SearchAlgorithm.linearSearch(PRESENT_NEEDLE, haystack));
    }

    @Test
    public void linearSearch_notFound() {
        assertEquals(MISSING_NEEDLE_UNKNOWN_POSITION,
                SearchAlgorithm.linearSearch(MISSING_NEEDLE, haystack));
    }

    @Test
    public void binarySearch_found() {
        assertEquals(PRESENT_NEEDLE_POSITION,
                SearchAlgorithm.binarySearch(PRESENT_NEEDLE, haystack));
    }

    @Test
    public void binarySearch_notFound() {
        assertEquals(MISSING_NEEDLE_POSITION,
                SearchAlgorithm.binarySearch(MISSING_NEEDLE, haystack));
    }

}