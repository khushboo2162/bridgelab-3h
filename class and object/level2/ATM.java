// Program to Simulate an ATM

// BankAccount class with encapsulated fields and meaningful methods
class BankAccount {
    // Private fields for encapsulation
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance and account details
    public void displayDetails() {
        System.out.println("Bank Account Details:");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main class to test the BankAccount class
public class ATM {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("Ravi Kumar", "ACC123456", 10000.00);

        // Display initial details
        account.displayDetails();

        // Perform deposit
        account.deposit(2500.00);

        // Perform withdrawal
        account.withdraw(4000.00);

        // Attempt to withdraw more than balance
        account.withdraw(10000.00);

        // Display final details
        account.displayDetails();
    }
}