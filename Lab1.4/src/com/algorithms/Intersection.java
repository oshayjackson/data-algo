package com.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    public static void main(String args[]) {
        int[] a = {4, 7, 5, 2, 3};
        int[] b = {4, 2, 3, 9, 1};
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersection(a, b));
        System.out.println(simpleIntersection.intersectionFast(a, b));
    }

    public Set<Integer> intersection(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    result.add(x);
                }
            }
        }
        return result;
    }

    public Set<Integer> intersectionFast(int[] a, int[] b) {
        // TODO-Lab1.4: Implement fast intersection logic here
        return null;
    }

}
