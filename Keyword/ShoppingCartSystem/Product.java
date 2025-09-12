public class Product {
    // Static variable shared across all products
    private static double discount = 10.0; // Default discount in percentage

    // Final variable to ensure productID is immutable
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to resolve ambiguity
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    // Method to display product details with instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }

    // Method to calculate total price after discount
    public double getTotalPrice() {
        double discountedPrice = price - (price * discount / 100);
        return discountedPrice * quantity;
    }

    // Getter for productID
    public String getProductID() {
        return productID;
    }
}