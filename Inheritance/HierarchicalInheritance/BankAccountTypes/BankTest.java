public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV123", 25000.0, 4.5);
        BankAccount acc2 = new CheckingAccount("CHK456", 15000.0, 10000.0);
        BankAccount acc3 = new FixedDepositAccount("FD789", 50000.0, 12);

        acc1.displayDetails();
        acc1.displayAccountType();
        System.out.println("------------------");

        acc2.displayDetails();
        acc2.displayAccountType();
        System.out.println("------------------");

        acc3.displayDetails();
        acc3.displayAccountType();
    }
}
