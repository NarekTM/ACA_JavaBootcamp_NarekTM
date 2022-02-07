package Homework_20220206;

public class Task14 {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 55;

        System.out.println(num1 + "\t" + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println(num1 + "\t" + num2);
    }
}
