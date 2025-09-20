import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string and character to remove
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        StringBuilder result = new StringBuilder();

        // Build new string without the specified character
        for (char ch : input.toCharArray()) {
            if (ch != toRemove) {
                result.append(ch);
            }
        }

        System.out.println("Modified String: " + result.toString());
    }
}
