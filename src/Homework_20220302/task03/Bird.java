package Homework_20220302.task03;

public class Bird implements FlyAble{
    @Override
    public void voice() {
        System.out.println("Wow, wow");
    }

    @Override
    public void fly() {
        System.out.println("Fly, fly");
    }
}
