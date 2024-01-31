package com.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Set;
import java.util.function.BiFunction;
import org.junit.Before;
import org.junit.Test;

public class IntersectionTest {

    private Intersection intersection;

    @Before
    public void setUp() {
        intersection = new Intersection();
    }

    @Test
    public void intersection_nonEmpty() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};
        Set<Integer> expected = Set.of(24, 66);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_nonEmpty() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};
        Set<Integer> expected = Set.of(24, 66);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_empty() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of();
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_empty() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of();
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_subset() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{24, 87, 66};
        Set<Integer> expected = Set.of(24, 66, 87);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_subset() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{24, 87, 66};
        Set<Integer> expected = Set.of(24, 66, 87);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_identical() {
        int[] numbers1 = new int[]{0, 9, 7, 8, 6};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of(0, 6, 7, 8, 9);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersection);
    }

    @Test
    public void intersectionFast_identical() {
        int[] numbers1 = new int[]{0, 9, 7, 8, 6};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};
        Set<Integer> expected = Set.of(0, 6, 7, 8, 9);
        testForSymmetricSuccess(numbers1, numbers2, expected, intersection::intersectionFast);
    }

    @Test
    public void intersection_null() {
        testForSymmetricFailure(new int[]{0, 9, 7, 8, 6}, intersection::intersection);
    }

    @Test
    public void intersectionFast_null() {
        testForSymmetricFailure(new int[]{0, 9, 7, 8, 6}, intersection::intersectionFast);
    }

    private void testForSymmetricSuccess(int[] a, int[] b, Set<Integer> expected,
            BiFunction<int[], int[], Set<Integer>> invocation) {
        assertEquals(expected, invocation.apply(a, b));
        assertEquals(expected, invocation.apply(b, a));
    }

    @SuppressWarnings("DataFlowIssue")
    private void testForSymmetricFailure(int[] nonNullNumbers,
            BiFunction<int[], int[], Set<Integer>> invocation) {
        try {
            invocation.apply(null, nonNullNumbers);
            fail();
        } catch (NullPointerException ignored) {
            // Do nothing
        }
        try {
            invocation.apply(nonNullNumbers, null);
            fail();
        } catch (NullPointerException ignored) {
            // Do nothing
        }
        try {
            intersection.intersection(null, null);
            fail();
        } catch (NullPointerException ignored) {
            // Do nothing
        }
    }

}
