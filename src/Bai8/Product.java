package Bai8;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getDiscount() {
        return 0;
    }

    public double getFinalPrice() {
        return price - (price * 0.1);
    }

    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 0.05;
        }else{
            return getDiscount();
        }
    }

    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        return price - (price * discount);
    }
}
