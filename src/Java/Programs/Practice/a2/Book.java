package Java.Programs.Practice.a2;

public class Book {
    String title;

    // Normal constructor
    Book(String title) {
        this.title = title;
    }

    // Copy constructor
    Book(Book other) {
        this.title = other.title;
        System.out.println("Copy constructor called.");
    }

    void show() {
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book(book1);  // Copy constructor

        book1.show();
        book2.show();
    }
}
