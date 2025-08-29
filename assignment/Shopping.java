

import java.util.Scanner;

public class Shopping {

    // Method to show menu
    public static void showMenu() {
        System.out.println("\n===== Product Menu =====");
        System.out.println("1. Laptop - Rs.40000");
        System.out.println("2. Mobile - Rs.15000");
        System.out.println("3. Headphones - Rs.2000");
        System.out.println("4. Smart Watch - Rs.5000");
    }

    // Method to get price of selected item
    public static int getItemPrice(int choice) {
        switch (choice) {
            case 1: return 40000;
            case 2: return 15000;
            case 3: return 2000;
            case 4: return 5000;
            default: 
                System.out.println("Invalid choice! Skipping item.");
                return 0;
        }
    }

    // Method to calculate bill for a single customer
    public static int calculateBill(int itemCount, Scanner sc) {
        int total = 0;
        for (int i = 1; i <= itemCount; i++) {
            showMenu();
            System.out.print("Enter choice for product " + i + ": ");
            int choice = sc.nextInt();
            total += getItemPrice(choice);
        }
        return total;
    }

    // Method to apply discount if applicable
    public static int applyDiscount(int total) {
        if (total > 5000) {
            System.out.println("\nYou are eligible for a 10% discount!");
            total = total - (total * 10 / 100);
        } else {
            System.out.println("\nNo discount applied.");
        }
        return total;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;

        // Handle multiple customers
        while (moreCustomers) {
            int itemCount;

            // Ensure at least one product is bought
            do {
                System.out.print("\nEnter number of items you want to buy (at least 1): ");
                itemCount = sc.nextInt();
            } while (itemCount < 1);

            // Calculate total for this customer
            int total = calculateBill(itemCount, sc);

            // Apply discount
            total = applyDiscount(total);

            // Show final bill
            System.out.println("Final Bill Amount: Rs." + total);

            // Check for next customer
            System.out.print("\nIs there another customer? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                moreCustomers = false;
            }
        }

        System.out.println("\nThank you for shopping with us!");
        sc.close();
    }
}
