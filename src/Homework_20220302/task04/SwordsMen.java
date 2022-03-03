package Homework_20220302.task04;

public class SwordsMen extends Warrior{
    public SwordsMen() {
    }

    public SwordsMen(String name, String type, int power, int health) {
        super(name, type, power, health);
    }

    @Override
    public void hit() {
        System.out.println("I'm hitting by sword and power of my hit is " + getPower());
    }
}
