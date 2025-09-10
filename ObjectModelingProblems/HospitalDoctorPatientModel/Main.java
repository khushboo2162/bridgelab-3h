public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare Hospital");

        Doctor d1 = new Doctor("Mehta");
        Doctor d2 = new Doctor("Singh");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Neha");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println("\n--- Doctor Consultations ---");
        d1.displayPatients();
        d2.displayPatients();

        System.out.println("\n--- Patient Consultations ---");
        p1.displayConsultedDoctors();
        p2.displayConsultedDoctors();

        System.out.println("\n--- Hospital Overview ---");
        hospital.display();
    }
}
