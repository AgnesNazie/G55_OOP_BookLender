package se.lexicon;

public class Book {
    // create fields for book class

    private String id;
    private  String title;
    private String author;
    private  boolean available;

    //creates constructors for book class

    public  Book(String title, String author) {
        this.id = generateBookId();
        this.title = title;
        this.author = author;
    }

    //create another constructor for book class

    public  Book(String title, String author, boolean available) {
        this.id = generateBookId();
        this.title = title;
        this.author = author;
        this.available= available;
    }
}
