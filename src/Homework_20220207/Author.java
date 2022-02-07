package Homework_20220207;

public class Author {
    String name;
    String email;
    String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void printAllInfo() {
        System.out.println("Name: " + name + "\temail: " + email + "\tGender: " + gender);
    }
}
