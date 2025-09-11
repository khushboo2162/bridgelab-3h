public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Khushboo Sharma");
        BankAccount acc2 = new BankAccount(102, "Amit Verma");

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
