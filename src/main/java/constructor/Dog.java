package constructor;

public class Dog {
    private String name;
    private String color;
    public Dog(String name, String color){
        this.color = color;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

}
