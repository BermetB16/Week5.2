package polymorphism.exercise2;

public class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 5;
        System.out.println("Bicycle speed increased to: " + speed + " km/h");
    }
}
