package com.algorithms;

public class SinglyLinkedList<V> {

    private LinkedListNode<V> head;

    public SinglyLinkedList() {

        head = null;
    }

    public void addFront(V item) {

        this.head = new LinkedListNode<>(item, head);
    }

    public void appendToList(V item) {

        LinkedListNode<V> newNode = new LinkedListNode<V>(item, null);

        LinkedListNode<V> pointerNode = this.head;
        if (pointerNode != null) {
            while (pointerNode.getNext() != null) {
                pointerNode = pointerNode.getNext();
            }
            pointerNode.setNext(newNode);
        } else {
            head = newNode;
        }
    }

    public void deleteFront() {
        LinkedListNode<V> firstNode = this.head;

        if (firstNode != null) {
            LinkedListNode<V> node = head.getNext();
            if (node != null) {
                this.head.setNext(null);
                this.head = node;
            } else {
                this.head = null;
            }
        }

    }

    public LinkedListNode<V> getHead() {
        return head;
    }

    public void reverseRecursively() {
        reverse(head);
    }

    private void reverse(LinkedListNode<V> node) {
        if (node == null) {
            return;
        }
        reverse(node.getNext());
        System.out.println(node.getValue());
    }

    public int traverseList(boolean print) {
        int count = 0;
        LinkedListNode<V> curNode = getHead();
        while (curNode != null) {
            if (print) {
                System.out.println(curNode.toString());
            }
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode<V> cur = head;
        while (cur != null) {
            builder.append(cur);
            builder.append("\n");
            LinkedListNode<V> next = cur.getNext();
            if (next != null) {
                cur = next;
            } else {
                cur = null;
            }
        }
        return builder.toString();
    }

}
