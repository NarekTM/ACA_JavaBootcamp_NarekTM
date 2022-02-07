package Homework_20220206;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius of a circle: ");

        double circleRadius = sc.nextDouble();
        double PI = Math.PI;

        double circleArea = PI * circleRadius * circleRadius;
        double circlePerimeter = 2 * PI * circleRadius;

        System.out.println("Circle area: " + circleArea + ", circle perimeter: " + circlePerimeter);
    }
}
