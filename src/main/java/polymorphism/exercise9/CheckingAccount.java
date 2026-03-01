package polymorphism.exercise9;

public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + transactionFee;
        if (totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrawn: $" + amount + " (Fee: $" + transactionFee + ")");
        } else {
            System.out.println("Insufficient balance including fee");
        }
    }
}
