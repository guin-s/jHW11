public class Smartphone extends Product {
    private String model;
    private String producer;

    public Smartphone(int id, String name, int price, String model, String producer) {
        super(id, name, price);
        this.model = model;
        this.producer = producer;
    }

}
