package Homework_20220207;

public class BookTest {
    public static void main(String[] args) {
        Author gOrwell = new Author("George Orwell", "gorwell@gmail.com", "male");

        Book book1 = new Book("Animal Farm", gOrwell, 20);
        Book book2 = new Book("1984", gOrwell, 30);

        book1.printAllInfo();
        book2.printAllInfo();
    }
}
