package encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        //1
        Person person1 = new Person();
        person1.setName("Amantur");
        person1.setAge(18);
        person1.setCountry("Germany");
        System.out.println("Person Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Country: " + person1.getCountry());
        System.out.println("--------------------");
        //2
        BankAccount account = new BankAccount();
        account.setAccountNumber("+1 777404707");
        account.setBalance(50.45);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("--------------------");
        //3
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7.5);
        rectangle.setWidth(4.5);
        System.out.println("Rectangle Information");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("--------------------");
        //4
        Employee employee = new Employee();
        employee.setEmployee_id(834845959);
        employee.setEmployee_name("Jalal");
        employee.setEmployee_salary(56000.00);
        System.out.println("Employee Information");
        System.out.println("Employee ID: " + employee.getEmployee_id());
        System.out.println("Employee Name: " + employee.getEmployee_name());
        System.out.println("Employee Salary: " + employee.getFormattedSalary());
        System.out.println("--------------------");
        //5
        System.out.println("1. Creating circle with radius");
        Circle circle1 = new Circle();
        System.out.println("  Current radius: " + circle1.getRadius());
        circle1.setRadius(7.5);
        System.out.println("  New radius: " + circle1.getRadius());
        System.out.println("  New area: " + String.format("%.2f", circle1.calculateArea()));
        System.out.println("  New perimeter: " + String.format("%.2f", circle1.calculatePerimeter()));
        //6
        System.out.println("1. Creating car: ");
        Car car1 = new Car();
        car1.setCompany_name("Honda");
        car1.setModel_name("Accord");
        car1.setYear(1205);
        System.out.println("  Company: " + car1.getCompany_name());
        System.out.println("  Model: " + car1.getModel_name());
        System.out.println("  Year: " + car1.getYear());
        System.out.println("  Mileage: " + car1.getMileage() + " km/l");
        //7
        Student student = new Student();
        student.setStudent_id(101);
        student.setStudent_name("Johni Youw");
        System.out.println("Student ID: " + student.getStudent_id());
        System.out.println("Student Name: " + student.getStudent_name());

        System.out.println("\nAdding grades: ");
        student.addGrade(85.5);
        student.addGrade(92.0);
        student.addGrade(78.5);
        student.addGrade(105.0); // Invalid
        System.out.println("All grades: " + student.getGrades());
        System.out.println("Average grade: " + student.calculateAverage());
        System.out.println("--------------------\n");
        //8
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("Hanny bunny");
        book.setPrice(445.99);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());

        System.out.println("Applying 10% discount:");
        book.applyDiscount(10);
        System.out.println("New price: $" + book.getPrice());
        System.out.println("--------------------\n");
        //9
        Smartphone phone = new Smartphone();
        phone.setBrand("Samsung");
        phone.setModel("Galaxy S21");
        phone.setStorageCapacity(128);
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage: " + phone.getStorageCapacity() + "GB");
        phone.increaseStorage(64);
        System.out.println("New storage: " + phone.getStorageCapacity() + "GB");
        System.out.println("--------------------\n");
        //10
        Desktop desktop = new Desktop();
        desktop.setBrand("Stervella Devill");
        desktop.setProcessor("Intel i7");
        desktop.setRamSize(8);
        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM: " + desktop.getRamSize() + "GB");
        desktop.upgradeRam(8);
        System.out.println("New RAM: " + desktop.getRamSize() + "GB");
        System.out.println("--------------------\n");
        //11
        House house = new House();
        house.setAddress("123 Main St");
        house.setNumberOfRooms(4);
        house.setArea(150.5);
        System.out.println("Address: " + house.getAddress());
        System.out.println("Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " sqm");
        System.out.println("Price: $" + house.calculatePrice());
        System.out.println("--------------------\n");
        //12
        Account account1 = new Account();
        account1.setAccountNumber("ACC123456");
        account1.setAccountHolder("Alice Smith");
        account1.setBalance(1000.00);
        System.out.println("Account: " + account1.getAccountNumber());
        System.out.println("Holder: " + account1.getAccountHolder());
        System.out.println("Balance: $" + account1.getBalance());

        System.out.println("\nDepositing $500:");
        account1.deposit(500);
        System.out.println("New balance: $" + account1.getBalance());

        System.out.println("\nWithdrawing $200:");
        account1.withdraw(200);
        System.out.println("New balance: $" + account1.getBalance());

        System.out.println("\nTrying to withdraw $2000:");
        account1.withdraw(2000);
        System.out.println("--------------------\n");
        //13
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(148);
        System.out.println(movie.getMovieDetails());
        System.out.println("--------------------\n");
        //14
        Product product = new Product();
        product.setProductName("Laptop");
        product.setProductCode("LP001");
        product.setPrice(999.99);
        System.out.println("Product: " + product.getProductName());
        System.out.println("Code: " + product.getProductCode());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("\nApplying 15% discount:");
        product.applyDiscount(15);
        System.out.println("Final price: $" + product.getPrice());
        System.out.println("--------------------");
    }
}
