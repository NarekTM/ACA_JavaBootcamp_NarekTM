package Homework_20220401.smallapp;

import java.io.*;
import java.util.*;

public class User {
    private String name;
    private String surname;
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(User user) {
        this.name = user.name;
        this.surname = user.surname;
        this.age = user.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void saveUser(File file) throws IOException {
        FileWriter writer = new FileWriter(file, true);

        writer.write(String.valueOf(this) + '\n');
        writer.close();
    }

    public static List<User> getUsersFromFile(File file) throws FileNotFoundException {
        List<User> users = new ArrayList<>();
        Scanner fileScanner = new Scanner(file);
        User user = new User();

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            Scanner lineScanner = new Scanner(line);
            int helper = 0;
            while (lineScanner.hasNext()) {
                if (helper == 0) {
                    user.setName(lineScanner.next());
                    helper++;
                } else if (helper == 1) {
                    user.setSurname(lineScanner.next());
                    helper++;
                } else {
                    user.setAge(lineScanner.nextInt());
                    helper = 0;
                }
            }
            users.add(new User(user));
            lineScanner.close();
        }
        fileScanner.close();
        return users;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
