package Homework_20220224;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Task 01, 02, 03
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        System.out.print("Enter number: ");
        float d = scanner.nextFloat();
        add(a, b);
        add(a, b, c);
        add(a, d);
        add(d, a);

        System.out.println("Multiple given int number by 2: " + multiplyByTwo(a));
        System.out.println("Multiple given float number by 2: " + multiplyByTwo(d));

        int[] array1 = {1, 2, 3, 4, 5, 10, 20, 33};
        float[] array2 = {1, 2, 3, 4, 5, 10, 20, 33};
        double[] array3 = {1, 2, 3, 4, 5, 10, 20, 33};

        //Task 04
        print(array1);
        print(array2);
        print(array3);

        //Task 05
        System.out.println("Array length: " + search(array1));
        System.out.println("Index of argument: " + search(array1, 2));
        System.out.println("Argument is in that index: " + search(array1, 3, 5));

        //Task 06
        System.out.print("Enter number: ");
        int r = scanner.nextInt();
        System.out.println("Area of circle: " + area(r));
        System.out.print("Enter number: ");
        float s = scanner.nextFloat();
        System.out.println("Area of square: " + area(s));
        System.out.print("Enter number: ");
        int aa = scanner.nextInt();
        System.out.print("Enter number: ");
        int bb = scanner.nextInt();
        System.out.println("Area of rectangle: " + area(aa, bb));

        //Task 07
        System.out.print("Enter number: ");
        int aNum = scanner.nextInt();
        System.out.print("Enter number: ");
        int bNum = scanner.nextInt();
        System.out.println("Max is: " + max(aNum, bNum));
        System.out.print("Enter number: ");
        int cNum = scanner.nextInt();
        System.out.println("Max is: " + max(aNum, bNum, cNum));
        System.out.print("Enter number: ");
        int dNum = scanner.nextInt();
        System.out.println("Max is: " + max(aNum, bNum, cNum, dNum));

        //Task 08
        System.out.print("Enter number: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter number: ");
        int y1 = scanner.nextInt();
        System.out.println("Distance from center: " + distance(x1, y1));
        System.out.print("Enter number: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter number: ");
        int y2 = scanner.nextInt();
        System.out.println("Distance from each other: " + distance(x1, y1, x2, y2));

        //Task 09
        System.out.print("Enter your choice` 1 or 2: ");
        int choice = scanner.nextInt();
        System.out.print("Enter temperature: ");
        float temp = scanner.nextFloat();
        fahrenheitCelsius(temp, choice);
        fahrenheitCelsius(choice, temp);

        //Task 10
        System.out.print("Enter number: ");
        int value = scanner.nextInt();
        System.out.println("Sum of digits of the value: " + remainder(value));
        System.out.print("Enter remainder: ");
        int rem = scanner.nextInt();
        System.out.println("Remainder: " + remainder(value, rem));

    }

    /**
     * Task 01. Write a function add with these 3 types of overloading:
     * static void add(); Which prints which method is called and result
     */
    public static void add(int a, int b) {
        System.out.println("add(int a, int b) " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("add(int a, int b, int c) " + (a + b + c));
    }

    public static void add(int a, float b) {
        System.out.println("add(int a, float b) " + (a + b));
    }

    public static void add(float a, int b) {
        System.out.println("add(float a, int b) " + (a + b));
    }

    /**
     * Task 02, 03. Write 2 functions where first returns float second returns int, and they have the same parameters for input.
     */
    public static float multiplyByTwo(float a) {
        return a * 2;
    }

    public static int multiplyByTwo(int a) {
        return a * 2;
    }

    /**
     * Task 04. Write a method called print(), which takes an array and print its contents in the
     * form of [a1, a2, ..., an]. Take note that there is no comma after the last element.
     * The method's signature is as follows: We need to overload this method for int[ ], float[ ], double[ ] arrays.
     */
    public static void print(int[] array) {
        if (array.length == 0) {
            return;
        }
        System.out.print("int array: [");
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.println(array[i] + "]");
                return;
            }
            System.out.print(array[i] + ", ");
        }
    }

    public static void print(float[] array) {
        if (array.length == 0) {
            return;
        }
        System.out.print("float array: [");
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.println(array[i] + "]");
                return;
            }
            System.out.print(array[i] + ", ");
        }
    }

    public static void print(double[] array) {
        if (array.length == 0) {
            return;
        }
        System.out.print("double array: [");
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.println(array[i] + "]");
                return;
            }
            System.out.print(array[i] + ", ");
        }
    }

    /**
     * Task 05. Write a search function, which
     * - - get as an argument int[ ] array, (returns the size of array)
     * public static int search(int[ ] array)
     * - - get as an argument int[ ] array , also int a, and returns an index of that argument
     * public static int search(int[ ] array, int a)
     * - - get as an argument int[ ] array, int argument, int index
     * returns true if that element is in that place in array, otherwise false
     * public static boolean search(int[] array, int argument, int index)
     */
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        if (index < 0 || index >= array.length) {
            return false;
        }
        return array[index] == argument;
    }

    /**
     * Task 06. Write a square() method, which
     * - - if you get one int parameter returns the square of circle
     * - - if you get one float parameter returns the square of square
     * - - if you get 2 parameters returns the square of rectangle
     */
    public static double area(int r) {
        return Math.PI * r * r;
    }

    public static double area(float s) {
        return s * s;
    }

    public static double area(int a, int b) {
        return a * b;
    }

    /**
     * Task 07. Write a max() function which
     * - - max(int a, int b)
     * - - max(int a, int b, int c)
     * - - max(int a, int b, int c, int d)
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    /**
     * Task 08. Write a distance() method which
     * - - return distance from (0.0 , 0.0) to (a)
     * distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a distance(int, int)
     * - - return the distance from a to be, if method distance get 4 int parameters
     */
    public static double distance(int x2, int y2) {
        return Math.sqrt(Math.pow(0 - x2, 2) + Math.pow(0 - y2, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Task 09. Write a fahrenheitCelsius() method which
     * - - prints fahrenheit value when pass (float celsius, int choice), where choice is the type of fahrenheit`
     * 1: print fahrenheit as int value
     * 2: print fare fahrenheit as a double value
     * if pass another value print illegal argument
     * - - prints celsius when pass (int choice, float fahrenheit)
     * Example: fahrenheitCelsius(32.0, 1); Output` 32 fahrenheit is 0 celsius ;
     */
    public static void fahrenheitCelsius(float celsius, int choice) {
        switch (choice) {
            case 1:
                System.out.printf("%.2f celsius is %d fahrenheit.\n", celsius, (int) (celsius * (9 / 5) + 32));
                break;
            case 2:
                System.out.printf("%.2f celsius is %.2f fahrenheit.\n", celsius, (double) (celsius * 9 / 5 + 32));
                break;
            default:
                System.out.println("Illegal argument.");
        }
    }

    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        switch (choice) {
            case 1:
                System.out.printf("%.2f fahrenheit is %d celsius.\n", fahrenheit, (int) ((fahrenheit - 32) * 5 / 9));
                break;
            case 2:
                System.out.printf("%.2f fahrenheit is %.2f celsius.\n", fahrenheit, (double) ((fahrenheit - 32) * 5 / 9));
                break;
            default:
                System.out.println("Illegal argument.");
        }
    }

    /**
     * Task 10. Write a method` remainder() which
     * - - when pass one int value, return sum of digits for that value remainder(int)
     * - - when pass one int value and one natural int, return reminder from sum of digits divided to second
     * parameter(reminder(int 331, int 5) { return (3 + 3 + 1) % 5 }
     */
    public static int remainder(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static int remainder(int value, int rem) {
        return remainder(value) % rem;
    }
}
