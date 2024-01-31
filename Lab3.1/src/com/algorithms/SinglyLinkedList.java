package com.algorithms;

public class SinglyLinkedList {

    private LinkedListNode head;

    public void addFront(int item) {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public void appendToList(int item) {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public void deleteFront() {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public void reverse() {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    private void reverse(LinkedListNode node) {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public int traverseList(boolean print) {
        int count = 0;
        LinkedListNode curNode = head;
        while (curNode != null) {
            if (print) {
                System.out.println(curNode);
            }
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    public LinkedListNode getHead() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode cur = head;
        while (cur != null) {
            builder.append(cur);
            builder.append("\n");
            LinkedListNode next = cur.getNext();
            if (next != null) {
                cur = next;
            } else {
                cur = null;
            }
        }
        return builder.toString();
    }

}
