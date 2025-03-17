package Bai8;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Sản phẩm phụ kiện", 1000);
        Product food = new Food("Bánh mì",200);
        Product electonic = new Electronics("Iphone 16", 1500);
        Product clothing = new Clothing("Áo phông", 500);

        System.out.println("Giá cuối cùng: " + product.getFinalPrice() + " USD");
        System.out.println("Giá cuối cùng: " + food.getFinalPrice() + " USD");
        System.out.println("Giá cuối cùng: " + electonic.getFinalPrice() + " USD");
        System.out.println("Giá cuối cùng:  " + clothing.getFinalPrice() + " USD");

        int quantity = 130;
        System.out.println("Sản phẩm khi mua với số lượng: "+quantity);
        System.out.println(product.getName()+ " - Giá cuối cùng: " + product.getFinalPrice(quantity) + " USD");
        System.out.println(food.getName()+ " - Giá cuối cùng:  " + food.getFinalPrice(quantity) + " USD");
        System.out.println(electonic.getName()+ " - Giá cuối cùng: " +electonic.getFinalPrice(quantity) + " USD");
        System.out.println(clothing.getName()+ " - Giá cuối cùng: " +clothing.getFinalPrice(quantity) + " USD");
    }
}
