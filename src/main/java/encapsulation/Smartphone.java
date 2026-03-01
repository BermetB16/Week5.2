package encapsulation;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Method to increase storage
    public void increaseStorage(int value) {
        if (value > 0) {
            storageCapacity += value;
            System.out.println("Storage increased by " + value + "GB");
        } else {
            System.out.println("Error: Increase value must be positive");
        }
    }
}
