package polymorphism.exercise2;

public class Car extends Vehicle {
    @Override
    public void speedUp() {
        speed += 20;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }
}
