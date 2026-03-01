package polymorphism.exercise10;

public class Lion extends Animal3 {
    @Override
    public void eat() {
        System.out.println("Lion eats meat and hunts zebras");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars: ROARRR!");
    }
}
