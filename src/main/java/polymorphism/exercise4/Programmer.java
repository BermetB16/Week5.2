package polymorphism.exercise4;

public class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate);
    }
}