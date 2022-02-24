package Homework_20220223;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        //Task 01 (03)
//        System.out.print("Enter a power: ");
//        int pow = scanner.nextInt();
//        System.out.println("2 to the power of " + pow + " is: " + powerOfTwo(pow));

//        //Task 02 (04)
//        System.out.print("Enter minutes: ");
//        int minutes = scanner.nextInt();
//        timeAfterPassedMinutes(minutes);

//        //Task 04 (05)
//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//        System.out.println("Is the entered number prime? ---> " + isPrime(num));

//        //Task 05 (06)
//        System.out.print("Enter the first number: ");
//        int first = scanner.nextInt();
//        System.out.print("Enter the second number: ");
//        int second = scanner.nextInt();
//        printAllPalindromesBetween(first, second);
//        printAllPalindromesBetween2(first, second);

//        //Task 06 (07)
//        System.out.print("Enter any word: ");
//        String word = scanner.nextLine();
//        System.out.println("I see your word like this: " + wordToNormalForm(word));

//        //Task 07 (08)
//        System.out.print("Enter the size of checkerboard: ");
//        int size = scanner.nextInt();
//        checkerboard(size);
//        checkerboard2(size);

//        //Task 08 (09)
//        System.out.print("Enter the first term of a geometric progression: ");
//        double fValue = scanner.nextDouble();
//        System.out.print("Enter the denominator of a geometric progression: ");
//        double r = scanner.nextDouble();
//        System.out.print("Enter number: ");
//        int n = scanner.nextInt();
//        System.out.printf("%dth term of a geometric progression is %.2f\n", n, nThTermOfGeometricProgression(fValue, r, n));

//        //Task 09 (10)
//        System.out.print("Enter a natural number: ");
//        int number = scanner.nextInt();
//        System.out.printf("Prime factors of %d: %s\n", number, expandNumberIntoPrimeFactors(number));

//        //Task 10 (11)
//        System.out.print("Enter the first size: ");
//        int h = scanner.nextInt();
//        System.out.print("Enter the second size: ");
//        int k = scanner.nextInt();
//        fillArrayWithOneLoop(h, k);

//        //Task 12 (13)
//        System.out.print("Enter the first size: ");
//        int rows = scanner.nextInt();
//        System.out.print("Enter the second size: ");
//        int columns = scanner.nextInt();
//        printArray(arrayFilledWithSnake(rows, columns));

