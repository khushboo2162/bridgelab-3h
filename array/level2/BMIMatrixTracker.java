
import java.util.Scanner;

public class BMIMatrixTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Step 2: Create 2D array for weight, height, BMI and 1D array for status
        double[][] personData = new double[number][3]; // [][0]=weight, [][1]=height, [][2]=BMI
        String[] weightStatus = new String[number];

        // Step 3: Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight
            while (true) {
                System.out.print("Enter weight in kilograms: ");
                double weight = scanner.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Invalid input. Weight must be positive.");
                }
            }

            // Input height
            while (true) {
                System.out.print("Enter height in meters: ");
                double height = scanner.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Invalid input. Height must be positive.");
                }
            }

            // Step 4: Calculate BMI
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-12s %-12s %-12s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-12.2f %-15s\n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}