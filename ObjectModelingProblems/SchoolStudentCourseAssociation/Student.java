import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private int id;
    private Set<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new HashSet<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}