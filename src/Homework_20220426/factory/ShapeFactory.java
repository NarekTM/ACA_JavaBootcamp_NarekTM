package Homework_20220426.factory;

public class ShapeFactory {
    public Shape createShape(String shape) {
        switch (shape.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Unknown shape " + shape);
        }
    }
}
