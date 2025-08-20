import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) { System.out.println("Invalid! Re-enter."); i--; continue; }

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) { System.out.println("Invalid! Re-enter."); i--; continue; }

            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) { System.out.println("Invalid! Re-enter."); i--; continue; }

            // d. Calculate percentage
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // e. Assign grade
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // f. Display results
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t\t%c\n",
                    physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

    }
}
