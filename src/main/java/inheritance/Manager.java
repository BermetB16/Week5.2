package inheritance;

public class Manager extends Employee {
    private int teamSize;

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15 + (teamSize * 100);
    }

    @Override
    public String generatePerformanceReport() {
        return name + " (Manager): Excellent leadership, managing " + teamSize + " people";
    }

    public void manageProject(String projectName) {
        System.out.println(name + " is managing project: " + projectName);
    }
}