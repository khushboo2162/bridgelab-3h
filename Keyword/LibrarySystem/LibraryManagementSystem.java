public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();
        System.out.println();

        // Create book objects
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", "9788173711466");
        Book book2 = new Book("The Guide", "R.K. Narayan", "9788185986005");

        // Display book details
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();

        // Access ISBN directly
        System.out.println("\nAccessing ISBN of book1: " + book1.getIsbn());
    }
}
