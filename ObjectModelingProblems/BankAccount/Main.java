public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("City Bank");

        // Create customers
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        // Open accounts (association between bank and customer)
        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c2, 102, 3000);
        bank.openAccount(c2, 103, 7000); // Bob has multiple accounts

        // Show customers of the bank
        bank.showCustomers();

        // Customers check their balances
        c1.viewBalance();
        c2.viewBalance();
    }
}

