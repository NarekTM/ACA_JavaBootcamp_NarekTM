package Homework_20220401.smallapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\Homework_20220401\\resources\\Users.txt");

        User[] users = new User[] {
                new User("Name", "Surname", 20),
                new User("Name2", "Surname2", 25),
                new User("Name3", "Surname3", 33),
        };

        for (User user : users) {
            try {
                user.saveUser(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(User.getUsersFromFile(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
