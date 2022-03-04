package Homework_20220304.task02;

public class Parent {
    protected void print() {
        System.out.println("This is compile time polymorphism first example.");
    }

    protected void print(String str) {
        System.out.println("This is compile time polymorphism second example. " + str);
    }

    protected double area(int num) {
        return Math.PI * num * num;
    }
}
