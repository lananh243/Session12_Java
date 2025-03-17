package Bai8;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return 0;
    }

    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }

    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5;
        }else{
            return getDiscount();
        }
    }

    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        return price - (price * discount / 100);
    }
}
