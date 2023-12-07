package se.lexicon;

public class Book {
    private String title;
    private String author;
    private boolean available = true;
    private Person lender;

    public Person getLender(){
        return lender;
    }
    public void setLender(Person lender){
    this.lender = lender;
    if (lender != null) {
        setAvailable(false);
    }
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("author cannot be null");
        }
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String title, String author){
    setAuthor(author);
    setTitle(title);
    }
}
