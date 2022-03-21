package Homework_20220316.mylinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList implements MyList {
    private int size;
    private Node head;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node nodeIndex = head;
        for (int i = 0; i < index; i++) {
            nodeIndex = nodeIndex.next;
        }
        return nodeIndex.val;
    }

    @Override
    public void add(int val) {
        Node node = new Node(val);
        if (size == 0) {
            this.head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = new Node(val);
        if (index == 0) {
            this.head = node;
        } else {
            Node nodeAtIndex = head;
            for (int i = 0; i < index - 1; i++) {
                nodeAtIndex = nodeAtIndex.next;
            }
            node.next = nodeAtIndex.next;
            nodeAtIndex.next = node;
        }
        size++;
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            this.head = this.head.next;
        } else {
            Node nodeAtIndex = head;
            for (int i = 0; i < index - 1; i++) {
                nodeAtIndex = nodeAtIndex.next;
            }
            nodeAtIndex.next = nodeAtIndex.next.next;
        }
        size--;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Empty LinkedList.";
        }
        StringBuilder sb = new StringBuilder().append('[');

//        Node nodeAtIndex = head;
//        while (nodeAtIndex.next != null) {
//            nodeAtIndex = nodeAtIndex.next;
//            sb.append(" --> ");
//            sb.append(nodeAtIndex.val);
//        }

        for (int val : this) {
            sb.append(val).append(" --> ");
        }
        sb.append("null]");
        return sb.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<Integer> {

//        int index = 0;
//
//        @Override
//        public boolean hasNext() {
//            return index < size;
//        }
//
//        @Override
//        public Integer next() {
//            int val = get(index);
//            index++;
//            return val;
//        }

        Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            int val = current.val;
            current = current.next;
            return val;
        }
    }

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}

interface MyList extends Iterable<Integer> {
    int size();

    boolean isEmpty();

    int get(int index);

    void add(int val);

    void add(int index, int val);

    void delete(int index);
}

