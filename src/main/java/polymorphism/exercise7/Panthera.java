package polymorphism.exercise7;

public class Panthera extends Animal2 {
    @Override
    public void move() {
        System.out.println("Panthera runs fast on the ground");
    }

    @Override
    public void makeSound() {
        System.out.println("Panthera roars: ROARRR!");
    }
}