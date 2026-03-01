package encapsulation;

public class Book {
    private String title;
    private String author;
    private double price;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price = price - discountAmount;
            System.out.println(percentage + "% discount applied");
        } else {
            System.out.println("Error: Discount must be between 1 and 100");
        }
    }
}