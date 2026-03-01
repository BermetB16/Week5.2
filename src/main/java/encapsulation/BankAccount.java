package encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(){
        this.accountNumber = "Unknown";
        this.balance = 0.00;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
