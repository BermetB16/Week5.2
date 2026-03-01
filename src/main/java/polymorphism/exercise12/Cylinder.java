package polymorphism.exercise12;

public class Cylinder extends Circle4 {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder 🧴");
    }

    @Override
    public double calculateArea() {
        double radius = super.calculateArea() / Math.PI; // Get radius back
        radius = Math.sqrt(radius);
        // Total surface area of cylinder: 2πr² + 2πrh
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
}