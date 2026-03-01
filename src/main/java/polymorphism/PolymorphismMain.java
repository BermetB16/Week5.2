package polymorphism;

import polymorphism.exercise1.*;
import polymorphism.exercise2.*;
import polymorphism.exercise3.*;
import polymorphism.exercise4.*;
import polymorphism.exercise5.*;
import polymorphism.exercise6.*;
import polymorphism.exercise7.*;
import polymorphism.exercise8.*;
import polymorphism.exercise9.*;
import polymorphism.exercise10.*;
import polymorphism.exercise11.*;
import polymorphism.exercise12.*;

public class PolymorphismMain {
    public static void main(String[] args) {

        // EXERCISE 1: Animal Family
        System.out.println("=== EXERCISE 1: ANIMAL FAMILY ===");
        Animal animal1 = new Animal();
        Animal bird1 = new Bird();
        Animal cat1 = new Cat();

        animal1.sound();
        bird1.sound();
        cat1.sound();
        System.out.println("--------------------\n");

        // EXERCISE 2: Vehicle Speed
        System.out.println("=== EXERCISE 2: VEHICLE SPEED ===");
        Vehicle vehicle2 = new Vehicle();
        Vehicle car2 = new Car();
        Vehicle bicycle2 = new Bicycle();

        vehicle2.speedUp();
        car2.speedUp();
        bicycle2.speedUp();
        System.out.println("--------------------\n");

        // EXERCISE 3: Shape Area
        System.out.println("=== EXERCISE 3: SHAPE AREA ===");
        Circle circle3 = new Circle(5);
        Rectangle rect3 = new Rectangle(4, 6);
        Triangle triangle3 = new Triangle(3, 4);

        System.out.println("Circle area: " + circle3.calculateArea());
        System.out.println("Rectangle area: " + rect3.calculateArea());
        System.out.println("Triangle area: " + triangle3.calculateArea());
        System.out.println("--------------------\n");

        // EXERCISE 4: Employee Salary
        System.out.println("=== EXERCISE 4: EMPLOYEE SALARY ===");
        Manager manager4 = new Manager("Alice", 5000, 1000);
        Programmer prog4 = new Programmer("Bob", 4000, 10, 50);

        System.out.println("Manager salary: $" + manager4.calculateSalary());
        System.out.println("Programmer salary: $" + prog4.calculateSalary());
        System.out.println("--------------------\n");

        // EXERCISE 5: Sports
        System.out.println("=== EXERCISE 5: SPORTS ===");
        Sports football5 = new Football();
        Sports basketball5 = new Basketball();
        Sports rugby5 = new Rugby();

        football5.play();
        basketball5.play();
        rugby5.play();
        System.out.println("--------------------\n");

        // EXERCISE 6: Shape Area and Perimeter
        System.out.println("=== EXERCISE 6: SHAPE AREA & PERIMETER ===");
        Circle2 circle6 = new Circle2(5);
        Rectangle2 rect6 = new Rectangle2(4, 6);
        Triangle2 triangle6 = new Triangle2(3, 4, 5, 4, 3);

        System.out.println("Circle - Area: " + circle6.getArea() + ", Perimeter: " + circle6.getPerimeter());
        System.out.println("Rectangle - Area: " + rect6.getArea() + ", Perimeter: " + rect6.getPerimeter());
        System.out.println("Triangle - Area: " + triangle6.getArea() + ", Perimeter: " + triangle6.getPerimeter());
        System.out.println("--------------------\n");

        // EXERCISE 7: Animal Move and Sound
        System.out.println("=== EXERCISE 7: ANIMAL MOVE & SOUND ===");
        Animal2 bird7 = new Bird2();
        Animal2 panthera7 = new Panthera();

        bird7.move();
        bird7.makeSound();
        panthera7.move();
        panthera7.makeSound();
        System.out.println("--------------------\n");

        // EXERCISE 8: Shape Draw and Area
        System.out.println("=== EXERCISE 8: SHAPE DRAW & AREA ===");
        Circle3 circle8 = new Circle3(5);
        Square square8 = new Square(4);
        Triangle3 triangle8 = new Triangle3(3, 4);

        circle8.draw();
        System.out.println("Area: " + circle8.calculateArea());
        square8.draw();
        System.out.println("Area: " + square8.calculateArea());
        triangle8.draw();
        System.out.println("Area: " + triangle8.calculateArea());
        System.out.println("--------------------\n");

        // EXERCISE 9: Bank Account Withdrawal
        System.out.println("=== EXERCISE 9: BANK ACCOUNT WITHDRAWAL ===");
        SavingsAccount savings9 = new SavingsAccount("SAV123", 1000, 500);
        CheckingAccount checking9 = new CheckingAccount("CHK456", 1000, 2.5);

        System.out.println("Savings Account:");
        savings9.withdraw(600);
        savings9.withdraw(400);
        System.out.println("Balance: $" + savings9.getBalance());

        System.out.println("\nChecking Account:");
        checking9.withdraw(400);
        System.out.println("Balance: $" + checking9.getBalance());
        System.out.println("--------------------\n");

        // EXERCISE 10: Animal Eat and Sound
        System.out.println("=== EXERCISE 10: ANIMAL EAT & SOUND ===");
        Lion lion10 = new Lion();
        Tiger tiger10 = new Tiger();
        Panther panther10 = new Panther();

        lion10.eat();
        lion10.sound();
        tiger10.eat();
        tiger10.sound();
        panther10.eat();
        panther10.sound();
        System.out.println("--------------------\n");

        // EXERCISE 11: Vehicle Engine
        System.out.println("=== EXERCISE 11: VEHICLE ENGINE ===");
        Car2 car11 = new Car2();
        Motorcycle2 bike11 = new Motorcycle2();

        car11.startEngine();
        car11.stopEngine();
        bike11.startEngine();
        bike11.stopEngine();
        System.out.println("--------------------\n");

        // EXERCISE 12: Circle and Cylinder
        System.out.println("=== EXERCISE 12: CIRCLE & CYLINDER ===");
        Circle4 circle12 = new Circle4(5);
        Cylinder cylinder12 = new Cylinder(5, 10);

        circle12.draw();
        System.out.println("Circle area: " + circle12.calculateArea());
        cylinder12.draw();
        System.out.println("Cylinder surface area: " + cylinder12.calculateArea());
        System.out.println("--------------------");
    }
}
