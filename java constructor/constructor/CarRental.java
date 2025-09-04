package constructor;

public class CarRental {
    String customerName;
   String carModel;
   int rentalDays;
   double dailyRate = 50.0;

   public CarRental() {
      this.customerName = "Unknown";
      this.carModel = "Not Assigned";
      this.rentalDays = 0;
   }

   public CarRental(String var1, String var2, int var3) {
      this.customerName = var1;
      this.carModel = var2;
      this.rentalDays = var3;
   }

   public double calculateTotalCost() {
      return (double)this.rentalDays * this.dailyRate;
   }

   public void display() {
      String var10001 = this.customerName;
      System.out.println("Customer: " + var10001 + ", Car: " + this.carModel + ", Days: " + this.rentalDays + ", Total Cost: " + this.calculateTotalCost());
   }

   public static void main(String[] var0) {
      CarRental var1 = new CarRental();
      CarRental var2 = new CarRental("Deepika", "Honda City", 5);
      var1.display();
      var2.display();
   }
}