//        //Task 13 (14)
//        System.out.print("Enter the first size: ");
//        int rowsCount = scanner.nextInt();
//        System.out.print("Enter the second size: ");
//        int columnsCount = scanner.nextInt();
//        System.out.println("Array filled with snake:");
//        printArray(arrayFilledWithSnake(rowsCount, columnsCount));
//        rotateMatrix(rowsCount, columnsCount);
    }

    /**
     * Task 01 (03). A natural number N is given (entered from the keyboard).
     * Calculate two to the power of N.
     * Display the calculated value (1 <= N <= 15).
     */
    public static int powerOfTwo(int pow) {
        int powOfTwo = 1;
        for (int i = 0; i < pow; i++) {
            powOfTwo *= 2;
        }
        return powOfTwo;
    }

    /**
     * Task 02 (04). Given number n. N minutes have passed since the beginning of the day.
     * Determine how many hours and minutes the digital clock will show at this moment.
     * The program should print two numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59).
     * Note that the number n can be more than the number of minutes in a day.
     * Example:
     * Input` 150 Output` 2 30
     * Input` 1441 Output` 0 1
     */
    public static void timeAfterPassedMinutes(int minutes) {
        int hour = minutes / 60 % 24;
        int min = minutes % 60;
        System.out.println("Clock shows: " + hour + ":" + min);
    }

    /**
     * Task 03 (05). How many times will the body of the loop be executed?
     * A - for (int i = 2; i <= 15; i ++) {...}
     * B - for (int i = 10; i <= 100; i = i+7) {...}
     * C - for (float i = 1.5; i <= 10.3; i = i+0.4) {...}
     * A - the body of the loop will be executed 14 times.
     * B - the body of the loop will be executed 13 times.
     * C - the body of the loop will be executed 23 times.
     */

    /**
     * Task 04 (05). Write a java program to determine whether the number is prime or not.
     */
    public static boolean isPrime(int num) {
        return countOfDivisors(num) <= 2;
    }

    /**
     * Task 05 (06). You are given two four-digit numbers A and B. Print all four-digit numbers on
     * the segment from A to B, the record of which is a palindrome.
     * Example:
     * Input` 1600 2100
     * Output` 1661 1771 1881 1991 2002
     */
    public static void printAllPalindromesBetween(int first, int second) {
        StringBuilder strBld = new StringBuilder();
        StringBuilder strBld2;
        for (int i = first; i <= second; i++) {
            strBld.append(i);
            strBld2 = strBldReverse(strBld);
            if (strBld.toString().equals(strBld2.toString())) {
                System.out.print(i + "  ");
            }
            strBld.delete(0, strBld.length());
            strBld2.delete(0, strBld2.length());
        }
        System.out.println();
    }

    public static void printAllPalindromesBetween2(int first, int second) {
        for (int i = first; i <= second; i++) {
            if (i == reverseNumber(i)) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    /**
     * Task 06 (07). A three-letter word is given. The word consists only of Latin letters, small and large.
     * Print the same word, where the first letter is capitalized, the rest are small.
     * Example:
     * Input` dog   Output` Dog
     * Input` CAT   Output` Cat
     * Input` Lip   Output` Lip
     */
    public static String wordToNormalForm(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder strBld = new StringBuilder(str.toLowerCase());
        strBld.insert(1, (char) (strBld.charAt(0) - 32));
        strBld.deleteCharAt(0);

        return strBld.toString();
    }

    /**
     * Task 07 (08). Enter the number N and draw an NxN checkerboard where the top left is white.
     * Designate white margins O, black margins X. Use a for loop.
     * Input` 3
     * Output`
     * O X O
     * X O X
     * O X O
     * ---------
     * Input` 8
     * Output`
     * O X O X O X O X
     * X O X O X O X O
     * O X O X O X O X
     * X O X O X O X O
     * O X O X O X O X
     * X O X O X O X O
     * O X O X O X O X
     * X O X O X O X O
     */
    public static void checkerboard(int size) {
        char[][] checkerboard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        checkerboard[i][j] = 'O';
                    } else {
                        checkerboard[i][j] = 'X';
                    }
                } else {
                    if (j % 2 == 0) {
                        checkerboard[i][j] = 'X';
                    } else {
                        checkerboard[i][j] = 'O';
                    }
                }
            }
        }
        for (char[] chArr : checkerboard) {
            for (char ch : chArr) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }

    public static void checkerboard2(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("0  ");
                    } else {
                        System.out.print("X  ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("0  ");
                    }
                }
            }
        }
    }

    /**
     * Task 08 (09). The first term and the denominator of the geometric progression are given (real numbers b1 and q, q != 0).
     * An integer n is also given. Print the n-th term of a geometric progression. Don't use the pow function, use a for loop.
     * Print the answer with precision exactly two characters after the period.
     * Example:
     * Input` 2, 2, 5       Output` 32.00
     * Input` 3.2, 1.5, 4   Output` 10.80
     */
    public static double nThTermOfGeometricProgression(double fValue, double r, int n) {
        double rPow = 1;
        for (int i = 0; i < n - 1; i++) {
            rPow *= r;
        }
        return fValue * rPow;
    }

    /**
     * Task 09 (10). A natural number >= 2 is specified. Expand it into prime factors.
     * Example:
     * Input` 120 Output` 2*2*2*3*5
     */
    public static String expandNumberIntoPrimeFactors(int number) {
        if (number < 1) {
            return "";
        }
        if (isPrime(number)) {
            return String.valueOf(number);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                sb.append(i).append(" * ");
                number /= i;
                i = 1;
            }
        }
        return sb.delete(sb.length() - 3, sb.length()).toString();
    }

    /**
     * Task 10 (11). Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with
     * the multiplication table A [i] [j] = i * j and display it. In this case, you cannot use nested loops,
     * the entire filling of the array must be done in one cycle.
     * Example:
     * Input` 3 3
     * Output`
     * 0 0 0
     * 0 1 2
     * 0 2 4
     */
    public static void fillArrayWithOneLoop(int h, int k) {
        int[][] array = new int[h][k];
        for (int i = 0, j = 0; i < h; ) {
            array[i][j] = i * j;
            j++;
            if (j == k) {
                j = 0;
                i++;
            }
        }
        printArray(array);
    }

    /**
     * Task 12 (13). Given numbers n and m. Create an array A [n] [m] and fill it with a snake (see example).
     * Example:
     * Input` 4, 10
     * Output`
     * 0  1  2  3  4  5  6  7  8  9
     * 19 18 17 16 15 14 13 12 11 10
     * 20 21 22 23 24 25 26 27 28 29
     * 39 38 37 36 35 34 33 32 31 30
     */
    public static int[][] arrayFilledWithSnake(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int num = 0;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = num++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    array[i][j] = num++;
                }
            }
        }
        return array;
    }

    /**
     * Task 13 (14). Write a java program to rotate 2D matrix
     * - - Give an opportunity to push 1 for transporting matrix by 90 degrees
     * - - Give an opportunity to push 2 for transporting matrix by 180 degrees
     * - - In other case print illegal choice
     */
    public static void rotateMatrix(int rowsCount, int columnsCount) {
        System.out.print("Enter 1 if you want to rotate matrix by 90 degrees or\n" +
                "enter 2 for rotate it by 180 degrees: ");
        int choice = scanner.nextInt();
        int[][] array = arrayFilledWithSnake(rowsCount, columnsCount);
        switch (choice) {
            case 1:
                array = rotatedMatrixBy90Degrees(array);
                break;
            case 2:
                array = rotatedMatrixBy180Degrees(array);
                break;
            default:
                System.out.println("Illegal choice, you can input only 1 or 2.");
                return;
        }
        printArray(array);
    }

    public static int[][] rotatedMatrixBy90Degrees(int[][] array) {
        int[][] arrayRotate90 = new int[array[0].length][array.length];
        for (int i = array[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                arrayRotate90[i][array.length - j - 1] = array[j][i];
            }
        }
        return arrayRotate90;
    }

    public static int[][] rotatedMatrixBy180Degrees(int[][] array) {
        int[][] arrayRotate180 = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                arrayRotate180[i][j] = array[j][i];
            }
        }
        return arrayRotate180;
    }


    /*
    ******************
    My helping methods
    ******************
     */
    public static int countOfDivisors(int num) {
        if (num == 1) {
            return 1;
        }
        int countOfDivisors = 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                countOfDivisors++;
            }
        }
        return countOfDivisors;
    }

    public static StringBuilder strBldReverse(StringBuilder strBld) {
        if (strBld == null) {
            return null;
        }
        int size = strBld.length();
        StringBuilder strBld2 = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            strBld2.append(strBld.charAt(i));
        }
        return strBld2;
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%4d ", anInt);
            }
            System.out.println();
        }
    }

    public static int reverseNumber(int number) {
        int reverseNumber = 0;
        for (; number > 0; number /= 10) {
            reverseNumber = reverseNumber * 10 + number % 10;
        }
        return reverseNumber;
    }


}
