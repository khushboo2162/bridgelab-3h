import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();

        // Step 2: Create arrays to store marks, percentages, and grades
        int[][] marks = new int[count][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[count];
        String[] grade = new String[count];

        // Step 3: Input marks with validation
        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks for " + subject + ": ");
                int mark = scanner.nextInt();

                if (mark < 0) {
                    System.out.println("Invalid input. Marks cannot be negative. Please re-enter this student.");
                    i--; // Retry current student
                    break;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // Step 4: Calculate percentage and grade
        for (int i = 0; i < count; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        // Step 5: Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-6s\n", "Student", "Physics", "Chemistry", "Maths", "Percent", "Grade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-6s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
