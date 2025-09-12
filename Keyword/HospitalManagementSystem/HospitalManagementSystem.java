public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient(201, "Suman Joshi", 45, "Diabetes");
        Patient patient2 = new Patient(202, "Arjun Mehra", 30, "Fracture");

        // Display patient details
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        // Display total patients
        System.out.println();
        Patient.getTotalPatients();

        // Access patient ID directly
        System.out.println("\nPatient ID of patient1: " + patient1.getPatientID());
    }
}