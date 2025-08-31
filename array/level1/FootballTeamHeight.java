import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height (in cm) of 11 football players:");

        // Input heights and calculate sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.printf("\nMean height of the football team: %.2f cm\n", mean);
    }
}
