// Program to Check Palindrome String

// PalindromeChecker class with encapsulated field and meaningful methods
class PalindromeChecker {
    // Private field to store the text
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Getter for text
    public String getText() {
        return text;
    }

    // Setter for text
    public void setText(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Input Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result    : The text is a palindrome.");
        } else {
            System.out.println("Result    : The text is not a palindrome.");
        }
    }
}

// Main class to test the PalindromeChecker class
public class PalindromeTest {
    public static void main(String[] args) {
        // Creating a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker("Madam");

        // Displaying the result
        checker.displayResult();
    }
}
