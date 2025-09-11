public class Main {
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount(101, "Alice", 5000);
        BankAccount acc2 = new BankAccount(102, "Bob", 3000);

        // Deposit & Withdraw
        acc1.deposit(2000);
        acc2.withdraw(1000);

        // Display details
        acc1.displayDetails();
        acc2.displayDetails();

        // 🔹 Static method call
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}

