package Bai5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(2),
            new Rectangle(5,3.5),
            new Square(2),
        };

        for (Shape shape : shapes) {
            System.out.println("Diện tích: "+shape.area());
        }
    }
}
