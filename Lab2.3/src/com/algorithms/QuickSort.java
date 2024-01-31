package com.algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        // int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        int[] numbers = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] numbers) {
        if (numbers != null) {
            sort(numbers, 0, numbers.length - 1);
        }
    }

    private void printPartitions(int[] numbers, int pivot, int start, int end) {
        for (int a = start; a < pivot; a++) {
            System.out.print(numbers[a] + "_");
        }
        System.out.print("-" + numbers[pivot] + "-");
        for (int a = pivot + 1; a <= end; a++) {
            System.out.print(numbers[a] + "_");
        }
        System.out.println("\n");
    }

    private void sort(int[] numbers, int start, int end) {
        // TODO-Lab2.3: Implement sort logic below
        // 1. return if the start value is greater than or equal to the end
        //    (this will happen when we are at the deepest recursion)
        // 2. call "partition" method, passing in numbers, start
        //    and end, and getting back the int position of the pivot
        // 3. call "printPartitions" method above, using numbers and the position
        //    of the pivot from partition( ), including start and end
        // 4. call this method (recursion) on the lower partition
        //    of numbers (from start to pivot-1)
        // 5. call this method (recursion) on the higher partition
        //    of number (from pivot+1 to end)
    }

    private int partition(int[] numbers, int start, int end) {
        // TODO-Lab2.3: Implement partition logic
        // - get the value at the pivot (at array index "end")
        // - start a variable called "top" just below the start
        //   ("top" will represent the top of the lower partition)
        // - iterate from start to end...each time:
        //  1. if the current array element is less than the pivot
        //      a. increment "top" by 1
        //      b. swap the two numbers at the "top" position and the current array index
        //  2. once the loop is over, swap the values at index "top+1" with "end" position
        //     this will move the pivot at the end of the array to the "top+1" position
        //  3. finally, return the top value + 1
        //     this will become the position of the new pivot for the next recursion
        return 0;
    }

    private void swap(int[] numbers, int j, int k) {
        // TODO-Lab2.3: Implement swap logic
        // - initialize a temporary int variable with the value at numbers[j]
        // - copy the value at position j with the value at position k
        // - copy the value in the temporary variable into numbers[k]
    }

}
