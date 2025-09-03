 class Employee {
    // Private fields for encapsulation
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize employee attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);
    }
}

// Main class to test the Employee class
public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Amit Sharma", 101, 55000.75);

        // Displaying employee details
        emp.displayDetails();
    }
}