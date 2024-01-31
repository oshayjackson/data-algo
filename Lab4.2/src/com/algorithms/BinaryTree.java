package com.algorithms;

import java.util.Optional;

public interface BinaryTree<K, V> {

    void put(K key, V value);

    // _>check if the node is greater than key move to right is less move left
    Optional<V> get(K key); // search structure -- traverse left or right
}
