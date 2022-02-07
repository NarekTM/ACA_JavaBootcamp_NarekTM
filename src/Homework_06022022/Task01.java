package Homework_06022022;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input byte number: ");
        byte numB = sc.nextByte();
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
}
