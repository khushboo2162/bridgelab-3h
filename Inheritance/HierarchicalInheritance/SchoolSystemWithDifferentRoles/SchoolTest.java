public class SchoolTest {
    public static void main(String[] args) {
        Person teacher = new Teacher("Mrs. Sharma", 40, "Mathematics");
        Person student = new Student("Khushboo", 20, "Grade 12");
        Person staff = new Staff("Mr. Verma", 35, "Administration");

        teacher.displayDetails();
        teacher.displayRole();
        System.out.println("------------------");

        student.displayDetails();
        student.displayRole();
        System.out.println("------------------");

        staff.displayDetails();
        staff.displayRole();
    }
}
