package Homework_20220206;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input double number: ");

        double numD = sc.nextDouble();
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
}
