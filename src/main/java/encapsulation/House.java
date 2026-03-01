package encapsulation;

public class House {
    private String address;
    private int numberOfRooms;
    private double area;
    private double pricePerSqm = 2500; // Price per square meter

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Method to calculate price
    public double calculatePrice() {
        return area * pricePerSqm;
    }
}