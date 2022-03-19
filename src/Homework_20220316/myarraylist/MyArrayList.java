package Homework_20220316.myarraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements MyOtherList {
    private static final int DEFAULT_CAPACITY = 14;
    private static int currentCapacity;
    private int size;
    Integer[] elements;

    public MyArrayList() {
        this.elements = new Integer[DEFAULT_CAPACITY];
        currentCapacity = DEFAULT_CAPACITY;
    }

    public MyArrayList(int capacity) {
        if (capacity > 0 && capacity <= DEFAULT_CAPACITY) {
            this.elements = new Integer[DEFAULT_CAPACITY];
            currentCapacity = DEFAULT_CAPACITY;
        } else if (capacity > DEFAULT_CAPACITY) {
            this.elements = new Integer[capacity];
            currentCapacity = capacity;
        } else if (capacity == 0) {
            this.elements = new Integer[]{};
        } else {
            throw new IllegalArgumentException("Your input is illegal: " +
                    capacity);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer a) {
        return indexOf(a) >= 0;
    }

    @Override
    public Integer[] toArray() {
        Integer[] array = new Integer[this.size];
        for (int i = 0; i < this.size; i++) {
            array[i] = elements[i];
        }
        return array;
    }

    @Override
    public Integer get(int index) {
        checkIndex(index, 1);
        return elements[index];
    }

    @Override
    public void add(int val) {
        if (!(size <= DEFAULT_CAPACITY)) {
            doCopyArray();
        }
        elements[size] = val;
        size++;
    }

    @Override
    public void add(int index, int val) {
        checkIndex(index, 0);
        if (!(index == 0 && size == 0) && !(index == size) && size <= currentCapacity) {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        if (size == currentCapacity) {
            doCopyArray();
        }
        elements[index] = val;
        size++;
    }

    @Override
    public void set(int index, int val) {
        checkIndex(index, 1);
        elements[index] = val;
    }

    @Override
    public void remove(int index) {
        checkIndex(index, 1);
        if (!(index == size - 1)) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public int indexOf(int a) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == a) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int a) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i] == a) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        int length = this.size - 1;
        if (length == -1) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(elements[i]);
            if (i == length) {
                return sb.append(']').toString();
            }
            sb.append(", ");
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayListIterator();
    }

    private void copyArray(Integer[] array, Integer[] targetArray) {
        for (int i = 0; i < array.length; i++) {
            targetArray[i] = array[i];
        }
        //System.arraycopy(array, 0, targetArray, 0, array.length);
    }

    private void doCopyArray() {
        Integer[] tempElements = new Integer[size];
        copyArray(elements, tempElements);
        currentCapacity = size + DEFAULT_CAPACITY + DEFAULT_CAPACITY >> 1;
        elements = new Integer[currentCapacity];
        copyArray(tempElements, elements);
    }

    private void checkIndex(int index, int checker) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("The index entered cannot be a negative number.");
        }
        switch (checker) {
            case 0:
                if (index > size) {
                    throw new IndexOutOfBoundsException("The index entered is greater than ArrayList's size.");
                }
                break;
            case 1:
                if (index >= size) {
                    throw new IndexOutOfBoundsException("The index entered is greater than or equal to ArrayList's size.");
                }
                break;
        }
    }

    private class MyArrayListIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public Integer next() {
            Integer val = elements[index];
            index++;
            return val;
        }
    }
}

interface MyOtherList extends Iterable<Integer> {
    int size();

    boolean isEmpty();

    boolean contains(Integer a);

    Integer[] toArray();

    Integer get(int index);

    void add(int val);

    void add(int index, int val);

    void set(int index, int val);

    void remove(int index);

    int indexOf(int a);

    int lastIndexOf(int a);
}
