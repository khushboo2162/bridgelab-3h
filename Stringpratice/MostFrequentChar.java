
import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase for uniform comparison (optional)
        input = input.toLowerCase();

        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        // Find the character with the highest frequency
        char mostFrequent = ' ';
        int maxCount = 0;

        for (char ch : input.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
