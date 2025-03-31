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
    private Person borrower;

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

    public Book(String title, String author,Person borrower) {
        if (title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()) {
            System.out.println("Title and Author cannot be empty");
            return;
        }
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available = borrower == null ? true : false;
        this.borrower = borrower;
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
    // Getter for the borrower
    public Person getBorrower() {
        return borrower;
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
        // Using StringBuilder for cleaner string formatting
        StringBuilder info = new StringBuilder();
        info.append("ID:  ").append(id)
                .append(", Title: ").append(title)
                .append(", Author: ").append(author)
                .append(", Available: ").append(available);
        if (borrower != null) {
            info.append(", Borrowed by: ").append(borrower.getFirstName()).append(" ").append(borrower.getLastName());
        }
        return info.toString();
    }
}
