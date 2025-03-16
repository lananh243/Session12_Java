package Bai4;

public class Circle extends Shape{
    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}
