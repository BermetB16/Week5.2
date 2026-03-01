package inheritance;

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }

    // Car specific method
    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        return distance / fuelUsed;
    }

    public double calculateDistance(double speed, double time) {
        return speed * time;
    }
    public String getMaxSpeed() {
        return "Car max speed: 200 km/h";
    }
}
