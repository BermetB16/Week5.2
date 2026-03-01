package polymorphism.exercise2;

public class Vehicle {
    protected int speed;

    public void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed increased to: " + speed + " km/h");
    }

    public int getSpeed() {
        return speed;
    }
}
