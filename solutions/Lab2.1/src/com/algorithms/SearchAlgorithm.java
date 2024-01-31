package com.algorithms;

public class SearchAlgorithm {

    public static int linearSearch(int needle, int[] haystack) {
        int position = -1;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static int binarySearch(int needle, int[] haystack) {
        int low = 0;
        int high = haystack.length;
        int position = -1;
        int iterationCounter = 0;
        while (low < high) {
            iterationCounter++;
            int middle = (low + high) / 2;
            int middleValue = haystack[middle];
            if (middleValue < needle) {
                low = middle + 1;
                position = ~low;  // Bitwise form of position = -(low + 1)
            } else if (middleValue > needle) {
                high = middle;
            } else {
                position = middle;
                break;
            }
        }
        System.out.println(iterationCounter);
        return position;
        // For the recursive implementation, comment out all the lines in this method above this
        // one, and uncomment the line following this one.
//        return binarySearch(needle, haystack, 0, haystack.length);
    }

    private static int binarySearch(int needle, int[] haystack, int low, int high) {
        int position;
        if (low < high) {
            int middle = (low + high) / 2;
            int middleValue = haystack[middle];
            position = (middleValue < needle)
                    ? binarySearch(needle, haystack, middle + 1, high)
                    : (middleValue > needle)
                            ? binarySearch(needle, haystack, low, middle)
                            : middle;
        } else {
            position = ~low; // Bitwise form of position = -(low + 1)
        }
        return position;
    }

    public static void main(String[] args) {
        int[] sorted = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println(SearchAlgorithm.linearSearch(7, sorted));
        System.out.println(SearchAlgorithm.linearSearch(8, sorted));
        System.out.println(SearchAlgorithm.binarySearch(7, sorted));
        System.out.println(SearchAlgorithm.binarySearch(8, sorted));
    }

}
