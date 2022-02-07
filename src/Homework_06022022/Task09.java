package Homework_06022022;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any number in range 32 to 127: ");
        int num = sc.nextInt();

        char ch = (char) num;

        System.out.println(num + " - " + ch);
    }
}
