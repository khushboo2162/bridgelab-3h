public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("UP85AB1234", "Ramesh Kumar", "Car");
        Vehicle v2 = new Vehicle("DL01CD5678", "Priya Sharma", "Scooter");

        // Display vehicle details
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Update registration fee
        System.out.println();
        Vehicle.updateRegistrationFee(5500.0);

        // Display updated fee for one vehicle
        System.out.println("\nAfter fee update:");
        v1.displayVehicleDetails();
    }
}
