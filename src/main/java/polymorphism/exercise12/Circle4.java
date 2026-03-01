package polymorphism.exercise12;

public class Circle4 extends Shape4 {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle ⭕");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
