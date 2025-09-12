public class Book {
    // Static variable shared across all books
    private static String libraryName = "National Library of India";

    // Final variable to ensure ISBN is immutable
    private final String isbn;
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details with instanceof check
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    // Method to return ISBN
    public String getIsbn() {
        return isbn;
    }
}