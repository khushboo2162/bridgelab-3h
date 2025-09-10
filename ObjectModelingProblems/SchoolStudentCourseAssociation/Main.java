public class Main {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);

        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        school.addStudent(alice);
        school.addStudent(bob);

        math.enrollStudent(alice);
        physics.enrollStudent(alice);
        physics.enrollStudent(bob);

        school.showStudents();
        alice.viewCourses();
        bob.viewCourses();
        math.showEnrolledStudents();
        physics.showEnrolledStudents();
    }
}
