package se.lexicon.model;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion
    // creates fields for person class
    private static int sequencer = 0000;
    private int id;
    private String firstName;
    private String lastName;

    // create constructors for person class

    public Person(String firstName, String lastName) {
        // throw exception to handel missing name
        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("first name  cannot be empty");
        }
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //create getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // create method for nextId

    public static int getNextId() {
        return sequencer + 1;
    }

    public void loanBook(Book book) {
        //prevent book from  being default (null)
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        // prevent borrowing unavailable book
        if (!book.isAvailable()) {
            throw new IllegalStateException("This book is already borrowed.");
        }
        book.setAvailable(false);
        System.out.println(firstName + " " + lastName + "borrowed the book " + book.getTitle());
    }

    public void returnBook(Book book) {
        //prevent borrowing returning book that was not borrowed
        if (book == null) throw new IllegalArgumentException("Book cannot be null.");

        if (book.isAvailable())
            throw new IllegalStateException("This book was not borrowed");

        book.setAvailable(true);
        System.out.println(firstName + " " + lastName + " returned the book " + book.getTitle());

    }

    public String getPersonInformation() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }

}

