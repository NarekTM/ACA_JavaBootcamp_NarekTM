package Homework_20220211;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 01
        System.out.print("Type your text: ");
        String str1 = sc.nextLine();
        System.out.print("Type your text: ");
        String str2 = sc.nextLine();
        compareTwoStrings1(str1, str2);

        //Task 02
        String strA = "Text";
        String strB = new String();
        compareTwoStrings2(strA, strB);

        //Task 03
        System.out.print("Input integer number: ");
        int num = sc.nextInt();
        isNumPosOrNeg1(num);
        isNumPosOrNeg2(num);

        //Task 04
        System.out.print("Input first integer number for Max method: ");
        int a = sc.nextInt();
        System.out.print("Input second integer number for Max method: ");
        int b = sc.nextInt();
        System.out.println(myMathMax(a, b));

        System.out.print("Input integer number for Abs method: ");
        int c = sc.nextInt();
        System.out.println(myMathAbs(c));

        //Task 05
        String txt = null;
        System.out.println(stringChecker(txt));

        //Task 06
        System.out.print("Input first number: ");
        int val1 = sc.nextInt();
        System.out.print("Input second number: ");
        int val2 = sc.nextInt();
        System.out.print("Input third number: ");
        int val3 = sc.nextInt();
        maxFromThreeNums(val1, val2, val3);

        //Task 07
        System.out.print("What is the correct name of this bitwise operator \">>\" in Java?\n" +
                "a. left shift;\n" +
                "b. unsigned right shift;\n" +
                "c. right shift;\n" +
                "d. XOR;\n" +
                "Enter your choice: ");
        char answer = sc.next().charAt(0);
        questionToUser(answer);

        //Task 08
        System.out.print("Input a capital letter: ");
        char ch = sc.next().charAt(0);
        checkVowOrCons(ch);

        //Task 09
        System.out.print("Input here: ");
        String key = sc.nextLine();
        pressedKey(key);

        //Task 10
        System.out.print("Enter number: ");
        int checkNum = sc.nextInt();
        numberIsEvenOrOdd(checkNum);

        //Task 11
        System.out.print("Enter first number: ");
        double fNum = sc.nextDouble();
        System.out.print("Enter second number: ");
        double sNum = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char oper = sc.next().charAt(0);
        theSimplestCalc(fNum, sNum, oper);

        //Task 12
        System.out.print("Enter weekday name: ");
        String weekdayName = sc.nextLine();
        System.out.println(weekdayNumber(weekdayName));

        //Task 13
        System.out.print("Quiz score: ");
        int quizScore = sc.nextInt();
        System.out.print("Mid-term score: ");
        int midScore = sc.nextInt();
        System.out.print("Final score: ");
        int finalScore = sc.nextInt();
        gradeChecker(quizScore, midScore, finalScore);
    }

    /**
     * Task 01. Write a java program, which has 2 String variables, initialize them from console.
     * - - Compare them with == assignment
     * - - Compare them with equals to
     */
    public static void compareTwoStrings1(String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    /**
     * Task 02. Write a java program, which has 2 String variables, initialize them.
     * One with literal, another using new keyword
     * - - Compare them with == assignment
     * - - Compare them with equals to
     */
    public static void compareTwoStrings2(String strA, String strB) {
        System.out.println(strA == strB);
        System.out.println(strA.equals(strB));
    }

    /**
     * Task 03.
     * - - Input integer value from console, if value greater than 0 print positive, else print negative.
     * - - Input integer value from console, if value greater than 0 print positive, else print negative, else if 0 print 0;
     */
    public static void isNumPosOrNeg1(int num1) {
        System.out.println(num1 > 0 ? "Positive" : "Negative");
    }

    public static void isNumPosOrNeg2(int num2) {
        System.out.println(num2 > 0 ? "Positive" : num2 == 0 ? 0 : "Negative");
    }

    /**
     * Task 04. Using ternary operator`
     * - - achieve Math.max(a,b) function
     * - - achieve Math.abs(a) function
     */
    public static int myMathMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int myMathAbs(int c) {
        return c >= 0 ? c : -c;
    }

    /**
     * Task 05. Using ternary operator check if the given String
     * - - is a null so return -1
     * - - is “ ” return 0
     * - - else return 1
     */
    public static int stringChecker(String txt) {
        return txt == null ? -1 : txt.equals(" ") ? 0 : 1;
    }

    /**
     * Task 06. Write a java program to find maximum from a given 3 integer numbers
     * using ternary operator. Input numbers from console.
     */
    public static void maxFromThreeNums(int val1, int val2, int val3) {
        System.out.println(val1 > val2 ? val1 > val3 ? val1 : val3 : val2 > val3 ? val2 : val3);
    }

    /**
     * Task 07 (09). Write a Java program that allows the user to choose the correct answer of a question.
     * If he chooses correct answer Print “Congratulation”, in case of wrong choice print “Invalid choice”.
     * Example`
     * What is the correct way to declare a variable to store an integer value in Java?
     * a. int 1x = 10;
     * b. int x = 10;
     * c. float x = 10.0f;
     * d. string x = "10";
     * Enter your choice: c
     */
    public static void questionToUser(char answer) {
        switch (answer) {
            case 'a':
                System.out.println("Invalid choice");
                break;
            case 'b':
                System.out.println("Invalid choice");
                break;
            case 'c':
                System.out.println("Congratulation");
                break;
            case 'd':
                System.out.println("Invalid choice");
                break;
            default:
                System.out.println("The answer you selected does not exist.");
        }
    }

    /**
     * Task 08 (10). Write Java Program to check Vowel or Consonant using Switch Case.
     * Example`
     * Enter a character :
     * A
     * A is a Vowel
     */
    public static void checkVowOrCons(char ch) {
        switch (ch) {
            case 'A':
                System.out.println(ch + " is a Vowel");
                break;
            case 'E':
                System.out.println(ch + " is a Vowel");
                break;
            case 'I':
                System.out.println(ch + " is a Vowel");
                break;
            case 'O':
                System.out.println(ch + " is a Vowel");
                break;
            case 'U':
                System.out.println(ch + " is a Vowel");
                break;
            case 'Y':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }

    /**
     * Task 09 (10). If the user pressed number keys (from 0 to 9), the program will tell the
     * number that is pressed, otherwise, the program will show "Not allowed".
     */
    public static void pressedKey(String key) {
        switch (key) {
            case "0":
                System.out.println("Zero");
                break;
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            case "4":
                System.out.println("Four");
                break;
            case "5":
                System.out.println("Five");
                break;
            case "6":
                System.out.println("Six");
                break;
            case "7":
                System.out.println("Seven");
                break;
            case "8":
                System.out.println("Eight");
                break;
            case "9":
                System.out.println("Nine");
                break;
            default:
                System.out.println("Not allowed");
        }
    }

    /**
     * Task 10 (11). Using switch statements determine if the number is even or odd.
     * Input number from console
     */
    public static void numberIsEvenOrOdd(int checkNum) {
        int checker = checkNum % 2;

        switch (checker) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Your input isn't a number.");
        }

    }

    /**
     * Task 11 (12). Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs addition, subtraction,
     * multiplication and division based on the user input. The program takes the value of both
     * the numbers (entered by user) and then user is asked to enter the operation (+, -, * and /),
     * based on the input program performs the selected operation on the entered numbers using switch case.
     * Example`
     * Enter first number: 40
     * Enter second number: 4
     * Enter an operator (+, -, *, /): /
     * 40.0 / 4.0: 10.0
     * If user enters any other operator or char apart from +, -, * and /, then display an error message to user
     */
    public static void theSimplestCalc(double fNum, double sNum, char oper) {
        switch (oper) {
            case '+':
                System.out.println(fNum + " " + oper + " " + sNum + " = " + (fNum + sNum));
                break;
            case '-':
                System.out.println(fNum + " " + oper + " " + sNum + " = " + (fNum - sNum));
                break;
            case '*':
                System.out.println(fNum + " " + oper + " " + sNum + " = " + (fNum * sNum));
                break;
            case '/':
                System.out.println(fNum + " " + oper + " " + sNum + " = " + (fNum / sNum));
                break;
            default:
                System.out.println("You entered wrong operator.");
        }
    }

    /**
     * Task 12 (13). Given the String variable day holding the name of the weekday Sunday, Monday, etc.,
     * set an int variable to 1, 2, etc.
      */
    public static int weekdayNumber(String weekdayName) {
        switch (weekdayName) {
            case "Monday":
                return 1;
            case "Tuesday":
                return 2;
            case "Wednesday":
                return 3;
            case "Thursday":
                return 4;
            case "Friday":
                return 5;
            case "Saturday":
                return 6;
            case "Sunday":
                return 7;
            default:
                return 0;
        }
    }

    /**
     * Task 13 (14). The program will read three types of scores (quiz, midterm, and final scores) and
     * determine the grade based on the following rules:
     * -if the average score >= 80% --> grade = A
     * -if the average score >= 60% and < 80% --> grade = B
     * -if the average score >= 40% and < 60% --> grade = C
     * -else --> grade = F
     * Input`
     * Quiz score: 80
     * Mid-term score: 68
     * Final score: 90
     * Output`
     * Your grade is B.
     * Use switch statement
     */
    public static void gradeChecker(int quizScore, int midScore, int finalScore) {
        int avgScore = (quizScore + midScore + finalScore) / 3;


        switch (avgScore / 20) {
            case 5:
                System.out.println("Your grade is A.");
                break;
            case 4:
                System.out.println("Your grade is A.");
                break;
            case 3:
                System.out.println("Your grade is B.");
                break;
            case 2:
                System.out.println("Your grade is C.");
                break;
            default:
                System.out.println("Your grade is F.");
        }
    }
}
