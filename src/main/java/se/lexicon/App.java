package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Initialize and display Book & Person instances
        Person person1 = new Person("Agnes", " Nazie");
        Person person2 = new Person("che", "mbo");
        Person person3 = new Person("Fidelis", "Fuche");


        Book book1 = new Book("java programming", "Mehrdad Javan");
        Book book2 = new Book("clean code", "Mehrdad Javan");
        Book book3 = new Book("The best", "Agnes Nazie");
        //print information
        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());

        // Simulate borrowing a book
        person3.loanBook(book3);
        System.out.println(book3.getBookInformation());

        //Simulate returning a book
        person1.returnBook(book1);
        System.out.println(book1.getBookInformation());

    }

}
