package oriented_objects_programming.book_management_system;

public class App {
    public static void main(String[] args) {
        Book book_1 = new Book("El Guardián entre el Centeno", "J.D. Salinger", 277, false);
        Book book_2 = new Book("Matar a un Ruiseñor", "Harper Lee", 336, false);
        Book book_3 = new Book("1984", "George Orwell", 328, false);
        Book book_4 = new Book("Orgullo y Prejuicio", "Jane Austen", 279, false);
        Book book_5 = new Book("El Gran Gatsby", "F. Scott Fitzgerald", 180, false);
        Library library = new Library();
        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);
        library.addBook(book_4);
        library.addBook(book_5);

        System.out.println("available books before loan");
        library.showAvailableBooks();
        System.out.println("lend books");
        library.lendBook("El Guardián entre el Centeno");
        library.lendBook("1984");
        System.out.println("available books after loan");
        library.showAvailableBooks();
        System.out.println("return books");
        library.returnBook("El Guardián entre el Centeno");
        System.out.println("available books after return");
        library.showAvailableBooks();

    }
}
