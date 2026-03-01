package polymorphism.exercise8;

public class Circle3 extends Shape3 {
    private double radius;

    public Circle3(double radius) {
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
