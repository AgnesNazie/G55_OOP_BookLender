package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Initialize and create person object
        Person person1 = new Person("Agnes", " Nazie");
        Person person2 = new Person("che", "mbo");
        Person person3 = new Person("Fidelis", "Fuche");


        // Create a list to store books
        List<Book> bookList = new ArrayList<>();

        // Add books to the list
        bookList.add(new Book("Java Programming", "Mehrdad Javan"));
        bookList.add(new Book("Clean Code", "Mehrdad Javan"));
        bookList.add(new Book("The best", "Agnes Nazie"));


        // Print information about books before borrowing
        System.out.println("Available Books:");
        for (Book book : bookList) {
            System.out.println(book.getBookInformation());
        }

        System.out.println("===============================================================");
        // Person borrows a book
        person1.loanBook(bookList.get(0)); // Agnes borrows "Java Programming"
        person2.loanBook(bookList.get(1)); // Che borrows "Clean Code"

        System.out.println("===============================================================");
        // Display updated book information
        System.out.println("\nUpdated Book Status:");
        for (Book book : bookList) {
            System.out.println(book.getBookInformation());
        }

        System.out.println("==============================================================");
        // Person returns a book
        person1.returnBook(bookList.get(0)); // Agnes returns "Java Programming"

        System.out.println("==============================================================");

        System.out.println("\nFinal Book Status:");
        for (Book book : bookList) {
            System.out.println(book.getBookInformation());

        }
    }
}