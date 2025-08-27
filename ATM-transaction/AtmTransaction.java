import java.util.Scanner;

public class AtmTransaction{

    public static void banking(int [] transaction){
       
        int balance = 0;

        for (int i : transaction) {
            if (i > 0) {
                System.out.println("Deposit: " +i);
            } else {
                System.out.println("Withdrawal: " + i);
            }
            balance += i;
        }

      System.out.println(balance);
    }



    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int  transaction[]= new int[n];
   for(int i=0;i<n;i++){
    transaction[i]= sc.nextInt();
   }
   banking(transaction);
   }
    
}