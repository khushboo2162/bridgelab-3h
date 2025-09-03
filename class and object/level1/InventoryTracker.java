// Program to Track Inventory of Items

// Item class with encapsulated fields and meaningful methods
class Item {
    // Private fields for encapsulation
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize item attributes
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Getter for itemCode
    public int getItemCode() {
        return itemCode;
    }

    // Setter for itemCode
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    // Getter for itemName
    public String getItemName() {
        return itemName;
    }

    // Setter for itemName
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Code  : " + itemCode);
        System.out.println("Name  : " + itemName);
        System.out.println("Price : ₹" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class to test the Item class
public class InventoryTracker {
    public static void main(String[] args) {
        // Creating an Item object
        Item item = new Item(1001, "Wireless Mouse", 799.50);

        // Displaying item details
        item.displayDetails();

        // Calculating and displaying total cost for a quantity
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Total Cost     : ₹" + totalCost);
    }
}
