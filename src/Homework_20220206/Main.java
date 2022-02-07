package Homework_20220206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 01
        System.out.print("Input byte number: ");
        byte numB = sc.nextByte();
        wideningConversionOfPrimitiveTypes(numB);

        //Task 02
        System.out.print("Input double number: ");
        double numD = sc.nextDouble();
        narrowingConversionOfPrimitiveTypes(numD);

        //Task 03
        System.out.print("Input temperature on Fahrenheit: ");
        double tempF = sc.nextDouble();
        convertTempFromFahrToCelsius(tempF);

        //Task 04
        System.out.print("Enter a radius of a circle: ");
        double circleRadius = sc.nextDouble();
        areaAndPerimeterOfCircle(circleRadius);

        //Task 05
        printExpresionsResult();

        //Task 06
        printNameAndBirthDate();

        //Task 07
        castCharToInt();

        //Task 08
        avgOfNameLettersAsInt();

        //Task 09
        System.out.print("Input any number in range 32 to 127: ");
        int num = sc.nextInt();

        //Task 10
        twoStrings();

        //Task 11
        concStringWithOtherTypes();

        //Task 12
        printText();

        //Task 13 - there is no task 13 in practise file.

        //Task 14
        swapTwoIntsWithoutTemp();
    }

    /**
     * Task 01. Widening Primitive Conversion (Implicit):
     * Write java program, which has byte type variable(Input variables from console) and convert it to short and so on.
     *
     * @param numB
     */
    public static void wideningConversionOfPrimitiveTypes(byte numB) {
        short numS = numB;
        System.out.println(numB + "    " + numS);

        int numI = numS;
        System.out.println(numS + "    " + numI);

        long numL = numI;
        System.out.println(numI + "    " + numL);

        float numF = numL;
        System.out.println(numL + "    " + numF);

        double numD = numF;
        System.out.println(numF + "    " + numD);
    }

    /**
     * Task 02. Narrowing Primitive Conversion (Explicit):
     * Write java program, which has double type variable(Input variable from console)
     *
     * @param numD
     */
    public static void narrowingConversionOfPrimitiveTypes(double numD) {
        float numF = (float) numD;
        System.out.println(numD + "    " + numF);

        long numL = (long) numF;
        System.out.println(numF + "    " + numL);

        int numI = (int) numL;
        System.out.println(numL + "    " + numI);

        short numS = (short) numI;
        System.out.println(numI + "    " + numS);

        byte numB = (byte) numS;
        System.out.println(numS + "    " + numB);
    }

    /**
     * Task 03. Write a Java program to convert temperature from Fahrenheit to Celsius degree. (Input parameter from console)
     *
     * @param tempF
     */
    public static void convertTempFromFahrToCelsius(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF + " Fahrenheit = " + tempC + " Celsius.");

        float tempC1 = (float) tempC;
        System.out.println("Float type Celsius temperature: " + tempC1);

        int tempC2 = (int) tempC;
        System.out.println("Int type Celsius temperature: " + tempC2);
    }

    /**
     * Task 04. Compute area  and perimeter of circle.(Input double type radius from console) (PI = 3.14159)
     *
     * @param circleRadius
     */
    public static void areaAndPerimeterOfCircle(double circleRadius) {
        double PI = 3.14159; //Math.PI;

        double circleArea = PI * circleRadius * circleRadius;
        double circlePerimeter = 2 * PI * circleRadius;

        System.out.println("Circle area: " + circleArea + ", circle perimeter: " + circlePerimeter);
    }

    /**
     * Task 05. Print the result of this expression 1 / 3
     */
    public static void printExpresionsResult() {
        double result1 = (double) 1 / 3;
        float result2 = (float) 1 / 3;

        System.out.println("Double " + result1 + ", float " + result2);
    }

    /**
     * Task 06. Write java program to print your Name and year of birth using only char primitive and int types.Output` (Ara 1996)
     */
    public static void printNameAndBirthDate() {
        char nameLetter1 = 'N';
        char nameLetter2 = 'a';
        char nameLetter3 = 'r';
        char nameLetter4 = 'e';
        char nameLetter5 = 'k';
        int birthYear = 1992;

        System.out.println("" + nameLetter1 + nameLetter2 + nameLetter3 + nameLetter4 + nameLetter5 + " " + birthYear);
    }

    /**
     * Task 07.	Cast char to int.
     */
    public static void castCharToInt() {
        char ch = 'H';
        int num = ch;

        System.out.println(num);
    }

    /**
     * Task 08. Write a java program which parses your name letters as a integers, calculate average of them.
     */
    public static void avgOfNameLettersAsInt() {
        char nameLetter1 = 'N';
        char nameLetter2 = 'a';
        char nameLetter3 = 'r';
        char nameLetter4 = 'e';
        char nameLetter5 = 'k';
        int sumOfLetters = nameLetter1 + nameLetter2 + nameLetter3 + nameLetter4 + nameLetter5;
        int avgOfLetters = sumOfLetters / 5;

        System.out.println("" + nameLetter1 + nameLetter2 + nameLetter3 + nameLetter4 + nameLetter5 + " -- " + avgOfLetters);
    }

    /**
     * Task 09. Input int value from console, find char value corresponding to that int value.
     * Output` 65 - A. (input int in range 32 to 127)
     *
     * @param num
     */
    public static void charCorrespondingToInt(int num) {
        char ch = (char) num;

        System.out.println(num + " - " + ch);
    }

    /**
     * Task 10. Define simple String variable, initialize it
     * Define another String variable, initialize it
     * Concatenate them, print output
     */
    public static void twoStrings() {
        String str1 = "Republic of ";
        String str2 = "Armenia";

        System.out.println(str1 + str2);
    }

    /**
     * Task 11. What happens if concatenate string and another primitive type
     * concatenate integer + integer, print output
     * concatenate String + integer with other primitive types.
     */
    public static void concStringWithOtherTypes() {
        String str = "Expression result is: ";
        int num1 = 14;
        int num2 = 55;

        System.out.println(num1 + num2);

        System.out.println(str + num1 + num2);

        System.out.println(str + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    /**
     * Task 12. Try to print this text
     * String txt = "We are the so-called "Vikings" from the north.";
     */
    public static void printText() {
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        String txt2 = "We are the \n so-called \t \"Vikings\" from the north.";
        System.out.println(txt2);
    }

    /**
     * Task 14. Swap 2 integers without using temp.
     */
    public static void swapTwoIntsWithoutTemp() {
        int num1 = 14;
        int num2 = 55;

        System.out.println(num1 + "\t" + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println(num1 + "\t" + num2);
    }
}


