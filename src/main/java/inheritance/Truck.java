package inheritance;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + year + " " + make + " " + model + " truck");
    }

    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        return distance / fuelUsed * 0.8; // Trucks are less efficient
    }

    public double calculateDistance(double speed, double time) {
        return speed * time;
    }

    public String getMaxSpeed() {
        return "Truck max speed: 120 km/h";
    }

    public void loadCargo(double weight) {
        if (weight <= cargoCapacity) {
            System.out.println("Loading " + weight + " tons of cargo");
        } else {
            System.out.println("Exceeds cargo capacity of " + cargoCapacity + " tons");
        }
    }
}