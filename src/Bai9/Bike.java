package Bai9;

public class Bike extends Vehicle{
    @Override
    public void move(int time, int speed) {
        System.out.println(" Bike di chuyển với tốc độ chậm");
        System.out.println("Khoảng cách di chuyển: "+speed * time+ "km/h");
    }

    @Override
    public void sound() {
        System.out.println("Ring Ring");
    }
}
