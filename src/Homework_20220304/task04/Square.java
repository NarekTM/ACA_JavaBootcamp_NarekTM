package Homework_20220304.task04;

public class Square implements Shape{
    private double r;

    public Square(double r) {
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
        return r * r;
    }

    @Override
    public double perimeter() {
        return 4 * r;
    }
}
