public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Kapoor");
        Professor prof2 = new Professor("Prof. Iyer");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        Student s1 = new Student("Khushboo");
        Student s2 = new Student("Aman");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        System.out.println("\n--- Student Course Summary ---");
        s1.displayCourses();
        s2.displayCourses();
    }
}
