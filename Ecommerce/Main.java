package Ecommerce;

import java.util.Scanner;

public class Main {
  private static CustomerCart customerCart = CustomerCart.getInstance();

  public static void main(String[] args) {
    while (true) {
      System.out.println("What do you want to do?");
      System.out.println("1.User Mode\n2.Admin Mode\n3.Quit");
      Scanner sc = new Scanner(System.in);
      StockManager stock = new StockManager();
      // ShoppingCart cart1 = new ShoppingCart();
      String keepGoing = "y";

      String answer = "n";
      int input = sc.nextInt();
      while (input == 1) {
        System.out.println("Here're all product we have");
        stock.setStockInt();
        stock.getStockManager();

        System.out.println("Please Input your wanted items and Input 0 to end");


        System.out.println("Enter ID: ");
        Scanner ab = new Scanner(System.in);
        int inputedID = ab.nextInt();

        if (inputedID == 0) {
          System.out.println("do you want to remove? (y/n)");
          answer = sc.next();
          if (answer.equals("y")) {
            System.out.println("To remove enter ID: ");
            int delInput = sc.nextInt();
            customerCart.removeItem(stock.getId(delInput));
            customerCart.cartList();
          }

        } else if (inputedID == 9) {
          System.out.println("break\n\n");
          break;
        } else {
          System.out.println(inputedID);
          System.out.println(stock.getId(inputedID));
          customerCart.addItem(stock.getId(inputedID));
          customerCart.cartList();
        }



      }



      while (input == 2) {
        System.out.println("Welcome Admin");
        // cart1.addToCart(sc.next(), sc.nextInt());
        // System.out.println(cart1);
        System.out.println("Want to delete?");
        // cart1.deleteFromCart(sc.next());
        // System.out.println(cart1);
        System.out.println("add more product? (y/n)");
        keepGoing = sc.next();

      }


      if (input == 3) {
        System.out.println("Thank you!!");
        System.exit(0);
      }
    }
  }
}

