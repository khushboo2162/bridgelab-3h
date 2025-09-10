import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderId;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order #" + orderId + " contains:");
        for (Product p : products) {
            p.display();
        }
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
