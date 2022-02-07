package Homework_20220207;

public class Book {
    String name;
    Author author;
    int price;

    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void printAllInfo() {
        System.out.print("Name: " + name);
        printAuthorName();
        printAuthorEmail();
        System.out.println(",\tPrice: $" + price);
    }

    public void printAuthorName() {
        System.out.print(",\tAuthor name: " + author.name);
    }

    public void printAuthorEmail() {
        System.out.print(",\tAuthor email: " + author.email);
    }
}
