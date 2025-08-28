// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class RailwayReservationEasy {
   static int seats = 3;
   static int booked = 0;

   public RailwayReservationEasy() {
   }

   public static void showTrains() {
      System.out.println("\n1. Express - 500");
      System.out.println("2. SuperFast - 800");
      System.out.println("3. Local - 200");
   }

   public static void bookSeat(int var0) {
      if (booked < seats) {
         switch (var0) {
            case 1:
               System.out.println("Express seat booked!");
               break;
            case 2:
               System.out.println("SuperFast seat booked!");
               break;
            case 3:
               System.out.println("Local seat booked!");
               break;
            default:
               System.out.println("Invalid choice!");
         }

         ++booked;
      } else {
         System.out.println("No seats left → Waiting List");
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      do {
         showTrains();
         System.out.print("Choose train seat (1-3): ");
         int var2 = var1.nextInt();
         bookSeat(var2);
         System.out.print("Book more? (1-Yes / 0-No): ");
      } while(var1.nextInt() == 1);

      System.out.println("Booking closed! Seats booked = " + booked);
   }
}