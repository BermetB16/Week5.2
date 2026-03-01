package polymorphism.exercise1;

public class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps: Tweet Tweet!");
    }
}