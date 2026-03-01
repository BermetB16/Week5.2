package inheritance;

public class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println(name + " is managing human resources");
    }

    public void addEmployee(String employeeName) {
        System.out.println("HR Manager " + name + " added new employee: " + employeeName);
    }
}
