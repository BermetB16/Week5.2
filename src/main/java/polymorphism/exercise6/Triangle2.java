package polymorphism.exercise6;

public class Triangle2 extends Shape2 {
    private double side1;
    private double side2;
    private double side3;
    private double base;
    private double height;

    public Triangle2(double side1, double side2, double side3, double base, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
