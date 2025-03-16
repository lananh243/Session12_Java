package Bai9;

public class Bus extends Vehicle{
    private int seats;

    @Override
    public void move(int time, int speed) {
        System.out.println("Bus di chuyển trên mặt đất");
        System.out.println("Khoảng cách di chuyển: "+speed * time+ "km/m");
    }

    @Override
    public void sound() {
        System.out.println("Honk");
    }

}
