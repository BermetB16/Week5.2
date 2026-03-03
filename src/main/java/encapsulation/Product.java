package encapsulation;

public class Product {
    private String productName;
    private String productCode;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price = price - discountAmount;
            System.out.println(percentage + "% discount applied. New price: $" + String.format("%.2f", price));
        } else {
            System.out.println("Error: Discount must be between 1 and 100");
        }
    }
}
