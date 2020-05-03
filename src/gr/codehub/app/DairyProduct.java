package gr.codehub.app;

public class DairyProduct extends Product{
    private String producer;

    public DairyProduct(String code, String name, float price, int quantity, String producer) {
        super(code, name, price, quantity);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return   getCode()+ getName()+
                "DairyProduct{" +
                "producer='" + producer + '\'' +
                '}';
    }
}
