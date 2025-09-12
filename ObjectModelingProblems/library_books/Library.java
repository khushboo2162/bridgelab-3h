import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;   // Aggregation: Library has many Books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books
    public void showBooks() {
        System.out.println("Books in " + name + " library:");
        for (Book book : books) {
            System.out.println(" - " + book);
        }
        System.out.println();
    }
}

