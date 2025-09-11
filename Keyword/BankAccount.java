public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Final variable to ensure immutability
    private final int accountNumber;
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++; // Increment total accounts on creation
    }

    // Static method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    // Method to display account details using instanceof
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Optional: Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}