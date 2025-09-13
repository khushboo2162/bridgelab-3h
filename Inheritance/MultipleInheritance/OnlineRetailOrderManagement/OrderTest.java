public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-09-10");
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-09-11", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-09-12", "TRK654321", "2025-09-13");

        order.displayDetails();
        System.out.println("------------------");
        shipped.displayDetails();
        System.out.println("------------------");
        delivered.displayDetails();
    }
}
