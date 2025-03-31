package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {

    //static sequencer for generating unique id
    private static int sequencer = 0;
    // creates fields for person class
    private int id;
    private String firstName;
    private String lastName;
    // New attribute to track borrowed books
    private List<Book> borrowedBooks;

    // create constructors for person class

    public Person(String firstName, String lastName) {
        // throw exception to handel missing name
        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name and last name cannot be empty.");
        }
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowedBooks = new ArrayList<>();
    }

    //create getters for fields
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // create method to get the next Id

    public static int getNextId() {
        return sequencer + 1;
    }
    // Method to loan a book
    public void loanBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");

        }
        if (!book.isAvailable()) {
            throw new IllegalArgumentException("The book is already borrowed.");

        }
        book.setAvailable(false);
        borrowedBooks.add(book);

        // Using StringBuilder for message construction
        StringBuilder sb = new StringBuilder();
        sb.append(firstName)
                .append(" ")
                .append(lastName)
                .append(" borrowed the book '")
                .append(book.getTitle())
                .append("'.");
        System.out.println(sb);

    }
    //create method to return a book

    public void returnBook(Book book) {
        //check if book is null or already returned
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }

        if (book.isAvailable()) {
            throw new IllegalArgumentException("This book was not borrowed");
        }
        //mark book as available after returning
        book.setAvailable(true);
        borrowedBooks.remove(book);


        StringBuilder sb = new StringBuilder();
        sb.append(firstName)
                .append("  ")
                .append(lastName)
                .append(" returned the book '")
                .append(book.getTitle())
                .append("' .");
        System.out.println(sb);

    }

    //create method to get person information

    public String getPersonInformation() {
        StringBuilder infor = new StringBuilder();
        infor.append("ID: " ).append(id)
                .append("Name: ").append(firstName)
                .append(" ").append(lastName);
        return infor.toString();
    }

}

