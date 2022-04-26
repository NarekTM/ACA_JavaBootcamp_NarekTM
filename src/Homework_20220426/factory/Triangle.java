package Homework_20220426.factory;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public Triangle setA(double a) {
        this.a = a;
        return this;
    }

    public double getB() {
        return b;
    }

    public Triangle setB(double b) {
        this.b = b;
        return this;
    }

    public double getC() {
        return c;
    }

    public Triangle setC(double c) {
        this.c = c;
        return this;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
