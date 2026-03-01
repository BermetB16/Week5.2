package encapsulation;

public class Desktop {
    private String brand;
    private String processor;
    private int ramSize;

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    // Method to upgrade RAM
    public void upgradeRam(int value) {
        if (value > 0) {
            ramSize += value;
            System.out.println("RAM upgraded by " + value + "GB");
        } else {
            System.out.println("Error: Upgrade value must be positive");
        }
    }
}
