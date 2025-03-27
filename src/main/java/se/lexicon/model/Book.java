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

    //creates constructors for book class

    public Book(String title, String author) {
        if (title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()) {
            throw  new IllegalArgumentException("Title and author cannot be empty.");
        }
        this.id = generateBookId();
        this.title = title;
        this.author = author;
    }

    //create another constructor for book class

    public Book(String title, String author, boolean available) {
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available = available;
    }

    //create setters
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // create getters
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

    private String generateBookId() {
        return "B-" + UUID.randomUUID().toString();
    }

    public String getBookInformation() {
        return "ID:" + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}
