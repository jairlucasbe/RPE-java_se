package oriented_objects_programming.book_management_system;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public void showAvailableBooks(){
        for(Book book : this.books){
            if(!book.status()){
                System.out.println("-----------");
                System.out.print(book.toString());
                System.out.println();
            }
        }
    }

    public Book searchBookByTitle(String title){
        Book searched_book = new Book();
        for(Book book : this.books){
            if(book.getTitle().equalsIgnoreCase(title)){
                searched_book = book;
            }
        }
        return searched_book;
    }

    public void lendBook(String title){
        Book book = searchBookByTitle(title);
        if(!book.status()){
            book.lend_book();
        }
    }

    public void returnBook(String title){
        Book book = searchBookByTitle(title);
        if(book.status()){
            book.return_book();
        }
    }
}
