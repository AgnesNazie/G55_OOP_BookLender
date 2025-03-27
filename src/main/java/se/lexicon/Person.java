package se.lexicon;

public class Person {
    // creates fields for person class
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    // create constructors for person class

    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // create getters for nextId

    public static int getNextId() {
        return sequencer + 1;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(firstName + " " + lastName + "borrowed the book " + book.getTitle());
        } else {
            System.out.println("The book is already borrowed. ");
        }

    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(firstName + " " + lastName + "returned the book " + book.getTitle());
    }
}

}
