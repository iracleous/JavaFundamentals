package gr.codehub.app;

public class Customer {
    //fields
    private String Name;
    private String Phone;

    //constructors

    public Customer(String name, String phone) {
        Name = name;
        Phone = phone;
    }

    //getter methods, accessors

    //setter methods,  mutators, modifiers

    //toString


    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
