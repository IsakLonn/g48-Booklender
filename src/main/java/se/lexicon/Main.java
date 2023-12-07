package se.lexicon;

import java.util.ArrayList;

public class Main {

    ArrayList<Person> people = new ArrayList<Person>();
    ArrayList<Book> books = new ArrayList<Book>();

    static Person selectedPerson;
    static boolean hasSelectedPerson;
    static boolean isRunning = true;
    static int input = 0;
    public static void main(String[] args) {
        Test();
        //run();
    }

    private static void Test() {
        Book book1 = new Book("life of books", "august");
        Book book2 = new Book("my life", "isak");
        Person person = new Person("Isak", "Lönn");

        person.loanBook(book2);

        if(!book1.isAvailable()) System.out.println(book1.showPerson());
    }

    static void run(){
        while(isRunning){

            printMenu();

            input = Input.getIntInput();

            if(!hasSelectedPerson) menuLoop();
            else personLoop();

            System.out.println("Press any key to continue...");
            Input.getInput();

        }
    }

    private static void printMenu() {
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
    }

    private static void personLoop() {
        switch (input)
        {
            case 1: // loan book
                break;

            case 2: // return book
                break;

            case 3: // get all books
                break;

            case 4: // back to menu
                break;
        }
    }

    private static void menuLoop() {
        Person person;
        Book book;
        String firstname;
        String lastName;
        switch (input)
        {
            case 1: // create new person
                firstname = Input.getInput("Input first name: ");
                lastName = Input.getInput("Input last name: ");
                person = new Person(firstname, lastName);
                break;

            case 2: // create new book
                break;

            case 3: // display all books
                break;

            case 4: // display all people
                break;

            case 5: // select person
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