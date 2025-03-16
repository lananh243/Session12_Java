package Bai9;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move(100, 3);
        car.sound();
        System.out.println("-------------------");

        Vehicle bus = new Bus();
        bus.move(60, 2);
        bus.sound();
        System.out.println("------------------------");
        Vehicle bike = new Bike();
        bike.move(75, 4);
        bike.sound();
        System.out.println("--------------------------");
        Vehicle airplance = new Airplane();
        airplance.move(900, 2);
        airplance.sound();
    }
}
