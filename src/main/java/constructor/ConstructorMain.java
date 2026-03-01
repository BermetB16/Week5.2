package constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        //1
        Cat cat1 = new Cat();
        System.out.println("Cat's name: " + cat1.getName() +"\nCat's age: " + cat1.getAge());
        System.out.println("------------------------");
        //2
        Dog dog = new Dog("Puppy", "Grey");
        System.out.println("Dog's name: " + dog.getName() + " dog's color " + dog.getColor());
        System.out.println("------------------------");
        //3
        Book book1 = new Book();
        Book book2 = new Book("Harry Potter", "J.K. Rowling");
        Book book3 = new Book("War and Peace", "Leo Tolstoy", 540.50);
        System.out.println("The title: "+ book1.getTitle()+ " \nThe author: " + book1.getAuthor() + "\nThe price: " + book1.getPrice());
        System.out.println("The title: "+ book2.getTitle()+ " \nThe author: " + book2.getAuthor());
        System.out.println("The title: "+ book3.getTitle()+ " \nThe author: " + book2.getAuthor() + "\nThe price: " + book3.getPrice());
        System.out.println("------------------------");
        //4
        Student student1 = new Student();
        Student student2 = new Student("Amantur", 250107036,87.55);
        System.out.println("Student name: "+ student1.getStudentName() + "\nStudent Id: " + student1.getStudentID() + "\nStudent grade: " + student1.getGrade());
        System.out.println("Student name: "+ student2.getStudentName() + "\nStudent Id: " + student2.getStudentID() + "\nStudent grade: " + student2.getGrade());
        System.out.println("------------------------");
        // 5
        Rectangle rectangle = new Rectangle(23.56,10.34);
        Rectangle rectangle1 = new Rectangle(rectangle);
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println(rectangle1.getLength() + rectangle1.getWidth());
        System.out.println("------------------------");
        //6
        System.out.println("Creating valid account");
        Account acc1 = new Account("ACC123456", 1000.50);
        acc1.displayAccountInfo();
        System.out.println("------------------------");
        //7
        System.out.println("All values provided");
        Car car1 = new Car("Toyota", 2022, "Camry");
        System.out.println("Car created:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("--------------------");
        //8
        System.out.println("Classroom with students");
        String[] students1 = {"Alice", "Bob", "Charlie", "Diana"};
        Classroom classroom1 = new Classroom("Mathematics 101", students1);
        System.out.println("--------------------");
    }
}
