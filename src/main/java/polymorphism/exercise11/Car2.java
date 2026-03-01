package polymorphism.exercise11;

public class Car2 extends Vehicle2 {
    @Override
    public void startEngine() {
        System.out.println("Car engine starts with key: VROOM VROOM!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stops: ...silence");
    }
}
