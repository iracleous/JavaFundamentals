package gr.codehub.app;



import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void  displayProducts (){

//        for(Product p : products){
//            System.out.println(p);
//        }


   //     System.out.println(products);


        // printing using lambda calculus
    //    products.forEach( product -> System.out.println(product));

        // more modern writing
         products.forEach(System.out::println);
    }

    public void removeProduct(int index){
        if (index>=0 && index <= products.size()){
            products.remove(index);
        }
    }

    public void clearProducts () {
        products.clear();
    }

    public float  getTotalCost  (){

        float totalProductsPrice;

        //1st method
//        totalProductsPrice =0;
//        for(int i=0; i<products.size();i++){
//            totalProductsPrice += products.get(i).getPrice() * products.get(i).getQuantity();
//        }

        //2nd method
//        totalProductsPrice = 0;
//        for( Product p : products){
//            totalProductsPrice += p.getPrice() * p.getQuantity();
//        }

        //3rd
        totalProductsPrice  = products.stream()
                .map(p -> p.getPrice()*p.getQuantity())
                .reduce(0.0f, (a,b) ->a+b);

        return totalProductsPrice;
        }
    }

