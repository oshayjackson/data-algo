package com.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {4, 15, 2, 6, 9, 22, 13};
        System.out.println(Arrays.toString(input));
        WhileSort(input);
        System.out.println(Arrays.toString(input));
    }


    public static void sort(int[] numbers) {
        // TODO-Lab2.1: implement pseudo-code above
        if (numbers == null) {
            System.out.println("The input array is empty");
            return;
        }
        int n = numbers.length;
        int count = 0;
        for (int k = 1; k < n; k++) {
            for (int j = 0; j < (numbers.length - 1); j++) {
                count++; // O(n^2)
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println("Iterations for array of length " + numbers.length + ": " + count);

    }

    public static void WhileSort(int[] num) {
        boolean swapped = true;
        int n = num.length;
        int temp = 0;
        int count = 0;//counter to counter the number of loops, for illustration purpose only not needed for the sorting itself.

        //the list is sorted if the last loop didn't do any swaps
        while (swapped) {
            swapped = false;

            //looping through the list and swap the current position and the next position as needed
            for (int i = 0; i < n - 1; i++) {
                //swap if the value of the current position is larger than the value of the next position
                //change > to < for descending order
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    swapped = true;
                }

                //for illustration purpose only not needed for the sorting itself.
                System.out.print(count + " During Sorting: ");
                //printArr(num);
                count++;
            }
            //After one whole iteration of the inner for loop, the last element should be in the correct position, thus we don't look at again in the next iteration.
            //Hence we decrease n by 1, so the number of inner for loop will decrease by 1 in the next iteration.
            n--;

        }
    }

}
