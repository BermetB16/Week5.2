package constructor;

public class Cat {
    private String name;
    private int age;
    public Cat(){
        name = "Unknown";
        age= 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}