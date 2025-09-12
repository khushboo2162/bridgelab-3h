public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create product objects
        Product prod1 = new Product("P101", "Wireless Mouse", 799.0, 2);
        Product prod2 = new Product("P102", "Bluetooth Speaker", 1499.0, 1);

        // Display product details
        prod1.displayProductDetails();
        System.out.println("Total Price: ₹" + prod1.getTotalPrice());
        System.out.println();

        prod2.displayProductDetails();
        System.out.println("Total Price: ₹" + prod2.getTotalPrice());
        System.out.println();

        // Update discount
        Product.updateDiscount(15.0);

        // Display updated prices
        System.out.println("\nAfter updating discount:");
        prod1.displayProductDetails();
        System.out.println("Total Price: ₹" + prod1.getTotalPrice());
    }
}
