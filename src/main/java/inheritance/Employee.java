package inheritance;

// Employee.java
public class Employee {
    protected String name;
    protected double salary;
    protected String address;
    protected String jobTitle;

    public void work() {
        System.out.println(name + " is working");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    public String generatePerformanceReport() {
        return name + " (" + jobTitle + "): Good performance";
    }
}