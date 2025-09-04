package constructor;

// Source code is decompiled from a .class file using FernFlower decompiler.
class Book {
   String title;
   String author;
   double price;

   public Book() {
      this.title = "Unknown";
      this.author = "Unknown";
      this.price = 0.0;
   }

   public Book(String var1, String var2, double var3) {
      this.title = var1;
      this.author = var2;
      this.price = var3;
   }

   public void display() {
      System.out.println("Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price);
   }

   public static void main(String[] var0) {
      Book var1 = new Book();
      Book var2 = new Book("Java Basics", "James Gosling", 499.99);
      var1.display();
      var2.display();
   }
}
