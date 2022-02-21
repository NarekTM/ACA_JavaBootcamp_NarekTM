package Homework_20220217;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        //Task 01
//        System.out.print("Input size for matrix: ");
//        int n = scan.nextInt();
//        matrixWithDiag(n);

//        //Task 02
//        System.out.print("Input size for matrix: ");
//        int h = scan.nextInt();
//        matrixFromZeroOneTwo(h);
//
//        //Task 03
//        System.out.print("Input size for matrix: ");
//        int m = scan.nextInt();
//        System.out.println(isArraySymmetrical(m));
//
//        //Task 04
//        System.out.print("Input number of athletes: ");
//        int rows = scan.nextInt();
//        System.out.print("Input number of throws: ");
//        int columns = scan.nextInt();
//        hammerThrowingAthletes1(rows, columns);
//
//        //Task 05
//        System.out.print("Input number of athletes: ");
//        int rowsN = scan.nextInt();
//        System.out.print("Input number of throws: ");
//        int columnsN = scan.nextInt();
//        hammerThrowingAthletes2(rowsN, columnsN);
//
//        //Task 06
//        System.out.print("Input number of athletes: ");
//        int rowsM = scan.nextInt();
//        System.out.print("Input number of throws: ");
//        int columnsM = scan.nextInt();
//        hammerThrowingAthletes3(rowsM, columnsM);
//
//        //Task 07 (08)
//        System.out.print("Input number of rows: ");
//        int r = scan.nextInt();
//        System.out.print("Input number of columns: ");
//        int c = scan.nextInt();
//        addSameSizeMatrices(r, c);
//
        //Task 08 (09)
        System.out.print("Input number of rows: ");
        int sz = scan.nextInt();
        fillArrayInSpiralWithOnes(sz);
        System.out.println();
