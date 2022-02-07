package Homework_20220207;

public class PersonTest {
    public static void main(String[] args) {
        Person man = new Person();

        man.name = "Max";
        man.age = 37;
        man.address = "721 Broadway, New York, NY 10003, USA";

        man.printAllInfo();

        Person woman = new Person("Jessica", 25, "1122 East Garfield Avenue, Glendale, California 91205, USA");

        woman.printAllInfo();
    }
}
