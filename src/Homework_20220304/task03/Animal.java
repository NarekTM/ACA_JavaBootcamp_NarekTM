package Homework_20220304.task03;

public class Animal {
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal's voice.");
    }

    @Override
    public String toString() {
        return "Animal {age = " + age + ", name = " + name + "}";
    }
}
