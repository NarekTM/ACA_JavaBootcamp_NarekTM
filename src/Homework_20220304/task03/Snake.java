package Homework_20220304.task03;

public class Snake extends Animal {
    private double length;

    public Snake() {
    }

    public Snake(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void sound() {
        System.out.println("Snake's sound.");
    }

    @Override
    public String toString() {
        return "Snake{length = " + length + '}';
    }
}
