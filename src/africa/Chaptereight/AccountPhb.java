package africa.Chaptereight;

public class AccountPhb {
    private double balance;
    private double interest;

    public AccountPhb() {
        balance = 0;
        interest = 0;
    }

    public AccountPhb(double initialBalance, double initialInterest) {
        balance = initialBalance;
        interest = initialInterest;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void addInterest() {
        balance = balance + balance * interest;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount) {
        double v = balance + balance + transfer();
    }

    private double transfer() {
        return 0;
    }
}