//
//        //Task 09 (10)
//        System.out.print("Input number of rows: ");
//        int sizeP = scan.nextInt();
//        fillArrayInSpiralWithNumbers(sizeP);
//        System.out.println();
    }


    /**
     * Task 01. Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * - the other elements are 0;
     * - print matrix
     */
    public static void matrixWithDiag(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == (n - i - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        /*
        for (int i = 0; i < n; i++) {
            array[i][n - i - 1] = 1;
        }
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 02. Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * - numbers above this diagonal are equal to 0;
     * - the numbers below this diagonal are equal to 2
     * Input n from console.
     */
    public static void matrixFromZeroOneTwo(int h) {
        int[][] array = new int[h][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (j == (h - i - 1)) {
                    array[i][j] = 1;
                } else if (j > (h - i - 1)) {
                    array[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 03. Check if the two-dimensional array is symmetrical about the main diagonal.
     * The main diagonal is the one that goes from the upper left corner of the two-dimensional array to the lower right.
     * Example`     Input` 3            Input` 3
     * 0 1 2               0 0 0
     * 1 5 3               0 0 0
     * 2 3 4               1 0 0
     * Output` YES         Output` NO
     */
    public static String isArraySymmetrical(int m) {
        //int[][] array = {{0, 1, 2}, {1, 5, 3}, {2, 3, 4}};
        int[][] array = {{0, 0, 0}, {0, 0, 0}, {1, 0, 0}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] != array[j][i] && j != i) {
                    return "No!";
                }
            }
        }

        /*
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m - 1; j++) {
                if (array[i][j] != array[j][i]) {
                    return "No!";
                }
            }
        }
         */

        //for checking diagonal is symmetrical or not
        /*
        for (int i = 0; i < m / 2; i++) {
            if (array[i][i] != array[m-i-1][m-i-1]) {
                return "No!";
            }
        }
         */

        return "Yes!";
    }

    /**
     * Task 04. There are n athletes competing in hammer throw. Each of them made m throws.
     * The winner is the athlete who has the maximum result for all throws.
     * If the athletes are renumbered from 0 to n-1, and the attempts of each of them are from 0 to m-1,
     * then the program receives an array A [n] [m], consisting of non-negative integers, as input.
     * The program should determine the maximum amount of numbers in one line and display this amount and
     * the line number for which this amount is reached.
     * Input` The program receives as input two numbers n and m, which are the number of rows and columns in the array.
     * Then in the input stream there are n lines containing m numbers each, which are the elements of the array.
     * Output` The program should display 2 numbers: the amount and the line number for which this amount is reached.
     * If there are several such lines, then the number of the smallest of them is displayed.
     * Do not forget that line numbering (for athletes) starts at 0.
     * Example` Input` 2 2 (n and m)
     * 5 4
     * 3 2
     * Output` 9 0 (max is 9, line is 0)
     */
    public static void hammerThrowingAthletes1(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int maxSum = 0;
        int maxLineIndex = 0;
        int tempSum = 0;
        System.out.println("Input throws results:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scan.nextInt();
                if (i == 0) {
                    maxSum += array[i][j];
                } else {
                    tempSum += array[i][j];
                }
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxLineIndex = i;
            }
        }
        System.out.println("Max is: " + maxSum + ", line is: " + maxLineIndex);
    }

    /**
     * Task 05. There are n athletes competing in hammer throw. Each of them made m throws.
     * The winner of the competition is the athlete who has the best result in all throws.
     * Thus, the program must find the value of the maximum element in the given array, as well as its indices
     * (that is, the number of the athlete and the number of the attempt).
     * Input` The program receives as input two numbers n and m, which are the number of rows and columns in the array.
     * Then in the input stream there are n lines containing m numbers each, which are the elements of the array.
     * Output` The program prints out the value of the maximum element, then the row number and the column number
     * in which it occurs. If there are several maximum elements in the array, then you need to display the minimum
     * line number in which such an element occurs, and if there are several such elements in this line,
     * then you need to display the minimum column number. Remember that all rows and columns are numbered from 0.
     * Example` Input ` 3 3 (n and m)
     * 3 1 2
     * 1 3 4
     * 3 3 3
     * Output` 4
     * 1 2
     */
    public static void hammerThrowingAthletes2(int rowsN, int columnsN) {
        int[][] array = new int[rowsN][columnsN];
        int max = 0;
        int maxRow = 0;
        int maxColumn = 0;
        System.out.println("Input throws results:");
        for (int i = 0; i < rowsN; i++) {
            for (int j = 0; j < columnsN; j++) {
                array[i][j] = scan.nextInt();
                if (max < array[i][j]) {
                    max = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("Max is: " + max + ", row is: " + maxRow + ", column is: " + maxColumn);
    }

    /**
     * Task 06. There are n athletes competing in hammer throw. Each of them made m throws.
     * The athlete with the highest best throw wins. If there are several of them, then the one with
     * the best sum of results for all attempts wins. If there are several of them, the athlete with
     * the minimum number is considered the winner. Determine the number of the winner of the competition.
     * Input` The program receives as input two numbers n and m, which are the number of rows and columns in the array.
     * Then in the input stream there are n lines containing m numbers each, which are the elements of the array.
     * Output` The program should display one number - the number of the winner of the competition.
     * Do not forget that the lines (athletes) are numbered from 0.
     * Input` 3 3 Output` 0(because of 7, the best result)
     * 1 2 7
     * 2 5 4
     * 4 6 1
     */
    public static void hammerThrowingAthletes3(int rowsM, int columnsM) {
        int[][] array = new int[rowsM][columnsM];
        int[] maxRowsArray = new int[rowsM];
        Arrays.fill(maxRowsArray, -1);
        int max = 0;
        System.out.println("Input throws results:");
        for (int i = 0; i < rowsM; i++) {
            for (int j = 0; j < columnsM; j++) {
                array[i][j] = scan.nextInt();
                if (max <= array[i][j]) {
                    max = array[i][j];
                    maxRowsArray[i] = i;
                }
            }
        }
        int sumOfMaxRow = 0;
        int temp = 0;
        int maxRow = 0;
        for (int i = 0; i < rowsM; i++) {
            if (maxRowsArray[i] >= 0) {
                for (int j = 0; j < columnsM; j++) {
                    temp += array[maxRowsArray[i]][j];
                }
            }
            if (sumOfMaxRow < temp) {
                sumOfMaxRow = temp;
                maxRow = maxRowsArray[i];
            }
        }
        System.out.println("Max row is: " + maxRow);
    }

    /**
     * Task 07 (08). Write a Java program to add two matrices of the same size.
     */
    public static void addSameSizeMatrices(int r, int c) {
        int[][] arrA = new int[r][c];
        int[][] arrB = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arrA[i][j] = 5;
                arrB[i][j] = 9;
            }
        }
        int[][] arrAB;
        System.out.print("Input 0 to add matrices to the bottom, and 1 on the right: ");
        switch (scan.nextInt()) {
            case 0:
                arrAB = new int[r * 2][c];
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        arrAB[i][j] = arrA[i][j];
                        arrAB[i + r][j] = arrB[i][j];
                    }
                }
                for (int i = 0; i < r * 2; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print(arrAB[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;
            case 1:
                arrAB = new int[r][c * 2];
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        arrAB[i][j] = arrA[i][j];
                        arrAB[i][j + c] = arrB[i][j];
                    }
                }
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c * 2; j++) {
                        System.out.print(arrAB[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;
        }
    }

    /**
     * Task 08 (09). It is required to fill an array with size N × N with ones in a spiral
     * (starting from the upper left corner clockwise, see example).
     * Output`
     * 1 1 1 1 1 1 1
     * 0 0 0 0 0 0 1
     * 1 1 1 1 1 0 1
     * 1 0 0 0 1 0 1
     * 1 0 1 1 1 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 1 1 1 1
     */
    public static void fillArrayInSpiralWithOnes(int sz) {
        if (sz < 3) {
            return;
        }
        int[][] array = new int[sz][sz];
        int helper = 0;
        for (int i = 0; i < sz / 3 + 1; i++) {
            for (int j = i + i / 2; j < sz - helper; j++) {
                array[i * 2][j] = 1;
            }
            for (int j = i * 2 + 1; j < sz - helper; j++) {
                array[j][sz - helper - 1] = 1;
            }
            for (int j = sz - i * 2 - 1; j > i * 2; j--) {
                array[sz - i * 2 - 1][j - 1] = 1;
            }
            for (int j = i * 2 + 2; j < sz - i * 2 - 1; j++) {
                array[sz - j][i * 2] = 1;
            }
            helper += 2;
        }
        for (int[] elemArr : array) {
            for (int elem : elemArr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 09 (10). Given number n. Create an array A [2 * n + 1] [2 * n + 1] and fill it in a spiral,
     * starting with the number 0 in the first cell A [0] [0]. The spiral goes right, then turns down.
     * Example` Input` 1 A[3][3]
     * Output`
     * 0 1 2
     * 7 8 3
     * 6 5 4
     */
    public static void fillArrayInSpiralWithNumbers(int sizeP) {
        int size = 2 * sizeP + 1;
        int[][] array = new int[size][size];
        int length = size - 1;
        int num = 0;
        int count = 0;
        for (int i = 0; i <= length / 2; i++) {
            for (int j = i; j <= length - i; j++) {
                array[i][j] = num++;
            }
            for (int j = 1; j <= length - i - count; j++) {
                array[j + count][length - i] = num++;
            }
            for (int j = 1; j <= length - count * 2; j++) {
                array[length - i][length - j - count] = num++;
            }
            for (int j = 1; j < length - count * 2; j++) {
                array[length - j - count][i] = num++;
            }
            count++;
        }
        for (int[] elemArr : array) {
            for (int elem : elemArr) {
                System.out.printf("%7d", elem);
            }
            System.out.println();
        }
    }
}
