import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department d : departments) {
            if (d.name.equals(deptName)) {
                return d;
            }
        }
        return null;
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.displayEmployees();
        }
    }

    public void dissolveCompany() {
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear(); // Simulates deletion of departments
        System.out.println("Company " + name + " has been dissolved.");
    }
}
