import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split sentence into words using space as delimiter
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + maxLength);
    }
}
