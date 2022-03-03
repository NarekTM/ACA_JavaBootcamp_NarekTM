package Homework_20220302.task01;

public class Circle extends Shape {
    @Override
    protected double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    protected double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
