package inheritance;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive() {
        System.out.println("Riding a " + year + " " + make + " " + model + " motorcycle");
    }

    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        return distance / fuelUsed * 1.5; // Motorcycles are more efficient
    }

    public double calculateDistance(double speed, double time) {
        return speed * time;
    }

    public String getMaxSpeed() {
        return "Motorcycle max speed: 180 km/h";
    }

    public void wheelie() {
        System.out.println("Doing a wheelie!");
    }
}
