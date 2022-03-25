package Homework_20220325;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task 01
        List<String> list = List.of(
                "First",
                "Second",
                "Third"
        );
        printElements(list);

        //Task 02
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list1 = convert(array);
        System.out.println(list1);

        //Task 03
        List<Double> list2 = new ArrayList<>();
        list2.add(5.4);
        list2.add(5d);
        list2.add(10.0);
        list2.add(10.006);
        Comparator<Double> comparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        };
        System.out.println("Largest value of list: " + largestValue(list2, comparator));

        //Task 04
        List<Number> dest = new ArrayList<>();
        List<Integer> src = new ArrayList<>();
        src.add(14);
        src.add(22);
        src.add(87);
        src.add(93);
        copy(dest, src);
        System.out.println(dest);

        //Task 05
        DefaultPair<String, Character> defaultPair = new DefaultPair<>();
        defaultPair.setKey("My Key");
        defaultPair.setValue('V');
        System.out.println("Key: " + defaultPair.getKey() + ", Value: " + defaultPair.getValue());
    }

    /**
     * Task 01. Write a method which takes a list of any type and prints the elements of the list.
     */
    public static <E> void printElements(List<E> list) {
        for (E e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * Task 02. Write a method that takes an array of T type and converts it to a list of type T.
     */
    public static <T> List<T> convert(T[] array) {
        return List.of(array);
    }

    /**
     * Task 03. Write a method which takes a List of T type and Comparator of type T.
     * Return the largest value in the list.
     */
    public static <T> T largestValue(List<T> list, Comparator<T> comparator) {
        T largestValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (comparator.compare(largestValue, list.get(i)) < 0) {
                largestValue = list.get(i);
            }
        }
        return largestValue;
    }

    /**
     * Task 04. Define a method copy(dest, src) which will copy from src to dest. src and dest are lists.
     * (use wildcards for this problem)
     * Method should work for this example`
     * List<Number> nums;
     * List<Integer> ints;
     * copy(nums, ints);
     * But not for this` copy(ints, nums);
     */
    public static <E> void copy(List<? super E> dest, List<? extends E> src) {
        dest.addAll(src);
    }

    /*
     * Task 05. Create Pair interface with 2 generic types and with methods getKey(), getValue().
     * Create DefaultPair class with 2 generic types which implements Pair interface.
     * DefaultPair has the following fields` key, value.
     */
}
