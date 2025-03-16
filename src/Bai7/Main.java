package Bai7;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicle = {
                new Car(),
                new Bike(),
                new Bus(),
        };

        for (Vehicle v : vehicle) {
            v.move();
            v.sound();
        }
    }
}
