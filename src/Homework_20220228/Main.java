package Homework_20220228;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static Homework_20220228.Validator.*;
import static Homework_20220228.Triangle.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Task 01
        Person human = new Person("Name", "Surname", "0001234567", 30,
                "male", "American");
        human.display();

        //Task 02

        Person person = new Person();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        if (isStringLengthInGivenRange(firstName, 3, 15)) {
            person.setFirstName(firstName);
        } else {
            System.out.println("Your input's length isn't from 3 to 15.");
        }
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        if (isStringLengthInGivenRange(lastName, 6, 20)) {
            person.setLastName(lastName);
        } else {
            System.out.println("Your input's length isn't from 6 to 20.");
        }
        System.out.print("Enter passport ID: ");
        String passportId = scanner.nextLine();
        if (isPassportIdValid(passportId)) {
            person.setPassportId(passportId);
        } else {
            System.out.println("Your input isn't valid passport ID.");
        }
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (isIntInGivenRange(age, 18, 99)) {
            person.setAge(age);
        } else {
            System.out.println("Your input's range isn't from 18 to 99.");
        }
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        if (isRealGender(gender)) {
            person.setGender(gender);
        } else {
            System.out.println("Your input's length isn't from 6 to 20.");
        }
        System.out.print("Enter nationality: ");
        String nationality = scanner.nextLine();
        person.setNationality(nationality);

        person.display();

        //Task 03

        Triangle triangle = new Triangle();

        System.out.print("Enter side A: ");
        int sideA = Integer.parseInt(scanner.nextLine());
        if (isIntInGivenRange(sideA, 1, 20)) {
            triangle.setSideA(sideA);
        } else {
            System.out.println("Your input's range isn't from 1 to 20.");
        }
        System.out.print("Enter side B: ");
        int sideB = Integer.parseInt(scanner.nextLine());
        if (isIntInGivenRange(sideB, 1, 20)) {
            triangle.setSideB(sideB);
        } else {
            System.out.println("Your input's range isn't from 1 to 20.");
        }
        System.out.print("Enter side C: ");
        int sideC = Integer.parseInt(scanner.nextLine());
        if (isIntInGivenRange(sideC, 1, 20)) {
            triangle.setSideC(sideC);
        } else {
            System.out.println("Your input's range isn't from 1 to 20.");
        }

        check(triangle);
        if (triangle.isTriangleRight()) {
            int[] sides = triangle.trianglesSidesChoosing();
            System.out.println("Area of right triangle is: " + ((double) 1 / 2 * sides[1] * sides[2]));
        } else {
            System.out.println("Perimeter of triangle is: " + (sideA + sideB + sideC));
        }

        //Task 04
        Store store = new Store();

        System.out.print("Enter count of workers: ");
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        if (isIntInGivenRange(countOfWorkers, 2, 50)) {
            store.setCountOfWorkers(countOfWorkers);
        } else {
            System.out.println("Your input's range isn't from 2 to 50.");
        }
        System.out.print("Enter store name: ");
        String storeName = scanner.nextLine();
        if (storeName.length() >= 3) {
            store.setName(storeName);
        } else {
            System.out.println("Your input's length must be at least 3.");
        }
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if (isPhoneNumberValid(phoneNumber)) {
            store.setPhoneNumber(phoneNumber);
        } else {
            System.out.println("Your input isn't valid phone number.");
        }

        System.out.println(store);
    }
}
