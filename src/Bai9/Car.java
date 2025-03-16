package Bai9;

public class Car extends Vehicle{
    @Override
    public void move(int time, int speed) {
        System.out.println("Car di chuyển trên mặt đất");
        System.out.println("Khoảng cách di chuyển: "+speed * time+ "km/h");
    }

    @Override
    public void sound() {
        System.out.println("Vroom");
    }
}
