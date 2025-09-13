public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Amit", 101, 85000, 5);
        Employee emp2 = new Developer("Khushboo", 102, 70000, "Java");
        Employee emp3 = new Intern("Rahul", 103, 15000, 6);

        emp1.displayDetails();
        System.out.println("------------------");
        emp2.displayDetails();
        System.out.println("------------------");
        emp3.displayDetails();
    }
}
