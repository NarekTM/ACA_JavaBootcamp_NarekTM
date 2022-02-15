package Homework_20220214;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 01
//        intNumsFrom1To10();

        //Task 02
//        evenIntNumsFrom1To20();

        //Task 03
//        System.out.print("Input number: ");
//        int num = sc.nextInt();
//        squareOfNatNumsBeforeGivenInt(num);

        //Task 04
//        System.out.print("Input number: ");
//        int val = sc.nextInt();
//        System.out.println(smallestDivisor(val));

        //Task 05
//        System.out.print("Input number: ");
//        int bound = sc.nextInt();
//        powersOfTwoBeforeGivenNumber(bound);

        //Task 06
//        System.out.print("Input number: ");
//        int num2 = sc.nextInt();
//        allIntsInDescOrderBeforeGivenNum(num2);

        //Task 07
//        System.out.print("Input number: ");
//        int val2 = sc.nextInt();
//        allIntsMultipleTo2BeforeGivenNum(val2);

        //Task 08
//        inputNumsTillPowOf2();

        //Task 09
//        System.out.print("Input number: ");
//        int num3 = sc.nextInt();
//        System.out.println(powOfTwoGraterThanGivenNumber(num3));

        //Task 10
//        asciiTableOfCharacters();

        //Task 11
//        System.out.print("Input number: ");
//        int val3 = sc.nextInt();
//        printIntNumsExceptMultsOf3(val3);

        //Task 12
//        System.out.print("Input number to check: ");
//        int fibNumCheck = sc.nextInt();
//        System.out.println(fibonacciNumberOfGivenInt(fibNumCheck));

        //Task 13
//        System.out.print("Input first day's km: ");
//        double firstDayKm = sc.nextDouble();
//        System.out.print("Input last day's km: ");
//        double lastDayKm = sc.nextDouble();
//        System.out.println(numberOfDayWhichHeRunAtLeastGivenMileage(firstDayKm, lastDayKm));

        //Task 14
//        System.out.print("Input deposit amount: ");
//        int deposit = sc.nextInt();
//        System.out.print("Input percent: ");
//        int percent = sc.nextInt();
//        System.out.print("Input needed dollars amount: ");
//        int neededDollars = sc.nextInt();
//        System.out.println(necessaryYearsForContribution(deposit, percent, neededDollars));

        //Task 15
//        System.out.println(secondLargestElementOfSequence());

        //Task 16
//        guessRandomGeneretedNumber();

        //Task 17
