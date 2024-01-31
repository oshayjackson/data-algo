package com.algorithms;

public interface HashTable<K, V> {

    void put(K key, V value);

    V get(K key);

    void remove(K key);
}
