package Homework_20220302.task03;

public class Airplane implements FlyAble{
    @Override
    public void voice() {
        System.out.println("Voice of airplane");
    }

    @Override
    public void fly() {
        System.out.println(("Flying"));
    }
}
