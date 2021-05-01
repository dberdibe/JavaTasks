package day9.Task2;

public class Circle extends Figure {
    private double r;


    public Circle(double r, String colour) {
        super(colour);
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
