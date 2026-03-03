package inheritance;

public class Programmer extends Developer {
    @Override
    public void work() {
        System.out.println(name + " is debugging and programming");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    public String generatePerformanceReport() {
        return name + " (Programmer): Efficient coding skills";
    }

    public void fixBug(String bugId) {
        System.out.println(name + " is fixing bug #" + bugId);
    }
}

