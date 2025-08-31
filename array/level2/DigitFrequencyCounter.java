import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for a number
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Step 2: Count digits and store them in an array
        int[] digits = new int[20]; // max 20 digits for safety
        int index = 0;
        long temp = number;

        while (temp != 0) {
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 3: Frequency array for digits 0–9
        int[] frequency = new int[10];

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Step 4: Display frequency of each digit
        System.out.println("\nDigit Frequency in " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}
