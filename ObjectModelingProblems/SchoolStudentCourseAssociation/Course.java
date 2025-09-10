import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseName;
    private Set<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new HashSet<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.addCourse(this); // maintain bidirectional link
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}