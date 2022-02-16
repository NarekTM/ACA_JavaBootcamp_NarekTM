package Homework_20220216;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        //Task 01
//        System.out.print("Input array size: ");
//        int arrSize = scan.nextInt();
//        printAllElemsOfEvenIndices(arrSize);

//        //Task 02
//        System.out.print("Input array size: ");
//        int listSize = scan.nextInt();
//        printAllEvenNumbersInArray(listSize);

//        //Task 03
//        System.out.print("Input array size: ");
//        int arrLength = scan.nextInt();
//        positiveElementsOfArray(arrLength);

//        //Task 04
//        System.out.print("Input array size: ");
//        int size = scan.nextInt();
//        printElemsOfArrayLargerThanPrevious(size);

//        //Task 05
//        System.out.print("Input array size: ");
//        int length = scan.nextInt();
//        printTwoAdjacentElementsOfTheSameSign(length);

//        //Task 06
//        System.out.print("Input array size: ");
//        int arrDim = scan.nextInt();
//        printLargestElementAndItsIndex(arrDim);

//        //Task 07
//        System.out.print("Input array size: ");
//        int arrLng = scan.nextInt();
//        smallestElementFromPositives(arrLng);

//        //Task 08
//        System.out.print("Input array size: ");
//        int arrS = scan.nextInt();
//        countOfDifferentElements(arrS);

//        //Task 09
//        System.out.print("Input array size: ");
//        int arrL = scan.nextInt();
//        printArrayInReverseOrder(arrL);

//        //Task 10
//        System.out.print("Input array size: ");
//        int listS = scan.nextInt();
//        reverseAndPrintArray(listS);
//        System.out.println();

//        //Task 11
//        System.out.print("Input array size: ");
//        int listL = scan.nextInt();
//        rearrangeAdjacentElements(listL);
//        System.out.println();

//        //Task 12
//        System.out.print("Input array size: ");
//        int listLng = scan.nextInt();
//        cycleArraysElementsRight(listLng);
//        System.out.println();

//        //Task 13
//        System.out.print("Input array size: ");
//        int n = scan.nextInt();
//        swapArraysMinAndMaxElements(n);
//        System.out.println();

//        //Task 14
//        System.out.print("Input array size: ");
//        int arraySize = scan.nextInt();
//        System.out.print("Input index: ");
//        int k = scan.nextInt();
//        shiftOneElemOfArrayToLeft(arraySize, k);
//        System.out.println();

//        //Task 15
//        System.out.print("Input array size: ");
//        int x = scan.nextInt();
//        nonRecurringElemsOfArray(x);
//        System.out.println();

