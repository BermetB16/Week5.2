package polymorphism.exercise8;

public class Triangle3 extends Shape3 {
    private double base;
    private double height;

    public Triangle3(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle 🔺");
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
