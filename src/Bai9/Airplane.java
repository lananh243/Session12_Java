package Bai9;

public class Airplane extends Vehicle{
    private double altitude;

    @Override
    public void move(int time, int speed) {
        System.out.println("Airplane di chuyển trên không");
        System.out.println("Khoảng cách di chuyển: "+speed * time+ "km/h");
    }

    @Override
    public void sound() {
        System.out.println("Whoosh");
    }
}
