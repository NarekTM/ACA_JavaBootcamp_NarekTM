package Homework_20220304.task04;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
