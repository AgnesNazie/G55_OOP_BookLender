package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // create fields for book class
    private String id;
    private String title;
    private String author;
    private boolean available;

    //creates constructors for book class (without borrower)

    public Book(String title, String author) {
        if (title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()) {
            System.out.println("Title and Author cannot be empty");
            return;
        }
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available = true;
    }

    //create another constructor for book class(with borrower)

    public Book(String title, String author, boolean available) {
        if (title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()) {
            System.out.println("Title and Author cannot be empty");
            return;
        }
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // create getters for fields
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return available;
    }
    //create setter for availability

    public void setAvailable(boolean available) {
        this.available = available;
    }
    //create methods to generate unique id for book

    private String generateBookId() {
        return "B-" + UUID.randomUUID().toString();
    }
    //create method to get information for the book

    public String getBookInformation() {
        return "ID:" + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}
