import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private List<Doctor> consultedDoctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public String getName() {
        return name;
    }

    public void displayConsultedDoctors() {
        System.out.println("Patient " + name + " consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}