import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Reverse the array manually
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            // Swap characters
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        // Convert back to string and display
        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
    }
}
