package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion
    // create fields for book class

    private String id;
    private String title;
    private String author;
    private boolean available;

    //creates constructors for book class

    public Book(String title, String author) {
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
    public void SetAvailable(boolean available) {
        this.available = available;
    }

    // create getters
    public String getId() {

    }


    private String generateBookId() {
        return "B-" + UUID.randomUUID().toString();
    }

    public String getBookInformation() {
        return "ID:" + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}
