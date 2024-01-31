package com.algorithms;

import java.util.LinkedList;

public class ChainedHashTable<K, V> implements HashTable<K, V> {

    private final HashProvider<K> hashProvider;
    private final LinkedList<Pair<K, V>>[] array; // array of linkedLists --> linkedList node is Values (Pair)

    public ChainedHashTable(int capacity, HashProvider<K> hashProvider) {

        array = new LinkedList[capacity];  // array = new int[capacity]
        // initiating an array of LinkedList object
        for (int i = 0; i < capacity; i++) {
            array[i] = new LinkedList<>();
        }
        this.hashProvider = hashProvider;
    }

    public static void main(String args[]) {
        ChainedHashTable<Integer, String> chainedHashTable
                = new ChainedHashTable<>(10, new RemainderHashing());

        chainedHashTable.put(12, "Isabel");
        chainedHashTable.put(22, "Ruth");
        chainedHashTable.put(32, "Michelle");
        chainedHashTable.put(11, "James");
        chainedHashTable.put(21, "John");
        chainedHashTable.put(31, "Peter");

        System.out.println(chainedHashTable.get(12));
        System.out.println(chainedHashTable.get(22));
        System.out.println(chainedHashTable.get(32));
        System.out.println(chainedHashTable.get(11));
        chainedHashTable.remove(11);
        System.out.println(chainedHashTable.get(11));
        System.out.println(chainedHashTable.get(21));
        System.out.println(chainedHashTable.get(31));
        System.out.println(chainedHashTable.get(42));
        System.out.println(chainedHashTable.get(45));
        chainedHashTable.remove(31);
        System.out.println(chainedHashTable.get(31));
    }

    public void put(K key, V value) {
        // TODO-Lab4.1: Implement the logic below
        // 1. get the int hash code by calling the hashKey( )
        //    method of the hashProvider, passing to
        //    passing to it the key argument and the length of the array
        //    because this is a remainder hash, this method will return a number
        //    between 0 and the length of the array
        // 2. then use this value to find the appropriate
        //    element of the array and add a new Pair (key, value)
        //    to the beginning of the LinkedList
    }

    public V get(K key) {
        // TODO-Lab4.1: Implement the logic below
        // 1. If the key is null, return null
        // 2. Get the int hash value by calling the hashKey( )
        //    method of the hashProvider, passing
        //    to it the key argument and the length of the array.
        //    Because this is a remainder hash,
        //    this method will return a number between 0
        //    and the length of the array.
        // 3. Get a linked list of Pair<K, V> using the
        //    hashValue as the index off the array.
        // 4. For each Pair<K, V> from the list:
        //    a. Get the key k from the Pair.
        //    b. If k is equal to the value of the key parameter,
        //       return the value v from the Pair.
        // 5. if not found, return null.
        return null;
    }

    public void remove(K key) {
        if (key == null) {
            return;
        }
        int hashValue = hashProvider.hashKey(key, array.length);
        LinkedList<Pair<K, V>> lList = array[hashValue];
        K curKey = null;
        Pair<K, V> pair = null;
        for (Pair<K, V> p : lList) {
            curKey = p.getKey();
            if (curKey.equals(key)) {
                pair = p;
                break;
            }
        }
        lList.remove(pair);
    }

}

