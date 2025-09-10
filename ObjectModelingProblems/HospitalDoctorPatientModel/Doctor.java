import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this); // mutual association
        System.out.println("Dr. " + name + " consulted patient " + patient.getName());
    }

    public void displayPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}
