package se;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    // create constructors

    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
