package Homework_20220207;

public class Employee {
    String id;
    String name;
    String department;
    int age;
    String gender;

    public Employee(String id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void printAllInfo() {
        System.out.println("ID: " + id + "\tName: " + name + "\t\tDepartment: " + department + "\tAge: " + age + "\tGender: " + gender);
    }
}
