package se.lexicon.model;

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
    //create method to loan a book

    public void loanBook(Book book) {
        //check if the book is available before borrowing
        if (book == null) {
            System.out.println("Book cannot be null.");
            return;
        }
        // prevent borrowing unavailable book
        if (!book.isAvailable()){
            System.out.println("This book is already borrowed.");
            return;
        }
        //marks book as borrow if available
        book.setAvailable(false);
        System.out.println(firstName + " " + lastName + " borrowed the book " + book.getTitle());
    }
    //create method to return a book

    public void returnBook(Book book) {
        //check if book is null or already returned
        if (book == null) {
            System.out.println("Book cannot be null.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("This book was not borrowed");
            return;
        }
        //mark book as available after returning
        book.setAvailable(true);
        System.out.println(firstName + " " + lastName + " returned the book " + book.getTitle());

    }

    //create method to get person information

    public String getPersonInformation() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }

}

