package com.algorithms;

public class MergeSort {

    public static void main(String[] arg) {
        MergeSort sorter = new MergeSort();
        int[] array = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        System.out.println("Unsorted:");
        for (int a : array) {
            System.out.println(a);
        }
        sorter.mergeSort(array);
        System.out.println("Sorted:");
        for (int a : array) {
            System.out.println(a);
        }
    }

    public void mergeSort(int[] array) {
        if (array != null) {
            mergeSort(array, 0, array.length);
        }
    }

    private void mergeSort(int[] array, int start, int end) {
        // TODO-Lab2.4: Implement the logic below
        //   If sort range is not empty:
        //     1. Find middle position.
        //     2. Sort (recursively) left side (start to middle).
        //     3. Sort (recursively) right side (middle to end).
        //     4. Merge left and right sides.
    }

    private void merge(int[] array, int left, int right, int end) {
        // TODO-Lab2.4: Implement the logic below
        //   1. Create a destination array.
        //   2. Starting from the lowest position in both left and right sides, and continuing until
        //          one of the two sides is exhausted.
        //     a. If value on left is less than value on right:
        //        - Copy value from left to destination array.
        //        - Advance to next position on left.
        //        Otherwise:
        //        - Copy value from right to destination array.
        //        - Advance to next position on right.
        //     b. Advance to next position in destination array.
        //  3. Copy any remaining values from side that is not yet exhausted to destination.
        //  4. Copy values back from destination to original array.
    }

}
