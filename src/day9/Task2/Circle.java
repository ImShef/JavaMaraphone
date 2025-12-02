package day9.Task2;

public class Circle extends Figure {

    private final double r;

    public Circle(double r, String color) {
        this.r = r;
        super(color);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
