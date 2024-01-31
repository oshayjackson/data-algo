package com.algorithms;

public class RemainderHashing implements HashProvider<Integer> {

    public static void main(String[] args) {
        RemainderHashing remainderHashing = new RemainderHashing();
        System.out.println(remainderHashing.hashKey(337481990, 1000));
        System.out.println(remainderHashing.hashKey(116241990, 1000));
        System.out.println(remainderHashing.hashKey(983611990, 1000));
        System.out.println(remainderHashing.hashKey(201031990, 1000));

        System.out.println(remainderHashing.hashKey(337481990, 1447));
        System.out.println(remainderHashing.hashKey(116241990, 1447));
        System.out.println(remainderHashing.hashKey(983611990, 1447));
        System.out.println(remainderHashing.hashKey(201031990, 1447));
    }

    public int hashKey(Integer key, int tableSize) {
        return key % tableSize;
    }

}

