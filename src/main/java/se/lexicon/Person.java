package se.lexicon;

import java.util.ArrayList;

public class Person {

    // variables
    private static int counter;
    private int personId;
    private String firstName;
    private String lastName;

    private ArrayList<Book> loanedBooks = new ArrayList<Book>();

    // getters
    public int getPersonId() { return personId; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    static int getUniqueId() { return counter++; }

    public void setFirstName(String firstName) {
        if(StringHelper.isNullOrEmpty(firstName)) throw new IllegalArgumentException("First name is null or empty");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(StringHelper.isNullOrEmpty(lastName)) throw new IllegalArgumentException("Last name is null or empty");
        this.lastName = lastName;
    }

    // constructor
    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        personId = getUniqueId();
    }

    public void loanBook(Book book){
        if(!book.isAvailable()) System.out.println("This book is not available to loan");
        else{
            book.setAvailable(false);
            book.setLender(this);
            loanedBooks.add(book);
            System.out.println("You Loaned " + book.getTitle());
        }
    }

    public void returnBook(Book book){
        if(!loanedBooks.contains(book)) System.out.println("You have not loaned this book");
        else {
            book.setAvailable(true);
            loanedBooks.remove(book);
            System.out.println("You returned " + book.getTitle());
        }
    }

    public String displayBooks(){
        String bookString = "";
        Book book;
        for (int i = 0; i < loanedBooks.size(); i++) {
            book = loanedBooks.get(i);
            bookString = bookString.concat("Book title: " + book.getTitle() + ". Book author: " + book.getAuthor() + ".\n");
        }
        return bookString;
    }



}
