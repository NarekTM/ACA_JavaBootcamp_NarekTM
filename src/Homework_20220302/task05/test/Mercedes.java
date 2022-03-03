package Homework_20220302.task05.test;

import Homework_20220302.task05.Car;

public class Mercedes extends Car {
    @Override
    protected void start() {
        System.out.println("Mercedes is starting");
    }

    @Override
    protected void signal() {
        System.out.println("Signal of Mercedes");
    }
}
