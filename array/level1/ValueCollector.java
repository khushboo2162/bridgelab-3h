import java.util.Scanner;

public class ValueCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop:");

        while (true) {
            System.out.print("Enter value " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                System.out.println("Stopping input due to non-positive value.");
                break;
            }

            values[index] = input;
            index++;

            if (index == 10) {
                System.out.println("Maximum of 10 values reached.");
                break;
            }
        }

        System.out.println("\nEntered values:");
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
            total += values[i];
        }

        System.out.printf("\nTotal sum of entered values: %.2f\n", total);
    }
}
