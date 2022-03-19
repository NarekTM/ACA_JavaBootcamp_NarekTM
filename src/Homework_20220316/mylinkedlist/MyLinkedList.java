package Homework_20220316.mylinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList implements MyList {
    private int size;
    Node head;
    private final List<Integer> listOfVals = new ArrayList<>();

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
        return 0;
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
        listOfVals.add(val);
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = new Node(val);
        if (index == 0 && size == 0) {
            this.head = node;
        } else if (index == 0) {
            node.next = this.head;
            this.head = node;
        } else {
            Node nodeAtIndex = head;
            for (int i = 0; i < index - 1; i++) {
                nodeAtIndex = nodeAtIndex.next;
            }
            if (nodeAtIndex.next != null) {
                node.next = nodeAtIndex.next;
            }
            nodeAtIndex.next = node;
        }
        size++;
        listOfVals.add(index, val);
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0 && size == 1) {
            this.head = null;
        } else if (index == 0) {
            this.head = this.head.next;
        } else {
            Node nodeAtIndex = head;
            for (int i = 0; i < index - 1; i++) {
                nodeAtIndex = nodeAtIndex.next;
            }
            if (nodeAtIndex.next.next == null) {
                nodeAtIndex.next = null;
            } else {
                nodeAtIndex.next = nodeAtIndex.next.next;
            }
        }
        size--;
        listOfVals.remove(index);
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Empty LinkedList.";
        }
        StringBuilder sb = new StringBuilder().append(this.head.val);
        Node nodeAtIndex = head;
        while (nodeAtIndex.next != null) {
            nodeAtIndex = nodeAtIndex.next;
            sb.append(" --> ");
            sb.append(nodeAtIndex.val);
        }
        return sb.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < listOfVals.size();
        }

        @Override
        public Integer next() {
            int val = listOfVals.get(index);
            index++;
            return val;
        }
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
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

