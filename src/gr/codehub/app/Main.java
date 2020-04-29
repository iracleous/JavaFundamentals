package gr.codehub.app;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Ui ui = new Ui();
        Basket basket = new Basket();
       int choice=1;
        do {

              choice = ui.menu();

            //1. Add a product to Basket   2. Remove a product" +
            //                "    3. Display basket     4.  Clear basket     0. Exit"
            switch (choice) {
                case 1:
                    Product product = ui.createProduct();
                    basket.addProduct(product);
                    break;
                case 2:
                    break;
                case 3:
                    basket.displayProducts();
                    break;
                case 4:
                    basket.clearProducts();
                    break;
                case 5:
                    System.out.println("TotalCost= " + basket.getTotalCost());
                    break;

                case 0:

            }
        }while(choice!=0);
  
    }


    //method declaration or method definition
    // static method, should be avoided
    public static float calculation(int quantity, float price) {
          float totalPrice;
          float tax = 1.1f;
          totalPrice = quantity * price;
          return totalPrice + tax;
    }


}
