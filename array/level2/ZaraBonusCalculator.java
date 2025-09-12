import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop with validation
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            double s = scanner.nextDouble();

            System.out.print("Enter years of service: ");
            double y = scanner.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years >= 0. Please re-enter.");
                i--; // Retry current employee
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Bonus calculation loop
        for (int i = 0; i < 10; i++) {
            double rate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Bonus Report ---");
        System.out.printf("%-10s %-12s %-10s %-10s %-12s\n", "EmpID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12.2f %-10.1f %-10.2f %-12.2f\n",
                    (i + 1), salary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTALS     %-12.2f %-10s %-10.2f %-12.2f\n",
                totalOldSalary, "", totalBonus, totalNewSalary);
    }
}