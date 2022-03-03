package Homework_20220302.task05;

public abstract class Car {
    protected String model;
    protected int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected abstract void start();

    protected void signal() {
    }
}
