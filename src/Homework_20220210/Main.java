package Homework_20220210;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Task 01
        System.out.print("Input your age, please: ");
        int age = sc.nextInt();
        isEligibleToVote(age);

        //Task 02
        System.out.print("Enter any integer number: ");
        int num = sc.nextInt();
        isNumberEven(num);

        //Task 03
        double mRand = Math.random();
        randNumberBetween2And7(mRand);


        //Task 04
        System.out.print("Input any integer number: ");
        int num2 = sc.nextInt();
        isNumberMultipleOf5(num2);

        //Task 05
        System.out.print("Input the first integer number: ");
        int firstNum = sc.nextInt();
        System.out.print("Input the second integer number: ");
        int secondNum = sc.nextInt();
        System.out.print("Input the third integer number: ");
        int thirdNum = sc.nextInt();
        theGreatestFromThreeNumbers(firstNum, secondNum, thirdNum);

        //Task 06
        System.out.print("Input any number: ");
        double num3 = sc.nextDouble();
        biographyOfNumber(num3);

        //Task 07
        System.out.print("Print a number between 1 and 7: ");
        int dayNum = sc.nextInt();
        nameOfWeekday(dayNum);

        //Task 08
        System.out.print("Enter a count of ice cream balls that you want to buy: ");
        int iceCreamBalls = sc.nextInt();
        canWeBuyIceCream(iceCreamBalls);

        //Task 09
        System.out.print("Enter a year that you want to check: ");
        int year = sc.nextInt();
        leapYearCheck(year);

        //Task 10 (08)
        int value = rand.nextInt();
        System.out.println(value + " " + valueCheckerByConditions(value));

        //Task 11 (09)
        System.out.print("Insert an integer number: ");
        int aNum = sc.nextInt();
        System.out.print("Insert an other integer number: ");
        int bNum = sc.nextInt();
        checkTwoNumbersBy1(aNum, bNum);
        checkTwoNumbersBy2(aNum, bNum);
        checkTwoNumbersBy3(aNum, bNum);
        checkTwoNumbersBy4(aNum, bNum);
        checkTwoNumbersBy5(aNum, bNum);
        checkTwoNumbersBy6(aNum, bNum);

        //Task 12 (10)
        System.out.print("Input any integer number: ");
        int numA = sc.nextInt();
        System.out.print("Input other integer number: ");
        int numB = sc.nextInt();
        printOddOrEvenNumbers(numA, numB);

        //Task 13 (11)
        System.out.print("Input first point's X axis coordinate: ");
        int aXCoord = sc.nextInt();
        System.out.print("Input first point's Y axis coordinate: ");
        int aYCoord = sc.nextInt();
        System.out.print("Input second point's X axis coordinate: ");
        int bXCoord = sc.nextInt();
        System.out.print("Input second point's Y axis coordinate: ");
        int bYCoord = sc.nextInt();
        isInSameQuarter(aXCoord, aYCoord, bXCoord, bYCoord);

        //Task 14 (12)
        System.out.print("Input first side's length: ");
        int aSide = sc.nextInt();
        System.out.print("Input second side's length: ");
        int bSide = sc.nextInt();
        System.out.print("Input third side's length: ");
        int cSide = sc.nextInt();
        isThereNonDegenerateTriangle(aSide, bSide, cSide);

        //Task 15 (13)
        System.out.print("Enter first number: ");
        int fNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int sNum = sc.nextInt();
        System.out.print("Enter third number: ");
        int tNum = sc.nextInt();
        System.out.println(countOfSameNumbers(fNum, sNum, tNum));

        //Task 16 (14)
        System.out.print("Insert real number a: ");
        double a = sc.nextDouble();
        System.out.print("Insert real number b: ");
        double b = sc.nextDouble();
        System.out.print("Insert real number c: ");
        double c = sc.nextDouble();
        decisionsOfQuadraticEquation(a, b, c);

        //Task 17 (15)
        System.out.print("Input first number: ");
        int aVal = sc.nextInt();
        System.out.print("Input second number: ");
        int bVal = sc.nextInt();
        System.out.print("Input third number: ");
        int cVal = sc.nextInt();
        arrangeValuesNonDecrOrder(aVal, bVal, cVal);
    }

    /**
     * Task 01. Write a Java program to allow the user to input his/her age. Then the
     * program will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     */
    public static void isEligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You have the right to vote.");
        } else {
            System.out.println("Sorry, but you don't have the right to vote.");
        }
    }

    /**
     * Task 02. Write a Java program to determine whether an input number is an even number.
     */
    public static void isNumberEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }

    /**
     * Task 03. Generate and print random integer number between 2 and 7 (not using bound).
     */
    public static void randNumberBetween2And7(double mRand) {
        System.out.println((int) (mRand * 6 + 2));
    }

    /**
     * Task 04. Write a Java program to determine whether an input number is a multiple of a 5.
     */
    public static void isNumberMultipleOf5(int num2) {
        if (num2 % 5 == 0) {
            System.out.println("Yes, number is multiple to 5.");
        } else {
            System.out.println("No, number isn't multiple to 5");
        }
    }

    /**
     * Task 05. Take three numbers from the user and print the greatest number.
     */
    public static void theGreatestFromThreeNumbers(int firstNum, int secondNum, int thirdNum) {
        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println(firstNum);
        } else if (secondNum > thirdNum) {
            System.out.println(secondNum);
        } else {
            System.out.println(thirdNum);
        }
    }

    /**
     * Task 06. Write a Java program that reads a floating-point number and prints
     * "zero" if the number is zero. Otherwise, print "positive" or "negative".
     * Add "small" if the absolute value of the number is less than 1, or
     * "large" if it exceeds 1,000,000 (use Math.abs() for absolute value)
     */
    public static void biographyOfNumber(double num3) {
        if (num3 == 0) {
            System.out.println("zero");
        } else if (num3 > 0) {
            System.out.print("positive");
        } else {
            System.out.print("negative");
        }

        if (Math.abs(num3) < 1 && Math.abs(num3) > 0) {
            System.out.println(" small");
        } else if (Math.abs(num3) > 1_000_000) {
            System.out.println(" large");
        }
    }

    /**
     * Task 07. Write a Java program that keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     */
    public static void nameOfWeekday(int dayNum) {
        if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }

    /**
     * Task 08. The ice cream parlor sells three balls and five balls. Can you buy
     * exactly k balls of ice cream?
     * In the cafe they sell an ice-cream with 3 balls and 5 balls.Input K integer
     * value from console, check if you can buy exactly K balls ice-cream.
     */
    public static void canWeBuyIceCream(int iceCreamBalls) {
        if (iceCreamBalls % 5 % 3 == 0 || iceCreamBalls % 3 % 5 == 0
                || (iceCreamBalls % 5 % 3 + iceCreamBalls % 3 % 5) == 3) {
            System.out.printf("Yes, we can buy ice cream with %d balls.\n", iceCreamBalls);
        } else {
            System.out.printf("No, we can't buy ice cream with %d balls.\n", iceCreamBalls);
        }
    }

    /**
     * Task 09. LEAP YEAR
     * Write a Java program that takes a year from the user and print whether
     * that year is a leap year or not.
     */
    public static void leapYearCheck(int year) {
        if (year % 4 != 0) {
            System.out.println("Not a leap year.");
        } else if (year % 100 != 0) {
            System.out.println("Leap year.");
        } else if (year % 400 == 0) {
            System.out.println("Leap year.");
        } else {
            System.out.println("Not a leap year.");
        }
    }

    /**
     * Task 10 (8). Generate random integer value, print true if random value
     * corresponds these conditions, else print false (use boolean primitive type)
     * -input number is greater than -1000 and less than 1000
     * -input number is multiple of 3 or input number is multiple of 5
     */
    public static boolean valueCheckerByConditions(int value) {
        if (value > -1000 && value < 1000 && value % 3 == 0 || value % 5 == 0) {
            return true;
        } else {
            return false;
        }
        //return value > -1000 && value < 1000 && value % 3 == 0 || value % 5 == 0;
    }

    /**
     * Task 11 (9). Input from console int a and int b, if a and b corresponds for following
     * requirements print “Both a and b legal”, if any of them does not
     * correspond print about it like this “a is legal b is illegal ''. or vice versa
     * 1 - a > 10 and b is not equal to 10
     * 2 - both a and b is positive
     * 3 - both a and b is negative
     * 4 - a > 10 b < 1 both of them are odd
     * 5 - a is a multiple of 5 OR b is a multiple of 5
     * 6 - a is not a multiple of 5 but b is a multiple of 5
     */
    public static void checkTwoNumbersBy1(int a, int b) {
        System.out.print("Condition 1: ");
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if (a > 10) {
            System.out.println("a is legal b is illegal");
        } else if (b != 10) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("Both a and b illegal");
        }
    }

    public static void checkTwoNumbersBy2(int a, int b) {
        System.out.print("Condition 2: ");
        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        } else if (a > 0) {
            System.out.println("a is legal b is illegal");
        } else if (b > 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("Both a and b illegal");
        }
    }

    public static void checkTwoNumbersBy3(int a, int b) {
        System.out.print("Condition 3: ");
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else if (a < 0) {
            System.out.println("a is legal b is illegal");
        } else if (b < 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("Both a and b illegal");
        }
    }

    public static void checkTwoNumbersBy4(int a, int b) {
        System.out.print("Condition 4: ");
        if (a > 10 && b < 1) {
            if (a % 2 != 0 && b % 2 != 0) {
                System.out.println("Both a and b legal");
            } else if (a % 2 != 0) {
                System.out.println("a is legal b is illegal");
            } else if (b % 2 != 0) {
                System.out.println("a is illegal b is legal");
            } else {
                System.out.println("Both a and b illegal");
            }
        } else if (a <= 10) {
            if (b < 1 && b % 2 != 0) {
                System.out.println("a is illegal b is legal");
            } else {
                System.out.println("Both a and b illegal");
            }
        } else if (b > 1) {
            if (a % 2 != 0) {
                System.out.println("a is legal b is illegal");
            } else {
                System.out.println("Both a and b illegal");
            }
        } else {
            System.out.println("Both a and b illegal");
        }
    }

    public static void checkTwoNumbersBy5(int a, int b) {
        System.out.print("Condition 5: ");
        if (a % 5 == 0 || b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("Both a and b illegal");
        }
    }

    public static void checkTwoNumbersBy6(int a, int b) {
        System.out.print("Condition 6: ");
        if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else if (a % 5 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (b % 5 == 0) {
            System.out.println("a is illegal b is legal");
        } else {
            System.out.println("Both a and b illegal");
        }
    }

    /**
     * Task 12 (10). Input int values a and b from console
     * - if one of them is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * - else print all even values between them
     */
    public static void printOddOrEvenNumbers(int numA, int numB) {
        if ((numA % 7 == 0 || numB % 7 == 0) && numA > 0 && numB > 0 && numA > numB) {
            for (int i = numB + 1; i < numA; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            if (numA > numB) {
                for (int i = numB + 1; i < numA; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                for (int i = numA + 1; i < numB; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }

    /**
     * Task 13 (11). Given coordinates of two points in the coordinate plane.
     * Write java program to check if the points lie in the same plane (quarter)?
     * - Print In the same quarter, else print Not in the same quarter.
     * - Input 4 coordinates from console, all 4 coordinates != 0.
     */
    public static void isInSameQuarter(int aXCoord, int aYCoord, int bXCoord, int bYCoord) {
        if (aXCoord > 0 && aYCoord > 0) {
            if (bXCoord > 0 && bYCoord > 0) {
                System.out.println("In the same quarter");
            } else {
                System.out.println("Not in the same quarter");
            }
        } else if (aXCoord < 0 && aYCoord > 0) {
            if (bXCoord < 0 && bYCoord > 0) {
                System.out.println("In the same quarter");
            } else {
                System.out.println("Not in the same quarter");
            }
        } else if (aXCoord < 0 && aYCoord < 0) {
            if (bXCoord < 0 && bYCoord < 0) {
                System.out.println("In the same quarter");
            } else {
                System.out.println("Not in the same quarter");
            }
        } else if (aXCoord > 0 && aYCoord < 0) {
            if (bXCoord > 0 && bYCoord < 0) {
                System.out.println("In the same quarter");
            } else {
                System.out.println("Not in the same quarter");
            }
        } else {
            System.out.println("Not in the same quarter");
        }
    }

    /**
     * For a non-degenerate triangle, its sides should follow these constraints, A + B > C and B + C > A and C + A > B where A, B and C are length of sides of the triangle.
     * Task 14 (12). Given 3 positive numbers different from 0. Determine if there is a non-degenerate triangle with such sides.
     * - Input numbers from console
     */
    public static void isThereNonDegenerateTriangle(int aSide, int bSide, int cSide) {
        if (aSide + bSide > cSide && aSide + cSide > bSide && bSide + cSide > aSide) {
            System.out.println("There is a non-degenerate triangle with such sides");
        } else {
            System.out.println("There isn't a non-degenerate triangle with such sides");
        }
    }

    /**
     * Task 15 (13). Given 3 numbers, print count of numbers that equals to each other.(Input numbers from console)
     * Example:
     * Input numbers`
     * - 3
     * - 1
     * - 3
     * Output`
     * 2
     */
    public static int countOfSameNumbers(int fNum, int sNum, int tNum) {
        if (fNum == sNum || fNum == tNum) {
            if (sNum == tNum) {
                return 3;
            } else {
                return 2;
            }
        } else if (sNum == tNum) {
            return 2;
        } else {
            return 0;
        }
    }

    /**
     * Task 16 (14). Given 3 real numbers a, b, c. Find all decisions for
     * ax2 + bx + c = 0. Print all decisions, if there is not a decision, print “Can't be”.
     */
    public static void decisionsOfQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Can't be.");
        } else if (discriminant == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println(((-b + Math.sqrt(discriminant)) / (2 * a)) + " " + ((-b - Math.sqrt(discriminant)) / (2 * a)));
        }
    }

    /**
     * Task 17 (15). Given 3 integer values, arrange them in non-decreasing order.
     * a <= b <= c.
     * Example:
     * Input`
     * - 3
     * - 1
     * - 1
     * Output`
     * - 1
     * - 1
     * - 3
     */
    public static void arrangeValuesNonDecrOrder(int aVal, int bVal, int cVal) {
        if (aVal < bVal || aVal < cVal) {
            if (bVal < cVal) {
                System.out.println(aVal + " " + bVal + " " + cVal);
            } else {
                System.out.println(aVal + " " + cVal + " " + bVal);
            }
        } else if (bVal < cVal) {
            System.out.println(bVal + " " + cVal + " " + aVal);
        } else {
            System.out.println(cVal + " " + bVal + " " + aVal);
        }
    }
}
