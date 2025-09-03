
class MovieTicket {
    // Private fields for encapsulation
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize with default values
    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    // Getter and Setter for movieName
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Getter and Setter for seatNumber
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : ₹" + price);
    }
}

// Main class to test the MovieTicket class
public class MovieTicketSystem {
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Book a ticket
        ticket.bookTicket("Jawan", "B12", 250.00);

        // Display ticket details
        ticket.displayDetails();
    }
}
