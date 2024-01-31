package com.algorithms;

public class LinkedListNode {

    // TODO Lab 3.1.B: Modify to use generics, instead of int.

    private int value; //data member of the node
    private LinkedListNode next; // self-referential pointer

    public LinkedListNode(int value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public LinkedListNode setNext(LinkedListNode next) {
        this.next = next;
        return this;
    }

    public int getValue() {
        return value;
    }

    public LinkedListNode setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                '}';
    }

}
