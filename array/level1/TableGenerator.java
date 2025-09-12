import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number between 6 and 9: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 6 || number > 9) {
            System.out.println("Invalid input. Please enter a number between 6 and 9.");
            return;
        }

        // Define array to store multiplication results
        int[] multiplicationResult = new int[10];

        // Generate multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 1);
        }

        // Display the results
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }
    }
}
