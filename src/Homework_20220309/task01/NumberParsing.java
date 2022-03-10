package Homework_20220309.task01;

import java.util.Scanner;

public class NumberParsing {
    public static int parseNumber() {
        Scanner scanner = new Scanner(System.in);
        int num;
        String str;
        while (true) {
            System.out.print("Enter number: ");
            str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Your input isn't a number!");
            }
        }
        return num;
    }
}