//        //Task 16
//        System.out.print("Input array size: ");
//        int h = scan.nextInt();
//        compressArray(h);
//        System.out.println();


    }

    /**
     * Task 01. Print all elements of the array with even indices (that is, A [0], A [2], A [4]...)
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example: Input` 1 2 3 4 5 Output` 1 3 5
     */
    public static void printAllElemsOfEvenIndices(int arrSize) {
        int[] arr = arrayInitialization(arrSize);
        for (int i = 0; i < arrSize; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Task 02. Print all even numbered items in the list.
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example: Input` 1 2 3 4 5 10 Output` 2 4 10
     */
    public static void printAllEvenNumbersInArray(int listSize) {
        int[] arr = arrayInitialization(listSize);
        for (int i = 0; i < listSize; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

    /**
     * Task 03. Find positive elements in the given array.
     * Example: Input` 1 -1 2 3 -8 Output 1 2 3
     */
    public static void positiveElementsOfArray(int arrLength) {
        int[] arr = arrayInitialization(arrLength);
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Task 04. A list of numbers is given. Print all the elements of the list that are larger than the previous element.
     * Example: Input` 1 5 2 4 3 Output` 5 4
     */
    public static void printElemsOfArrayLargerThanPrevious(int size) {
        int[] arr = arrayInitialization(size);
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println(arr[i + 1]);
            }
        }
    }

    /**
     * Task 05. An array of numbers is given. If it has two adjacent(հարևան) elements of the same sign, print these numbers.
     * If there are no adjacent elements of the same character, do not print anything.
     * If there are several such pairs of neighbors, print the first pair.
     * Example: Input` -1 2 3 -1 -2 Output` 2 3
     */
    public static void printTwoAdjacentElementsOfTheSameSign(int length) {
        int[] arr = arrayInitialization(length);
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] >= 0 && arr[i + 1] >= 0 || arr[i] < 0 && arr[i + 1] < 0) {
                System.out.println(arr[i] + " " + arr[i + 1]);
                return;
            }
        }
    }

    /**
     * Task 06. An array of numbers is given. Print the value of the largest element in the array,
     * and then the index of that element in the array. If there are several largest elements,
     * print the index of the first of them.
     * Example: Input` 1 2 3 2 1 Output` The largest is 3 index is 2
     */
    public static void printLargestElementAndItsIndex(int arrDim) {
        int[] arr = arrayInitialization(arrDim);
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arrDim; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.printf("The largest is %d, it's index is %d\n", max, maxIndex);
    }

    /**
     * Task 07. Print the value of the smallest of all positive elements in the list.
     * It is known that the list contains at least one positive element, and the absolute value
     * of all elements of the list does not exceed 1000.
     * Example: Input` 5 -4 3 -2 1 Output ` 1
     */
    public static void smallestElementFromPositives(int arrLng) {
        int[] arr = arrayInitialization(arrLng);
        int smallestPositive = Integer.MAX_VALUE;
        for (int i = 0; i < arrLng; i++) {
            if (smallestPositive > arr[i] && arr[i] > 0) {
                smallestPositive = arr[i];
            }
        }
        System.out.println("Smallest positive value is " + smallestPositive);
    }

    /**
     * Task 08. You are given a list sorted by non-decreasing elements in it.
     * Determine how many different elements are in it.
     * Example: Input` 1 2 2 3 3 3 Output` 3
     */
    public static void countOfDifferentElements(int arrS) {
        int[] arr = arrayInitialization(arrS);
        int count = 1;
        for (int i = 0; i < arrS - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        System.out.println("Different elements count is " + count);
    }

    /**
     * Task 09. Print the elements of the given list in reverse order without changing the list itself.
     * Example: Input` 1 2 3 4 5 Output` 5 4 3 2 1
     */
    public static void printArrayInReverseOrder(int arrL) {
        int[] arr = arrayInitialization(arrL);
        for (int i = arrL - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Task 10. Rearrange the elements of this array in reverse order, then print the elements of the resulting array.
     * This task differs from the previous one in that you need to change the values of the elements of the array itself,
     * swapping A [0] with A [n-1], A [1] with A [n-2], and then display the elements of the array in a row.
     * Example: Input` 1 2 3 4 5 Output` 5 4 3 2 1
     */
    public static void reverseAndPrintArray(int listS) {
        int[] arr = arrayInitialization(listS);
        for (int i = 0; i < listS / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[listS - i - 1];
            arr[listS - i - 1] = temp;
        }
        for (int i = 0; i < listS; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 11. Rearrange the adjacent elements of the array (A [0] with A [1], A [2] with A [3], etc.).
     * If there is an odd number of elements, then the last element remains in its place.
     * Example: Input` 1 2 3 4 5 Output` 2 1 4 3 5
     */
    public static void rearrangeAdjacentElements(int listL) {
        int[] arr = arrayInitialization(listL);
        for (int i = 0; i < (listL % 2 == 0 ? listL - 1 : listL - 2); i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < listL; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 12. Cycle the elements of the array to the right (A [0] goes to A [1], A [1] to A [2], ...,
     * the last element goes to A [0]).
     * Example: Input` 1 2 3 4 5 Output` 5 1 2 3 4
     */
    public static void cycleArraysElementsRight(int listLng) {
        int[] arr = arrayInitialization(listLng);
        int lastElem = arr[listLng - 1];
        for (int i = listLng - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = lastElem;
        for (int i = 0; i < listLng; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 13. In the list, all items are different. Swap the minimum and maximum elements of this list.
     * Example: Input` 3 2 1 4 5 Output` 3 2 5 4 1
     */
    public static void swapArraysMinAndMaxElements(int n) {
        int[] arr = arrayInitialization(n);
        int min = arr[0];
        int minIndex = 0;
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            } else if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 14. You are given an array of numbers and the index of an element in the array. Index is k.
     * Remove the element with index k from the list by moving all elements to the right of the element with index k to the left.
     * The program should shift directly in the array, and not do it when displaying elements.
     * Also, you cannot use an additional array. At least decrement size of array, and print array;
     * Example` Input` 1 2 3 4 5 Output` 1 2 4 5
     * 2
     */
    public static void shiftOneElemOfArrayToLeft(int arraySize, int k) {
        int[] arr = arrayInitialization(arraySize);
        int kElem = arr[k];
        for (int i = k - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = kElem;
        for (int i = 1; i < arraySize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 15. A list is given. Print those elements of it that appear in the list only once.
     * Items should be displayed in the order in which they appear in the list.
     * Example: Input` 1 2 2 3 3 3 Output` 1
     */
    public static void nonRecurringElemsOfArray(int x) {
        int[] arr = arrayInitialization(x);
        for (int i = 0; i < x; i++) {
            boolean isNonRecItem = true;
            for (int j = 0; j < x; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isNonRecItem = false;
                    break;
                }
            }
            if (isNonRecItem) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Task 16. An array of integers is given. It is required to “compress” it by moving all non-zero elements
     * to the left side of the array without changing their order, and all zeros to the right side.
     * The order of nonzero elements cannot be changed, an additional list cannot be used, the task
     * must be completed in one pass through the array. Print the resulting array.
     * Example: Input` 1 0 3 0 5 Output` 1 3 5 0 0
     */
    public static void compressArray(int h) {
        /*
        This method needs to be changed to a working condition.
         */
        int[] arr = arrayInitialization(h);
        int temp;
        for (int i = 0; i < h; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < h - 1; j++) {
                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } else {
                for (int j = i; j > 0; j--) {
                    temp = arr[i];
                    arr[i] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    /**
     * @param size
     * @return
     */



    /*
    ******************
    My helping methods
    ******************
     */
    public static int[] arrayInitialization(int size) {
        System.out.println("Input array values:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }


}
