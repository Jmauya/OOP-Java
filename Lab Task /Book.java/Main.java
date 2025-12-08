package oop;

public class Main {

    public static void main(String[] args) {
        
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        b1.bookDetails();
        
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        b2.bookDetails();
    }
}
