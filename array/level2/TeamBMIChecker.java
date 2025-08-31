import java.util.Scanner;

public class TeamBMIChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter the number of persons in the team: ");
        int count = scanner.nextInt();

        // Step 2: Create arrays to store data
        double[] weight = new double[count];
        double[] height = new double[count];
        double[] bmi = new double[count];
        String[] status = new String[count];

        // Step 3: Input weight and height
        for (int i = 0; i < count; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight in kilograms: ");
            weight[i] = scanner.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = scanner.nextDouble();

            // Step 4: Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Step 5: Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI Status");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-15s\n", (i + 1), height[i], weight[i], status[i]);
        }
    }
}
