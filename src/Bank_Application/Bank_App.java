package Bank_Application;

public class Bank_App {
    private String firstName;
    private String lastName;
    private double balance;

    public Bank_App(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;


    }


    public String getPin(String pin) {
        return pin;
    }

    public void deposit(double deposit) {
        System.out.println(balance);
        balance = balance + deposit;
    }

    public double withdraw(double withdraw) {
        return balance;
    }

    public double getbalance() {
        return 0;
    }

    public void Loadairterm(double v) {
        return balance =
    }
}

