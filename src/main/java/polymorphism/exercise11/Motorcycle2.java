package polymorphism.exercise11;

public class Motorcycle2 extends Vehicle2 {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts with kick: BRUM BRUM!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stops: ...quiet");
    }
}