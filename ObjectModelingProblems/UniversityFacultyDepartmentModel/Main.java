
public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Verma");

        University uni = new University("Meerut University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        System.out.println("Before deletion:");
        uni.display();

        uni.deleteUniversity();

        System.out.println("\nAfter deletion:");
        uni.display();

        System.out.println("\nFaculty still exists independently:");
        f1.display();
        f2.display();
    }
}