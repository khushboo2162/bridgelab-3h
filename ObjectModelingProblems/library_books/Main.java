public class Main {
    public static void main(String[] args) {
        // Create books (independent of any library)
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Create libraries
        Library cityLibrary = new Library("City");
        Library collegeLibrary = new Library("College");

        // Add books to libraries (aggregation relationship)
        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        collegeLibrary.addBook(b2); // same book can exist in multiple libraries
        collegeLibrary.addBook(b3);

        // Show books in each library
        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
}

