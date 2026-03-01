package inheritance;

public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Balance must remain above $100");
            System.out.println("Current balance: $" + balance);
        }
    }
}