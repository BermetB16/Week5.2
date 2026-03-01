package polymorphism.exercise10;

public class Tiger extends Animal3 {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and hunts deer");
    }

    @Override
    public void sound() {
        System.out.println("Tiger growls: GRRRR!");
    }
}
