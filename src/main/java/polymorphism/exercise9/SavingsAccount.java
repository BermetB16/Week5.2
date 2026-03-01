package polymorphism.exercise9;

public class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Cannot withdraw $" + amount + ". Limit is $" + withdrawalLimit);
        } else if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
