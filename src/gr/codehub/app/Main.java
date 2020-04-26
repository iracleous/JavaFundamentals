package gr.codehub.app;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        float totalPrice;
        //method invocation, or method call, method usage
        totalPrice = calculation(12, 1.3f);
        System.out.println("Total price = " + totalPrice);

        Product product = new Product("A1","Patates",10,10);
        Product anotherProduct = new Product("A2", "Oranges",10,10);
        System.out.println(product.toString());
        System.out.println(anotherProduct.toString());

        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(anotherProduct);
       // products.add(product);

        float totalProductsPrice = 0;
        for( Product p : products){
            totalProductsPrice += p.getPrice() * p.getQuantity();
        }
        System.out.println(totalProductsPrice);

        for( Product p : products){
             System.out.println( " "+ p.getCode());
         }

        products.remove(0);
        products.remove(0);
        System.out.println(products.size());

        for (int i=0;i< products.size(); i++){
            System.out.println((i+1) + " "+ products.get(i).getPrice());
        }

        //defensive programming style example
        int position =3;
        if (position< products.size())
        {
            System.out.println(products.get(position));
        }

        // run-time error checking example
        try {
            System.out.println(products.get(3));
        }
        catch(Exception exception){
            System.out.println("This product does not exist");
        }

        System.out.println(products);


        if (product == anotherProduct) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They NOT are equal");
        }

        if (product.equals(anotherProduct) ) {
            System.out.println("They are equivalent");
        }
        else {
            System.out.println("They NOT are equivalent");
        }

        System.out.println(product.hashCode());
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
