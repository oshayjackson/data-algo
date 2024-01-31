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
        // TODO-Lab1.5: Implement test of intersection for arrays with all values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
    }

    @Test
    public void intersectionFast_identical() {
        // TODO-Lab1.5: Implement test of intersectionFast for arrays with all values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
    }

    @Test
    public void intersection_empty() {
        // TODO-Lab1.5: Implement test of intersection for arrays with no values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
    }

    @Test
    public void intersectionFast_empty() {
        // TODO-Lab1.5: Implement test of intersectionFast for arrays with no values in common, as
        //  described in test-plan.md. You may invoke helper method testForSymmetricSuccess, if you
        //  find it useful to do so.
    }

    // TODO-Lab1.5 (optional): Implement tests of intersection and intersectionFast, with a null
    //  value for one or the other (or both) of the arguments, and a NullPointerException being
    //  thrown. Try to take advantage of symmetry, and feel free to create a helper method to reduce
    //  duplicated code.

    private void testForSymmetricSuccess(int[] a, int[] b, Set<Integer> expected,
            BiFunction<int[], int[], Set<Integer>> invocation) {
        assertEquals(expected, invocation.apply(a, b));
        assertEquals(expected, invocation.apply(b, a));
    }

}
