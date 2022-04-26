package Homework_20220426.builder;

public final class Book {
    private final String code;
    private final String title;
    private final Genre genre;
    private final String author;
    private final int publishingYear;
    private final String description;

    public Book(String code, String title, Genre genre, String author, int publishingYear, String description) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }

    public Book(Book book) {
        this.code = book.getCode();
        this.title = book.getTitle();
        this.genre = book.getGenre();
        this.author = book.getAuthor();
        this.publishingYear = book.getPublishingYear();
        this.description = book.getDescription();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getDescription() {
        return description;
    }
}
