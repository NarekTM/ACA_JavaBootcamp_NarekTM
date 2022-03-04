package Homework_20220304.task00;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(500, 33000, 44);

        Car mazda = new Car(2010, "Mazda", "CX9", engine);

        System.out.println(engine);
        System.out.println(mazda.toString());

        engine.setHorsePower(330);

        System.out.println(engine);
        System.out.println(mazda.toString());
    }
}
