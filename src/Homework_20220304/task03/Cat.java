package Homework_20220304.task03;

public class Cat extends Animal {
    private int age;
    private String name;

    public Cat() {
    }

    public Cat(int age, String name) {
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
        System.out.println("Cat's voice.");
    }

    @Override
    public String toString() {
        return "Cat {age = " + age + ", name = " + name + "}";
    }
}
