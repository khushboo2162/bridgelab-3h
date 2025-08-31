import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }

        // Create arrays for odd and even numbers
        int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        // Separate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print odd numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print even numbers
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();
    }
}
