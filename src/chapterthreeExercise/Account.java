package chapterthreeExercise;

import java.util.Scanner;

public class Account {
    private Object getBalance;
    private Object balance;

    public Account(String jane_green, double v) {
        
    }

    public Account() {

    }

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n",
                account1(), account1.getBalance());
        System.out.printf("%s balance: $%.2f5n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit Amount For account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);


        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance);


        System.out.print("Enter deposit for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), (Object) account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), (Object) account2.getBalance());
        

    }

    private void deposit(double depositAmount) {

    }

    private Object getName() {
        return 89;
    }

    private static Object account1() {
        return null;
    }

    public Object getBalance() {
        Object balance = null;
        return balance;
    }

    public void setBalance(Object balance) {
        this.balance = balance;
    }
}