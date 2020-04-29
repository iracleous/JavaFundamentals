package gr.codehub.app;

import java.util.Scanner;

public class Ui {

    public Choice menu(){
        Choice returnChoice;
        System.out.println("1. Add a product to Basket   2. Remove a product" +
                "    3. Display basket     4.  Clear basket     0. Exit" +
                "");

        int choice;
        Scanner scanner = new Scanner(System.in);
    try {
            choice = scanner.nextInt();
            switch(choice){
                case 1: return Choice.ADD;
                case 2: return Choice.REMOVE;
                case 3: return Choice.DISPLAY;
                case 4: return Choice.CLEAR;
                case 5: return Choice.TOTALCOST;
                case 6: return Choice.SAVE;
                case 7: return Choice.LOAD;
                case 0: return Choice.EXIT;
                default:return Choice.ERROR;
            }
        }
    catch(Exception e){
        return Choice.ERROR;
    }

    }

    //factory method design pattern
    public Product createProduct(){
        String code;
        String name;
        float price;
        int quantity;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the product code ");
        code = scanner.next();
        System.out.println("Give the product name ");
        name = scanner.next();
        System.out.println("Give the product price ");
        price = scanner.nextFloat();
        System.out.println("Give the product quantity ");
        quantity = scanner.nextInt();

        Product product = new Product(code, name, price, quantity);

        return product;

    }


    public void manageBasket(Basket basket){
        Choice choice;
        do {
            choice =  menu();

            switch (choice) {
                case ADD:
                    Product product =  createProduct();
                    basket.addProduct(product);
                    break;
                case REMOVE:
                    System.out.println("Give an index to remove");
                    Scanner scanner = new Scanner(System.in);
                    int index= scanner.nextInt();
                    basket.removeProduct(index);
                    break;
                case DISPLAY:
                    basket.displayProducts();
                    break;
                case CLEAR:
                    basket.clearProducts();
                    break;
                case TOTALCOST:
                    System.out.println("TotalCost= " + basket.getTotalCost());
                    break;
                case EXIT:
                    break;
                case SAVE:
                    basket.saveBasket("basket.txt");
                    break;
                case LOAD:
                    basket.loadBasket("basket.txt");
                    break;
                case ERROR:
                    System.out.println("You gave erroneous input");
                    break;

            }
        }while(choice!=Choice.EXIT);

    }




}
