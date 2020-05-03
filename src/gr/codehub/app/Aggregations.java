package gr.codehub.app;

// lambda tutorial

import java.util.*;

// like the Basket class just for designing a tutorial
public class Aggregations {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    // increase the price of products using a specified rate
    public void applyIncreasePrice(float rate){
        products.forEach( p -> p.setPrice( p.getPrice() * (1+rate) ) );
    }

//returns the most expensive product in the list
    public Product getMostExpensiveProduct(){

        Optional<Product> productOptional =products.stream()
                .max(Comparator.comparingDouble(Product::getPrice));

        if (productOptional.isPresent())
            return productOptional.get();
        else
            return null;
    }

    //returns the less expensive product in the list
    public Product getLeastExpensiveProduct() {
            return products.stream()
                    .min(Comparator.comparingDouble(Product::getPrice))
                    .get();
    }

    public float averagePrice(){
        return  (float)  products.stream()
                            .mapToDouble(p-> p.getPrice())
                           .average().getAsDouble();

//      return  products.stream()
//                .map( p -> p.getPrice())
//               .reduce(0.0f, (a,b)->a+b) / products.size();


//     return  Float.parseFloat( products.stream()
//                            .mapToDouble(p-> p.getPrice())
//                            .average().getAsDouble()+"" )   ;
//
    }

}
