package Homework_20220309;

import Homework_20220309.task01.NumberParsing;
import Homework_20220309.task02.*;

public class Main {
    public static void main(String[] args) {
        //Task 01
        System.out.println(NumberParsing.parseNumber());
        System.out.println();

        //Task 02
        Stack stack = new DefaultStack();

        stack.push(14);
        System.out.println(stack.pop());
        stack.push(14);
        stack.push(14);
        System.out.println(stack.pop());
        stack.push(14);
        stack.push(14);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
