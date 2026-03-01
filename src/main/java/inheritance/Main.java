package inheritance;

public class Main {
    public static void main(String[] args) {

        // Exercise 1: Animal and Cat
        System.out.println("=== EXERCISE 1: ANIMAL AND CAT ===");
        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("--------------------\n");

        // Exercise 2: Vehicle and Car
        System.out.println("=== EXERCISE 2: VEHICLE AND CAR ===");
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();
        System.out.println("--------------------\n");

        // Exercise 3: Shape and Rectangle
        System.out.println("=== EXERCISE 3: SHAPE AND RECTANGLE ===");
        Rectangle rect = new Rectangle();
        rect.setDimensions(5, 3);
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        System.out.println("--------------------\n");

        // Exercise 4: Employee and HRManager
        System.out.println("=== EXERCISE 4: EMPLOYEE AND HRMANAGER ===");
        HRManager hr = new HRManager();
        hr.setName("Alice");
        hr.setSalary(60000);
        hr.work();
        System.out.println("Salary: $" + hr.getSalary());
        hr.addEmployee("Bob");
        System.out.println("--------------------\n");

        // Exercise 5: BankAccount and SavingsAccount
        System.out.println("=== EXERCISE 5: BANKACCOUNT AND SAVINGSACCOUNT ===");
        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("SAV123");
        savings.setAccountHolder("John");
        savings.setBalance(500);
        System.out.println("Initial balance: $" + savings.getBalance());

        System.out.println("\nWithdrawing $300:");
        savings.withdraw(300);
        System.out.println("Balance: $" + savings.getBalance());

        System.out.println("\nWithdrawing $150:");
        savings.withdraw(150);
        System.out.println("Balance: $" + savings.getBalance());
        System.out.println("--------------------\n");

        // Exercise 6: Cheetah
        System.out.println("=== EXERCISE 6: CHEETAH ===");
        Cheetah cheetah = new Cheetah();
        cheetah.move();
        System.out.println("--------------------\n");

        // Exercise 7: Person and Employee2
        System.out.println("=== EXERCISE 7: PERSON AND EMPLOYEE ===");
        Employee2 emp2 = new Employee2();
        emp2.setFirstName("Jane");
        emp2.setLastName("Smith");
        emp2.setEmployeeId(101);
        emp2.setJobTitle("Manager");
        System.out.println("First Name: " + emp2.getFirstName());
        System.out.println("Last Name with Title: " + emp2.getLastName());
        System.out.println("Employee ID: " + emp2.getEmployeeId());
        System.out.println("--------------------\n");

        // Exercise 8: Circle
        System.out.println("=== EXERCISE 8: CIRCLE ===");
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Circle radius: 5");
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle.getPerimeter()));
        System.out.println("--------------------\n");

        // Exercise 9: Vehicle Hierarchy
        System.out.println("=== EXERCISE 9: VEHICLE HIERARCHY ===");

        Car car2 = new Car();
        car2.setMake("Toyota");
        car2.setModel("Camry");
        car2.setYear(2022);
        car2.setFuelType("Gasoline");
        car2.drive();
        System.out.println("Fuel efficiency: " + car2.calculateFuelEfficiency(500, 40) + " km/l");
        System.out.println(car2.getMaxSpeed());

        System.out.println();

        Truck truck = new Truck();
        truck.setMake("Ford");
        truck.setModel("F-150");
        truck.setYear(2021);
        truck.setFuelType("Diesel");
        truck.setCargoCapacity(5);
        truck.drive();
        System.out.println("Fuel efficiency: " + truck.calculateFuelEfficiency(500, 50) + " km/l");
        System.out.println(truck.getMaxSpeed());
        truck.loadCargo(3);

        System.out.println();

        Motorcycle bike = new Motorcycle();
        bike.setMake("Harley");
        bike.setModel("Davidson");
        bike.setYear(2023);
        bike.setFuelType("Gasoline");
        bike.setHasSidecar(false);
        bike.drive();
        System.out.println("Fuel efficiency: " + bike.calculateFuelEfficiency(500, 20) + " km/l");
        System.out.println(bike.getMaxSpeed());
        bike.wheelie();
        System.out.println("--------------------\n");

        // Exercise 10: Employee Hierarchy
        System.out.println("=== EXERCISE 10: EMPLOYEE HIERARCHY ===");

        Manager manager = new Manager();
        manager.setName("Sarah Johnson");
        manager.setAddress("123 Main St");
        manager.setSalary(80000);
        manager.setJobTitle("Senior Manager");
        manager.setTeamSize(8);
        manager.work();
        System.out.println("Bonus: $" + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProject("Website Redesign");

        System.out.println();

        Developer dev = new Developer();
        dev.setName("Mike Wilson");
        dev.setAddress("456 Oak Ave");
        dev.setSalary(70000);
        dev.setJobTitle("Full Stack Developer");
        dev.setProgrammingLanguage("Java");
        dev.work();
        System.out.println("Bonus: $" + dev.calculateBonus());
        System.out.println(dev.generatePerformanceReport());
        dev.developFeature("User Authentication");

        System.out.println();

        Programmer prog = new Programmer();
        prog.setName("Emily Brown");
        prog.setAddress("789 Pine St");
        prog.setSalary(65000);
        prog.setJobTitle("Junior Programmer");
        prog.setProgrammingLanguage("Python");
        prog.work();
        System.out.println("Bonus: $" + prog.calculateBonus());
        System.out.println(prog.generatePerformanceReport());
        prog.fixBug("1234");

        System.out.println("--------------------");
    }
}
