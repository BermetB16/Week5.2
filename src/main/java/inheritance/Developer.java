// Developer.java
package inheritance;

public class Developer extends Employee {
    private String programmingLanguage;

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public String generatePerformanceReport() {
        return name + " (Developer): Good code quality in " + programmingLanguage;
    }

    public void developFeature(String featureName) {
        System.out.println(name + " is developing feature: " + featureName);
    }
}