//        System.out.print("Enter integer number: ");
//        int num4 = sc.nextInt();
//        System.out.println(sumOfDigitsOfNumber(num4));
    }

    /**
     * Task 01. Print all integer numbers from 1 to 10.
     */
    public static void intNumsFrom1To10() {
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
    }

    /**
     * Task 02. Print all even integer numbers from 1 to 20.
     */
    public static void evenIntNumsFrom1To20() {
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }

    /**
     * Task 03. Print all exact squares of natural numbers that are not exceeding a given positive integer N.
     * Input N from console. Example` Input number - 15 Output ` 1 4 9
     */
    public static void squareOfNatNumsBeforeGivenInt(int num) {
        int i = 1;
        while ((i * i) <= num) {
            System.out.print(i * i + " ");
            i++;
        }
    }

    /**
     * Task 04. Given an integer number, greater than 2. Find and print the smallest natural divisor other
     * than 1 for a given number. Input number from console. Example: Input` 15 Output` 3
     */
    public static int smallestDivisor(int num) {
        if (num <= 2) {
            System.out.println("Your input doesn't greater than 2.");
            return 0;
        }
        int divisor = 2;
        while (divisor < num) {
            if (num % divisor == 0) {
                return divisor;
            }
            divisor++;
        }
        return num;
    }

    /**
     * Task 05. Print all integer powers of two not exceeding N in ascending order. Input N from console.
     * Example: Input 50 (You can not use Math.pow()) Output` 1 2 4 8 16 32
     */
    public static void powersOfTwoBeforeGivenNumber(int num) {
        int powsOfTwo = 1;
        while (true) {
            if (isPowToTwo(powsOfTwo)) {
                System.out.println(powsOfTwo);
            }
            powsOfTwo++;
            if (powsOfTwo > num) {
                break;
            }
        }
    }

    /**
     * Task 06. For a given integer number N, print all integers in descending order.
     */
    public static void allIntsInDescOrderBeforeGivenNum(int num) {
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }
    }

    /**
     * Task 07. For a given integer number N, print all integers that are multiple of 2 in descending order.
     */
    public static void allIntsMultipleTo2BeforeGivenNum(int num) {
        while (num > 0) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num--;
        }
    }

    /**
     * Task 08. Input N natural number till N would be the exact power of 2.
     * If N is the exact power of 2:
     * - Print N
     * - Print count of input integers
     * - break loop
     */
    public static void inputNumsTillPowOf2() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Input number: ");
            int num = scan.nextInt();
            count++;
            if (isPowToTwo(num)) {
                System.out.println("Power of two: " + num + "\nCount of inputs: " + count);
                break;
            }
        }
    }

    /**
     * Task 09. For a given natural N print the smallest integer k that` Math.pow(2,k) ≥ N. (You can not use Math.pow())
     * Example: Input 7 Output 3
     */
    public static int powOfTwoGraterThanGivenNumber(int num) {
        int powOfTwo = 1;
        int count = 0;
        while (powOfTwo < num) {
            powOfTwo *= 2;
            count++;
        }
        return count;
    }

    /**
     * Task 10. Write Java program to print the table of characters that are equivalent to the Ascii codes from 32 to 122.
     * Print 10 characters at each line.
     */
    public static void asciiTableOfCharacters() {
        int i = 33;
        int count = 0;
        while (i <= 122) {
            char ch = (char) i;
            System.out.print(ch + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
            i++;
        }
    }

    /**
     * Task 11. Print all integer numbers from 1 to N, except that are multiple of 3 (Input N from console).
     */
    public static void printIntNumsExceptMultsOf3(int num) {
        int i = 1;
        while (i <= num) {
            if (i % 3 == 0) {
                i++;
                continue;
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    /**
     * Task 12. Given integer number A > 1, define what is the Fibonacci number is A, i.e. print such number n that φn=A.
     * If A is not a Fibonacci number print -1.
     * Example:
     * Input 8 Output 6
     * Input 10 Output -1
     */
    public static int fibonacciNumberOfGivenInt(int num) {
        int i = 0;
        int fib = 0;
        while (fib <= num) {
            i++;
            fib = fibonacci(i);
            if (fib > num) {
                break;
            } else if (fib == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Task 13. On the first day, the athlete ran x kilometers,and then every day he increased the mileage by 10% from the previous value,
     * Given the number y, determine the number of the day for which the athlete's mileage will be at least y kilometers.
     * Example: Input` 10, 20; Output` 9
     */
    public static int numberOfDayWhichHeRunAtLeastGivenMileage(double firstDayKm, double lastDayKm) {
        int day = 1;
        while (firstDayKm < lastDayKm) {
            firstDayKm *= 1.1;
            day++;
        }
        return day;
    }

    /**
     * Task 14. The deposit in the bank is x dollars. It increases annually by p percent, after which the fractional part of cents is discarded.
     * Determine how many years the contribution(ներդրում) will be at least y dollars. (Input x, p, y from console)
     * Example:
     * Input` 100, 10, 200; Output` 8
     */
    public static int necessaryYearsForContribution(int deposit, int percent, int neededDollars) {
        int years = 0;
        while (deposit < neededDollars) {
            deposit *= 1.1;
            years++;
        }
        return years;
    }

    /**
     * Task 15. The sequence consists of different natural numbers and ends with the number 0.
     * Determine the value of the second-largest element in this sequence.
     * (A sequence of natural numbers is introduced, ending with the number 0 (the number 0 itself is not included in the sequence,
     * but serves as a sign of its termination)).
     * Input` 1, 7, 9, 0; Output` 7
     */
    public static int secondLargestElementOfSequence() {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int secondMax = 0;
        int num;
        while ((num = scan.nextInt()) != 0) {
            if (max < num) {
                secondMax = max;
                max = num;
            } else if (secondMax < num) {
                secondMax = num;
            } else {
                continue;
            }
        }
        return secondMax;
    }

    /**
     * Task 16. Write a program that generates a random number and asks the user to guess what the number is.
     * If the user’s guess is higher than the random number, the program should display Too high, try again.
     * If the user’s guess is lower than the random number, the program should display Too low, try again.
     * If you find the number print Yes, you guessed the number. The program should use a loop that repeats until
     * the user correctly guesses the random number.
     */
    public static void guessRandomGeneretedNumber() {
        Random rand = new Random();
        int numForGuess = rand.nextInt(1000);
        Scanner scan = new Scanner(System.in);
        int guessNum = numForGuess - 1;
        while (guessNum != numForGuess) {
            System.out.print("Enter your guess: ");
            guessNum = scan.nextInt();
            if (guessNum > numForGuess) {
                System.out.println("Too high, try again.");
            } else if (guessNum < numForGuess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Yes, you guessed the number.");
            }
        }
    }

    /**
     * Task 17. Write a Java Program to Compute the Sum of Digits in a given Integer.
     */
    public static int sumOfDigitsOfNumber(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    /*
    ******************
    My helping methods
    ******************
     */

    public static boolean isPowToTwo(int num) {
        if (num <= 0) {
            return false;
        }
        return (num & num - 1) == 0;
    }

    public static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            int fib = 0;
            int fib1 = 0;
            int fib2 = 1;
            while (a > 1) {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
                a--;
            }
            return fib;
        }
    }


}