package se.lexicon;

import java.util.ArrayList;

public class Main {

    ArrayList<Person> people = new ArrayList<Person>();
    ArrayList<Book> books = new ArrayList<Book>();

    static Person selectedPerson;
    static boolean hasSelectedPerson;
    static boolean isRunning = true;
    public static void main(String[] args) {
        Book book1 = new Book("life of books", "august");
        Book book2 = new Book("my life", "isak");
        Person person = new Person("Isak", "Lönn");

        person.loanBook(book1);
        person.loanBook(book2);

        System.out.println("loaned books:");
        System.out.println(person.displayBooks());
        //run();
    }

    static void run(){
        while(isRunning){

            if(!hasSelectedPerson)
            {
                System.out.println("Welcome to the book lender");
                System.out.println("Commands: ");
                System.out.println("1. create new person");
                System.out.println("2. Create new book");
                System.out.println("3. Display all books");
                System.out.println("4. Display all people");
                System.out.println("5. Select person");
                System.out.println("6. Exit program");
            }
            else{
                System.out.println("Select what to do with this person: ");
                System.out.println("1. Loan a book");
                System.out.println("2. Return a book");
                System.out.println("3. Get all books");
                System.out.println("4. Back to menu");
            }

            int input = Input.getIntInput();

            if(!hasSelectedPerson){ // do "main menu" logic
                menuLoop(input);
            }
            else{ // do "person selection" logic
                switch (input)
                {

                }
            }

        }
    }

    private static void menuLoop(int input) {
        switch (input)
        {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                System.out.println("Are you sure you want to exit?");
                if(Input.getInput().toLowerCase().equals("yes")){
                    System.out.println("Exiting program");
                    isRunning = false;
                }
                break;
        }
    }
}