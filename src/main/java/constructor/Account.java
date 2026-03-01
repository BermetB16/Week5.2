package constructor;

public class Account {
    private String accountNumber;
    private double balance;

        public Account(String accountNumber, double balance) {
            boolean isValid = true;

            // Validate accountNumber
            if (accountNumber == null) {
                System.out.println("Error: Account number cannot be null");
                isValid = false;
            } else if (accountNumber.trim().isEmpty()) {
                System.out.println("Error: Account number cannot be empty");
                isValid = false;
            }

            // Validate balance
            if (balance < 0) {
                System.out.println("Error: Balance cannot be negative");
                isValid = false;
            }

            if (isValid) {
                this.accountNumber = accountNumber;
                this.balance = balance;
                System.out.println("Account created successfully!");
            } else {
                // Set default values if validation fails
                this.accountNumber = null;
                this.balance = 0.0;
            }
        }

        // Getter methods
        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void displayAccountInfo() {
            if (accountNumber != null) {
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: $" + String.format("%.2f", balance));
            } else {
                System.out.println("Account not properly initialized");
            }
        }
}
