package gr.codehub.app;

import java.util.Objects;

public class Product {
    private String code;
    private String name;
    private float price;
    private int quantity;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {
        code = "N.A.";
    }

    public Product(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Product(String code) {
        this.code = code;
    }

    public Product(String code, String name, float price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

  @Override
    public String toString() {


        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() ) return false;
         Product product = (Product) o;
        return Float.compare(product.price, price) == 0 &&
                quantity == product.quantity &&
                Objects.equals(code, product.code) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, price, quantity);
    }
}
