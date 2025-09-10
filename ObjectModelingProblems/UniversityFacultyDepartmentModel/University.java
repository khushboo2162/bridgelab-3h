import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    // Composition: University creates and owns Departments
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty exists independently, just associated
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void display() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }

    // Simulate deletion
    public void deleteUniversity() {
        departments.clear(); // Composition: departments are deleted
        System.out.println("University deleted. All departments removed.");
    }
}