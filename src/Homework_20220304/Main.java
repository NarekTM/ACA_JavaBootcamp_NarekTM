package Homework_20220304;

import Homework_20220304.task01.Horse;
import Homework_20220304.task03.*;
import Homework_20220304.task04.Circle;
import Homework_20220304.task04.Rectangle;
import Homework_20220304.task04.Shape;
import Homework_20220304.task04.Square;

public class Main {
    public static void main(String[] args) {

        //Task 01
        Homework_20220304.task01.Animal animal = new Homework_20220304.task01.Animal() {
            @Override
            protected void sound() {
                System.out.println("Animal is an abstract class, so we can't create object of it, " +
                        "that's why we write anonymous class.");
            }
        };
        Horse horse = new Horse();
        Homework_20220304.task01.Cat cat = new Homework_20220304.task01.Cat();

        horse.sound();
        cat.sound();

        //Task 03
        Animal an = new Animal(14, "Animal");
        Cat ct = new Cat(7, "Cat");
        Animal anct = new Cat(3, "Animal Cat");

        Animal ansn = new Snake(66);

        ansn.sound();
        System.out.println(ansn);
        System.out.println(ansn.getAge());

        an.sound();
        System.out.println(an);
        ct.sound();
        System.out.println(ct);
        anct.sound();
        System.out.println(anct);

        //Task 04
        Square square = new Square(13);
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(9, 14);

        Shape[] shapes = new Shape[]{square, circle, rectangle};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area of " + i + " index shape is: " + shapes[i].area());
            System.out.println("Perimeter of " + i + " index shape is: " + shapes[i].perimeter());
        }
    }
}
