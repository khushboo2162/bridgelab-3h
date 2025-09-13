public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
            "Java Mastery Bootcamp",
            8,
            "Udemy",
            true,
            4999.0,
            20.0
        );

        poc.displayDetails();
    }
}