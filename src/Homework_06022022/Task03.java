package Homework_06022022;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input temperature on Fahrenheit: ");

        double tempF = sc.nextDouble();
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF + " Fahrenheit = " + tempC + " Celsius.");

        float tempC1 = (float) tempC;
        System.out.println("Float type Celsius temperature: " + tempC1);

        int tempC2 = (int) tempC;
        System.out.println("Int type Celsius temperature: " + tempC2);
    }
}
