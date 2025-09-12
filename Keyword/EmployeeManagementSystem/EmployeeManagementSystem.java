public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee(101, "Rahul Mehta", "Software Engineer");
        Employee emp2 = new Employee(102, "Neha Kapoor", "Project Manager");

        // Display employee details
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        // Display total employees
        System.out.println();
        Employee.displayTotalEmployees();

        // Access employee ID directly
        System.out.println("\nAccessing ID of emp1: " + emp1.getId());
    }
}
