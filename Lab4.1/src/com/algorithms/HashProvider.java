package com.algorithms;

public interface HashProvider<K> {

    int hashKey(K key, int tableSize);

}

