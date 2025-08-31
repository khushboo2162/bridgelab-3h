import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Step 2: Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Create reversed array
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display reversed digits
        System.out.println("\nReversed digits:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        System.out.println(); // for clean output
    }
}
