package gr.codehub.app;

public class Main {
    public static void main(String[] args) {
        float totalPrice;
        //method invocation, or method call, method usage
        totalPrice = calculation(12, 1.3f);
        System.out.println("Total price = " + totalPrice);
        Product product;
        product = new Product(); 
        product.setCode("A1");
        System.out.println(product.getCode());
    }


    //method declaration or method definition
    public static float calculation(int quantity, float price) {
          float totalPrice;
          float tax = 1.1f;
          totalPrice = quantity * price;
          return totalPrice + tax;
    }


}
