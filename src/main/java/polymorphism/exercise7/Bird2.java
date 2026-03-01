package polymorphism.exercise7;

public class Bird2 extends Animal2 {
    @Override
    public void move() {
        System.out.println("Bird flies in the sky");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps: Tweet Tweet!");
    }
}
