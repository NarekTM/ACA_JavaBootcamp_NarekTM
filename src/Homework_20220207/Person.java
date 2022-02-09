package Homework_20220207;

public class Person {
    String name;
    int age;
    String address;

    static int count;

    public Person() {
        count++;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

        count++;
    }

    public void printAllInfo() {
        System.out.println("Name: " + name + ",\tAge: " + age + ",\tAddress: " + address);
    }
}
