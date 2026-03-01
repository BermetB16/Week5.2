package inheritance;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat barks? Wait, cats don't bark! Meow!");
    }
}