package com.algorithms;

public class MergeSort {

    public static void main(String[] arge) {
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
        // delegate to private mergeSort.  Follow example in QuickSort
        if (array != null) {
            mergeSort(array, 0, array.length - 1);
        }
    }

    private void mergeSort(int[] array, int start, int end) {
//    pseudo code:
//        mergeSort(array, start, end)
//        if start<end
//           middle = (end-start)/2 + start
//           mergeSort(array, start, middle)
//           mergeSort(array, middle+1, end)
//           merge(array, start, middle, end)
        if (start < end) {
            int middle = (end - start) / 2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }

    }

    private void merge(int[] array, int start, int middle, int end) {

        int lsub = start;
        int rsub = middle + 1;
        int[] arrayTemp = new int[(end - start) + 1];
        for (int k = 0; k < arrayTemp.length; k++) {
            if (lsub <= middle && (rsub > end || array[lsub] <= array[rsub])) {
                arrayTemp[k] = array[lsub];
                lsub++;
            } else {
                arrayTemp[k] = array[rsub];
                rsub++;
            }
        }
        System.arraycopy(arrayTemp, 0, array, start, arrayTemp.length);
    }
}
