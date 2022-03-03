package Homework_20220302.task04;

public class Shooter extends Warrior {
    public Shooter() {
    }

    public Shooter(String name, String type, int power, int health) {
        super(name, type, power, health);
    }

    @Override
    public void hit() {
        System.out.println("I'm hitting by gun and power of my hit is " + getPower());
    }
}
