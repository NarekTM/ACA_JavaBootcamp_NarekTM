package Homework_20220301.animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();
        animal.eat();

        Dog dog = new Dog();
        dog.voice();
        dog.eat();
    }
}
