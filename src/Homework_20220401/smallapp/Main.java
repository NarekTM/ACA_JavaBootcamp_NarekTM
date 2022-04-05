package Homework_20220401.smallapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\Homework_20220401\\resources\\Users.txt");

        User[] users = new User[]{
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

        List<User> usersList = new ArrayList<>();

        try {
            usersList = User.getUsersFromFile(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (User user : usersList) {
            System.out.println(user);
        }
    }
}
