package Bai7;

public class Car extends Vehicle{
    @Override
    public void move() {
        System.out.println("Di chuyển nhanh");
    }

    @Override
    public void sound() {
        System.out.println("Vroom");
    }
}
