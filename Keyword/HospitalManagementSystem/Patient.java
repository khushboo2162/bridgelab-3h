public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "AIIMS Delhi";
    private static int totalPatients = 0;

    // Final variable to ensure patientID is immutable
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to resolve ambiguity
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted in " + hospitalName + ": " + totalPatients);
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    // Getter for patientID
    public int getPatientID() {
        return patientID;
    }
}