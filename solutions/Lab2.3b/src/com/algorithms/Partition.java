package com.algorithms;

import java.security.InvalidParameterException;

// package private class
class Partition {

    public static int partition(int[] numbers, int start, int end) {
        if (numbers == null || numbers.length == 0) {
            throw new InvalidParameterException("Null or Empty Array");
        }
        int pivot = numbers[end];
        int top = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
                top++;
                swap(numbers, top, i);
            }
        }
        swap(numbers, top + 1, end);
        return top + 1;
    }

    public static void swap(int[] numbers, int j, int k) {
        if (numbers == null || numbers.length == 0) {
            return;
        }
        if (j >= 0 && k < numbers.length) {
            int temp = numbers[j];
            numbers[j] = numbers[k];
            numbers[k] = temp;
        }
    }

    // package private method
    static void printPartitions(int[] numbers, int pivot, int start, int end) {
        for (int a = start; a < pivot; a++) {
            System.out.print(numbers[a] + "_");
        }
        System.out.print("-" + numbers[pivot] + "-");
        for (int a = pivot + 1; a <= end; a++) {
            System.out.print(numbers[a] + "_");
        }
        System.out.println("\n");
    }
}
