public class Student {
    // Static variable shared across all students
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;

    // Final variable to ensure rollNumber is immutable
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor using 'this' to resolve ambiguity
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled in " + universityName + ": " + totalStudents);
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll No. " + rollNumber + " to " + grade);
        } else {
            System.out.println("Cannot update grade. Invalid student object.");
        }
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }
}