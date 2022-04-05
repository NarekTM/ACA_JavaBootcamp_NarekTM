package Homework_20220401.smallapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    String name;
    String surname;
    int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void saveUser(File file) throws IOException {
        FileWriter writer = new FileWriter(file, true);

        writer.write(String.valueOf(this) + '\n');
        writer.close();
    }

    public static String getUsersFromFile(File file) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (fileScanner.hasNextLine()) {
            sb.append(fileScanner.nextLine()).append('\n');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "name = " + name + ", surname = " + surname +
                ", age = " + age;
    }
}
