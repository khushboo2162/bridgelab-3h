public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student(101, "Anjali Sharma", "A");
        Student student2 = new Student(102, "Rohit Verma", "B");

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        // Update grade
        System.out.println();
        student2.updateGrade("A+");

        // Display total students
        System.out.println();
        Student.displayTotalStudents();

        // Access roll number directly
        System.out.println("\nRoll Number of student1: " + student1.getRollNumber());
    }
}
