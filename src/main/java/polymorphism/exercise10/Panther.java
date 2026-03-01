package polymorphism.exercise10;

public class Panther extends Animal3 {
    @Override
    public void eat() {
        System.out.println("Panther eats meat and hunts at night");
    }

    @Override
    public void sound() {
        System.out.println("Panther hisses: HSSSS!");
    }
}
