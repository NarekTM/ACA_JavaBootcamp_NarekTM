package Homework_20220215;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Task 01
        System.out.print("Input starting number: ");
        int start = scan.nextInt();
        System.out.print("Input finishing number: ");
        int finish = scan.nextInt();
        allEvensFromRange(start, finish);

        //Task 02
        System.out.print("Input starting number: ");
        int a = scan.nextInt();
        System.out.print("Input finishing number: ");
        int b = scan.nextInt();
        System.out.print("Input reminder: ");
        int reminder = scan.nextInt();
        System.out.print("Input divisor: ");
        int divisor = scan.nextInt();
        printNumbersInRangeByCriteria(a, b, reminder, divisor);

        //Task 03
        System.out.print("Input starting number: ");
        int sNum = scan.nextInt();
        System.out.print("Input finishing number: ");
        int fNum = scan.nextInt();
        printAllSquaresInRange(sNum, fNum);

        //Task 04
        System.out.print("Input number: ");
        int natNum = scan.nextInt();
        System.out.print("Input any digit: ");
        int digit = scan.nextInt();
        System.out.println("Count of digit in given integer is: " + digitCountInNaturalNumber(natNum, digit));

        //Task 05
        System.out.print("Input number: ");
        int number = scan.nextInt();
        System.out.println("The reverse number of given is: " + reverseNumberOfGivenNumber(number));

        //Task 06
        System.out.print("Input number: ");
        int val = scan.nextInt();
        System.out.println("The smallest natural divisor of given number is: " + smallestNaturelDivisor(val));

        //Task 07
        System.out.print("Enter number: ");
        int xNum = scan.nextInt();
        allNaturalDivisorsOfNumber(xNum);

        //Task 08
        System.out.print("Enter number: ");
        int xVal = scan.nextInt();
        System.out.println("The count of natural divisors of given number is: " + countOfNaturalDivisors(xVal));

        //Task 09
        System.out.println("Start input your numbers: ");
        System.out.println("The sum of given 10 numbers is: " + sumOfGiven10Numbers());

        //Task 10
        System.out.print("Enter number in binary form (ex.` 1001): ");
        int binNum = scan.nextInt();
        System.out.println(convertBinaryNumberToDecimal(binNum));

        //Task 11
        System.out.print("Enter count of inputs: ");
        int countOfInputs = scan.nextInt();
        countOfZerosPosAndNegNumbers(countOfInputs);

        //Task 12
        System.out.print("Enter seconds for emulator: ");
        int seconds = scan.nextInt();
        emulatorForGNCHE1(seconds);

        //Task 13
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        printSquareByAsterisks(size);

        //Task 14
        System.out.print("Enter pattern size: ");
        int patternSize = scan.nextInt();
        printCheckerboardPattern(patternSize);

        //Task 15
        System.out.print("Enter matrix size: ");
        int matrixSize = scan.nextInt();
        matrixByNumbers(matrixSize);

        //Task 16
        System.out.print("Enter pattern size: ");
        int sizeOfPattern = scan.nextInt();
        leftAlignmentAscendingPattern(sizeOfPattern);
        System.out.println();
        leftAlignmentDescendingPattern(sizeOfPattern);
        System.out.println();
        rightAlignmentDescendingPattern(sizeOfPattern);
        System.out.println();
        rightAlignmentAscendingPattern(sizeOfPattern);


    }

    /**
     * Task 01. Write a java program to print all even numbers from a given range, from a to b. Input a and b from console.
     * Example:
     * Input` 2 5 Output` 2 4
     */
    public static void allEvensFromRange(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if ((i & 1) == 0) {
                System.out.println(i + " ");
            }
        }
    }

    /**
     * Task 02. Print all numbers on the segment from a to b that give the remainder of c when divided by d.
     * If such numbers do not exist, then you do not need to display anything.
     * Example: Input` a 2, b 5, c 0, d 2; Output` 2 4
     * i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0
     */
    public static void printNumbersInRangeByCriteria(int a, int b, int remainder, int divisor) {
        for (int i = a; i <= b; i++) {
            if (i % divisor == remainder) {
                System.out.println(i + " ");
            }
        }
    }

    /**
     * Task 03. Integers a and b are entered. It is guaranteed that a does not exceed b.
     * Print all numbers on the segment from a to b that are exact squares.
     * If there are no such numbers, then you do not need to display anything.
     * Example:
     * Input` 2, 8; Output` 4
     */
    public static void printAllSquaresInRange(int sNum, int fNum) {
        int k = 1;
        for (int i = sNum; i <= fNum; i++) {
            for (int j = k; j <= i / 2 + 1; j++) {
                if (j * j == i) {
                    System.out.println(j * j + " ");
                    k = j;
                    break;
                }
            }
        }
    }

    /**
     * Task 04. Enters 2 integer numbers : x and d from console. Count and print one number - how many times
     * the digit d occurs in the representation of a natural number x.
     */
    public static int digitCountInNaturalNumber(int natNum, int digit) {
        int count = 0;
        for (; natNum > 0; natNum /= 10) {
            if (natNum % 10 == digit) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 05. Given an integer number x.
     * Print the number consisting of the digits of the given number x in reverse order.
     * You do not need to output leading zeros.
     */
    public static int reverseNumberOfGivenNumber(int number) {
        int reverseNumber = 0;
        for (; number > 0; number /= 10) {
            reverseNumber = reverseNumber * 10 + number % 10;
        }
        return reverseNumber;
    }

    /**
     * Task 06. Given an integer number x.
     * Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
     * Example: Input` 6 Output` 2
     */
    public static int smallestNaturelDivisor(int val) {
        for (int i = 2; i <= val / 2 + 1; i++) {
            if (val % i == 0) {
                return i;
            }
        }
        return val;
    }

    /**
     * Task 07. Given an integer number x.
     * Print all natural divisors of the number x in ascending order (including 1 and the number itself).
     * Example: Input` 32 Output` 1 2 4 8 16 32
     */
    public static void allNaturalDivisorsOfNumber(int xNum) {
        for (int i = 1; i <= xNum / 2 + 1; i++) {
            if (xNum % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(xNum);
    }

    /**
     * Task 08. Given an integer x.
     * Count the number of natural divisors of x (including 1 and the number itself; x ≤ 2 ∗ 109).
     */
    public static int countOfNaturalDivisors(int xVal) {
        int countOfDivisors = 2;
        for (int i = 2; i < xVal / 2 + 1; i++) {
            if (xVal % i == 0) {
                countOfDivisors++;
            }
        }
        return countOfDivisors;
    }

    /**
     * Task 09. Calculate the sum of the given 10 natural numbers. Input integers from console.
     */
    public static int sumOfGiven10Numbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();
        }
        return sum;
    }

    /**
     * Task 10. Convert a natural number from binary to decimal (no more than 10 digits in a binary number).
     * Example: Input` 1001 Output` 9; Input` 111 Output` 7
     */
    public static int convertBinaryNumberToDecimal(int binNum) {
        int decNum = 0;
        int index = 0;
        for (; binNum > 0; binNum /= 10) {
            decNum += binNum % 10 * powerOfNumber(2, index);
            index++;
        }
        return decNum;
    }

    /**
     * Task 11. Enter the number N, followed by N integers.
     * - Count how many zeros, positive numbers, negative numbers among the given N numbers.
     * - It is necessary to print first the number of zeros, then the number of positive and negative numbers.
     */
    public static void countOfZerosPosAndNegNumbers(int countOfInputs) {
        System.out.println("Input your numbers:");
        Scanner sc = new Scanner(System.in);
        int zerosCount = 0;
        int posNumbersCount = 0;
        int negNumbersCount = 0;
        for (int i = 0; i < countOfInputs; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                zerosCount++;
            } else if (x > 0) {
                posNumbersCount++;
            } else {
                negNumbersCount++;
            }
        }
        System.out.printf("Zeros count: %d\nPositive numbers count: %d\nNegative numbers count: %d\n",
                zerosCount, posNumbersCount, negNumbersCount);
    }

    /**
     * Task 12. "GNCHE-1" is a complex electronic device that issues every second
     * the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ...
     * Due to the high cost of electronic components, you have been instructed to develop an emulator for these devices.
     * The number of seconds (from 1 to 1,000,000) is given that the generator works after being turned on.
     * Example` Input` 2, 5, 7; Output` 1 2; 1 2 2 3 3; 1 2 2 3 3 3 4
     */
    public static void emulatorForGNCHE1(int seconds) {
        int index = 1;
        int secCounter = 0;
        for (; secCounter < seconds; ) {
            for (int j = 0; j < index && secCounter < seconds; j++) {
                System.out.print(index + " ");
                secCounter++;
            }
            index++;
        }
    }

    /**
     * Task 13. Write a Java program by using two for loops to produce the output shown below:
     * Input N natural number, print picture like below (in size N*N).
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     */
    public static void printSquareByAsterisks(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j != size - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.println("*");
                }
            }
        }
    }

    /**
     * Task 14. Write a program that prompts the user for the size (a non-negative integer in int);
     * and prints the following checkerboard pattern (in size N*N).
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     */
    public static void printCheckerboardPattern(int patternSize) {
        for (int i = 1; i <= patternSize; i++) {
            for (int j = 0; j < patternSize; j++) {
                if (j != patternSize - 1) {
                    System.out.print("#  ");
                } else {
                    System.out.println("#");
                }
            }
            if (i % 2 != 0) {
                System.out.print("  ");
            }
        }
    }

    /**
     * Task 15. Write a program that prompts user for the size (a positive integer in int); and prints the multiplication table as shown:
     * Enter the size: 10
     * * |   1   2   3   4   5   6   7   8   9   10
     * --------------------------------------------
     * 1 |   1   2   3   4   5   6   7   8   9   10
     * 2 |   2   4   6   8   10  12  14  16  18  20
     * 3 |   3   6   9   12  15  18  21  24  27  30
     * 4 |   4   8   12  16  20  24  28  32  36  40
     * 5 |   5   10  15  20  25  30  35  40  45  50
     * 6 |   6   12  18  24  30  36  42  48  54  60
     * 7 |   7   14  21  28  35  42  49  56  63  70
     * 8 |   8   16  24  32  40  48  56  64  72  80
     * 9 |   9   18  27  36  45  54  63  72  81  90
     * 10 |  10  20  30  40  50  60  70  80  90  100
     */
    public static void matrixByNumbers(int matrixSize) {
        System.out.print(" * |   ");
        for (int i = 1; i <= matrixSize; i++) {
            if (i + 1 < 10) {
                System.out.print(i + "   ");
            } else {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < matrixSize * 4 + 4; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= matrixSize; i++) {
            if (i < 10) {
                System.out.print(" " + i + " |   ");
            } else {
                System.out.print(i + " |  ");
            }
            for (int j = 1; j <= matrixSize; j++) {
                if (i * j < 10 && (j + 1) * i < 10) {
                    System.out.printf("%d   ", i * j);
                } else if ((j + 1) * i < 100) {
                    System.out.printf("%d  ", i * j);
                } else {
                    System.out.printf("%d ", i * j);
                }
            }
            System.out.println();
        }
    }

    /**
     * Task 16. Write 4 programs (X = A, B, C, D) that prompts user for the size (a non-negative integer in int);
     * and prints each of the patterns as shown:
     * Enter the size: 4
     * *       ****    ****        *
     * **      ***      ***       **
     * ***     **        **      ***
     * ****    *          *     ****
     * a)      b)         c)      d)
     */
    public static void leftAlignmentAscendingPattern(int sizeLAAP) {
        for (int i = 1; i <= sizeLAAP; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftAlignmentDescendingPattern(int sizeLADP) {
        for (int i = sizeLADP; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAlignmentDescendingPattern(int sizeRADP) {
        for (int i = sizeRADP; i > 0; i--) {
            for (int j = 0; j < sizeRADP - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAlignmentAscendingPattern(int sizeRAAP) {
        for (int i = 1; i <= sizeRAAP; i++) {
            for (int j = sizeRAAP - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    ******************
    My helping methods
    ******************
     */

    public static int powerOfNumber(int number, int power) {
        if (number == 0) {
            return 0;
        } else if (power == 0) {
            return 1;
        } else {
            int pow = 1;
            for (int i = 0; i < power; i++) {
                pow *= number;
            }
            return pow;
        }
    }
}
