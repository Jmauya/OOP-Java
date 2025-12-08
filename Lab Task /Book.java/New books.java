package oop;

public class Book {

    String title;
    String author;
    int number_of_pages;

    // Constructor 1: without pages
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.number_of_pages = 0;  // default value if not given
    }

    // Constructor 2: with pages
    public Book(String title, String author, int number_of_pages) {
        this.title = title;
        this.author = author;
        this.number_of_pages = number_of_pages;
    }

    // Method to display details
    void bookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + number_of_pages);
        System.out.println();
    }
}
