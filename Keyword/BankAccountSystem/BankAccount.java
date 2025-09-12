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
        totalAccounts++;
    }

    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }

    // Method to display account details with instanceof check
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Amit Sharma");
        BankAccount acc2 = new BankAccount(102, "Priya Verma");

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}