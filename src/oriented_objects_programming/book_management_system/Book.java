package oriented_objects_programming.book_management_system;

public class Book {
    private String title;
    private String author;
    private int pagesNumber;
    private boolean isBorrowed;

    public Book(){}

    public Book(String title, String author, int pagesNumber, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public boolean status() {
        return this.isBorrowed;
    }

    public void lend_book() {
        this.isBorrowed = true;
    }

    public void return_book(){
        this.isBorrowed = false;
    }

    @Override
    public String toString(){
        return "title\t" + this.title +
                "\nauthor\t" + this.author +
                "\npagesNumber\t" + this.pagesNumber +
                "\nisBorrowed\t" + this.isBorrowed;
    }
}
