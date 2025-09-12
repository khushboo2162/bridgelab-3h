public class Vehicle {
    // Static variable shared across all vehicles
    private static double registrationFee = 5000.0; // Default fee in INR

    // Final variable to ensure immutability
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to resolve ambiguity
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    // Method to display vehicle details with instanceof check
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }

    // Getter for registration number
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}