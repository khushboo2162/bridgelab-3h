public class BankAccount {
    // 🔹 Static variable shared across all accounts
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;   // to count total accounts created

    // 🔹 Final variable: cannot be changed once assigned
    private final int accountNumber;

    // Instance variables
    private String accountHolderName;
    private double balance;

    // 🔹 Constructor using 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++; // increase count whenever a new account is created
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // 🔹 Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // 🔹 Method to display details (with instanceof check)
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
            System.out.println("---------------------------");
        }
    }
}
