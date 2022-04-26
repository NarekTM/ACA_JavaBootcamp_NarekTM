package Homework_20220426.factory;

public class Circle implements Shape {
    private double r;

    public double getR() {
        return r;
    }

    public Circle setR(double r) {
        this.r = r;
        return this;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
