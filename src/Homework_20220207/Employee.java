package Homework_20220207;

public class Employee {
    long id;
    String name;
    String surname;
    int age;
    String department;
    int salary;
    char gender;

    static int count;

    public Employee(String name, int age, String department) {
        this(0, name, null, age, department, 0, ' ');
    }

    public Employee(long id, int age, char gender) {
        this(id, null, null, age, null, 0, gender);
    }

    public Employee(String name, int age) {
        this(name, age, null);
    }
    public Employee(long id, String name, String surname, int age, String department, int salary, char gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.gender = gender;

        count++;
    }

    public void printAllInfo() {
        //System.out.println("ID: " + id + "\tName: " + name + "\t\tDepartment: " + department + "\tAge: " + age + "\tGender: " + gender);
        System.out.printf("ID: %d,\tName: %s, \tSurname: %s,\tAge: %d,\tDepartment: %s,\tSalary: $%d,\tGender: %c\n",
                id, name, surname, age, department, salary, gender);
    }
}
