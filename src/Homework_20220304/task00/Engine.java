package Homework_20220304.task00;

public class Engine {

    //This is a mutable class

    private int horsePower;
    private int mileage;
    private double weight;

    public Engine() {
    }

    public Engine(int horsePower, int mileage, double weight) {
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.weight = weight;
    }

    public Engine(Engine engine) {
        this(engine.getHorsePower(), engine.getMileage(), engine.getWeight());
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", mileage=" + mileage +
                ", weight=" + weight +
                '}';
    }
}
