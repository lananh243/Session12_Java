package Bai4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("Diện tích hình tròn: "+(circle.area(2)));
        System.out.println("Diện tích HCN: "+(rectangle.area(3,2)));
    }
}
