package com.algorithms;

public class DblLinkedListNode<V> {

    private V value;
    private DblLinkedListNode<V> next;
    private DblLinkedListNode<V> previous;

    public DblLinkedListNode(V value,
            DblLinkedListNode<V> next,
            DblLinkedListNode<V> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DblLinkedListNode<V> getNext() {
        return next;
    }

    public DblLinkedListNode setNext(DblLinkedListNode<V> next) {
        this.next = next;
        return this;
    }

    public DblLinkedListNode<V> getPrevious() {
        return previous;
    }

    public DblLinkedListNode setPrevious(DblLinkedListNode<V> previous) {
        this.previous = previous;
        return this;
    }

    public V getValue() {
        return value;
    }

    public DblLinkedListNode setValue(V value) {
        this.value = value;
        return this;
    }
}
