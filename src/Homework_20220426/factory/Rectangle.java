package Homework_20220426.factory;

public class Rectangle implements Shape {
    private double b;
    private double h;

    public double getB() {
        return b;
    }

    public Rectangle setB(double b) {
        this.b = b;
        return this;
    }

    public double getH() {
        return h;
    }

    public Rectangle setH(double h) {
        this.h = h;
        return this;
    }

    @Override
    public double area() {
        return b * h;
    }
}
