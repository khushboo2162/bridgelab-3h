import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.orderId);
    }

    public void displayOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.displayOrder();
            System.out.println("Total: ₹" + o.getTotalAmount());
            System.out.println();
        }
    }
}
