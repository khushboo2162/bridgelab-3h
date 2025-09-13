   public class RestaurantTest {
    public static void main(String[] args) {
        Worker chef = new Chef("Khushboo", 101, "Italian");
        Worker waiter = new Waiter("Ravi", 102, 5);

        System.out.println("=== Chef Details ===");
        ((Chef) chef).displayInfo();
        ((Chef) chef).displayRole();
        chef.performDuties();

        System.out.println("\n=== Waiter Details ===");
        ((Waiter) waiter).displayInfo();
        ((Waiter) waiter).displayRole();
        waiter.performDuties();
    }
}

