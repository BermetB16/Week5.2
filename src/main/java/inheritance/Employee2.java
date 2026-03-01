// Employee2.java (renamed to avoid conflict)
package inheritance;

public class Employee2 extends Person {
    private int employeeId;
    private String jobTitle;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}