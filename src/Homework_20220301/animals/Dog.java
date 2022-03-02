package Homework_20220301.animals;

import Homework_20220301.animals.Animal;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Voice of dog");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
