package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        Person person1 = new Person("Agnes", " Nazie");

        Book book1 = new Book("java programming", "Mehrdad Javan");
        //print information
        System.out.println(person1.getPersonInformation());
        System.out.println(book1.getBookInformation());
        // Simulate borrowing a book
       // person1.loanBook(book1);
        //System.out.println(book1.getBookInformation());

        // Simulate returning a book
        person1.returnBook(book1);
        System.out.println(book1.getBookInformation());

    }

}
