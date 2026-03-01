package constructor;

public class Car {
    private String model;
    private int year;
    private String make;

    public Car() {
        this.model = "Unknown";
        this.year = 2000;
        this.make = "Unknown";
    }

    public Car(String model, int year, String make) {
        this.model = model;
        this.year = year;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}
