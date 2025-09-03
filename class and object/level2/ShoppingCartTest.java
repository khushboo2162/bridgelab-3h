// Program to Simulate a Shopping Cart

import java.util.ArrayList;

// CartItem class to represent individual items in the cart
class CartItem {
    // Private fields for encapsulation
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize item attributes
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalCost());
    }
}

// ShoppingCart class to manage multiple CartItem objects
class ShoppingCart {
    private ArrayList<CartItem> items;

    // Constructor to initialize the cart
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " added to cart.");
    }

    // Method to remove an item from the cart by name
    public void removeItem(String itemName) {
        boolean found = false;
        for (CartItem item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                System.out.println(itemName + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart: " + itemName);
        }
    }

    // Method to display total cost of all items
    public void displayTotalCost() {
        double total = 0;
        System.out.println("\nCart Summary:");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

// Main class to test the ShoppingCart system
public class ShoppingCartTest {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(new CartItem("Laptop", 55000.00, 1));
        cart.addItem(new CartItem("Mouse", 799.00, 2));
        cart.addItem(new CartItem("Headphones", 1999.00, 1));

        // Display total cost
        cart.displayTotalCost();

        // Remove an item
        cart.removeItem("Mouse");

        // Display updated total cost
        cart.displayTotalCost();
    }
}
