package com.algorithms;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class SimpleBinaryTree<K, V> implements BinaryTree<K, V> {

    protected BinaryTreeNode<K, V> root;

    public static void main(String[] args) {
        SimpleBinaryTree<Integer, String> binaryTree = new SimpleBinaryTree<Integer, String>();
        System.out.println(binaryTree.minKey());
        binaryTree.put(457998224, "Isabel");
        binaryTree.put(366112467, "John");
        binaryTree.put(671031776, "Ruth");
        binaryTree.put(225198452, "Sarah");
        binaryTree.put(419274013, "Peter");
        binaryTree.put(751965387, "Tom");

        System.out.println(binaryTree.get(366112467));
        System.out.println(binaryTree.get(457998224));
        System.out.println(binaryTree.get(671031776));
        System.out.println(binaryTree.get(225198452));
        System.out.println(binaryTree.get(419274013));
        System.out.println(binaryTree.get(751965387));

        binaryTree.put(751965387, "Sam");

        System.out.println(binaryTree.get(751965387));
        System.out.println(binaryTree.get(999999999));
        System.out.println(binaryTree.minKey());

        binaryTree.printDfs();
        binaryTree.printBfs();
    }

    public void put(K key, V value) {
        if (root == null) {  // binary tree is empty
            root = new BinaryTreeNode<>(key, value);
        } else {
            put(key, value, root);
        }
    }

    private void put(K key, V value, BinaryTreeNode<K, V> node) {

        if (((Comparable) key).compareTo(node.getKey()) == 0) {
            node.setKey(key);
            node.setValue(value);
        } else if (((Comparable) key).compareTo(node.getKey()) < 0) {
            if (node.getLeft().isPresent()) {
                put(key, value,
                        node.getLeft().get());  // traverse recursively to the left side of the tree
            } else {
                node.setLeft(new BinaryTreeNode<>(key, value));
            }
        } else { // > traverse to right
            if (node.getRight().isPresent()) {
                put(key, value, node.getRight()
                        .get());  //traverse recursively to the right side of the tree
            } else {
                node.setRight(new BinaryTreeNode<>(key, value));
            }
        }


    }

    public Optional<V> get(K key) {
        return Optional.ofNullable(root).flatMap(n -> get(key, n));
    }

    private Optional<V> get(K key, BinaryTreeNode<K, V> node) {
        if (((Comparable) key).compareTo(node.getKey()) == 0) {
            return Optional.of(node.getValue());
        } else if (((Comparable) key).compareTo(node.getKey()) < 0) {
            return node.getLeft().flatMap(n -> get(key, n));
        } else {
            return node.getRight().flatMap(n -> get(key, n));
        }
    }

    public Optional<K> minKey() {
        return Optional.ofNullable(root).map(this::minKey);
    }

    protected K minKey(BinaryTreeNode<K, V> node) {
        return node.getLeft().map(this::minKey).orElse(node.getKey());
    }

    public Optional<K> maxKey() {
        return Optional.ofNullable(root).map(this::maxKey);
    }

    protected K maxKey(BinaryTreeNode<K, V> node) {
        return node.getRight().map(this::maxKey).orElse(node.getKey());
    }

    public void printBfs() {
        Optional.ofNullable(root).ifPresent(r -> {
            Queue<BinaryTreeNode<K, V>> queue = new LinkedList<>();
            queue.add(r);
            queue.toArray();
            while (!queue.isEmpty()) {
                BinaryTreeNode<K, V> node = queue.remove();
                System.out.println(node.getKey() + ": " + node.getValue());
                node.getLeft().ifPresent(queue::add);
                node.getRight().ifPresent(queue::add);
            }
        });
    }

    public void printDfs() {
        Optional.ofNullable(root).ifPresent(this::printDfs);
    }

    private void printDfs(BinaryTreeNode<K, V> node) {
        //System.out.println("PREORDER " + node.getKey());
        node.getLeft().ifPresent(this::printDfs);
        // System.out.println("INORDER " + node.getKey());
        node.getRight().ifPresent(this::printDfs);
        System.out.println("POSTORDER " + node.getKey());
    }

}
