package com.algorithms;

public class Queue<V> {

    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("2 values added to queue");
        System.out.println("Now try to remove both values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());

    }

    public void enqueue(V item) {
//     add an item to the queue
//     pseudo code
//        create new node from item, null previous and next
//        if head is null:
//            point head and tail at new node
//        else:
//            set tail next to new node
//            set new node's previous to tail
//            set tail to new node
        DblLinkedListNode node = new DblLinkedListNode(item, null, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    public V dequeue() {
//     get and remove an item from the queue
//     pseudo code
//        1. if head is null
//              return null
//        2. node = the node head is pointing at
//        3. head = head.next
//        4. if head is not null:
//                set head previous to null
//        5. return node.value
        if (head == null) {
            return null;
        }
        V value = null;
        value = head.getValue();
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        }
        return value;
    }
}
