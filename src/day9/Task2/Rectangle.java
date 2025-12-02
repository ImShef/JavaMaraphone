package day9.Task2;

public class Rectangle extends Figure {
    private final double a;
    private final double b;

    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        super(color);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
