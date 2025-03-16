package Bai8;

public class Main {
    public static void main(String[] args) {
        Product food = new Product("Bánh mì",300);
        Product electonic = new Electronics("Iphone 16", 9000);
        Product clothing = new Clothing("Áo phông", 6000);

        food.getDiscount();
        food.getFinalPrice(5);
        System.out.println("--------------------");
        electonic.getDiscount();
        electonic.getFinalPrice(29);
        System.out.println("---------------------");
        clothing.getDiscount();
        clothing.getFinalPrice(40);
    }
}
