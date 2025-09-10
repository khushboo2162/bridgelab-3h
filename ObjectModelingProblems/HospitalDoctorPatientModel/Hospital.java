import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void display() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}
