package entities;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Account {

    private int number_account;
    private String name_holder;
    private double balance;

    public Account(int number_account, String name_holder) {
        this.number_account = number_account;
        this.name_holder = name_holder;
    }

    public Account(int number_account, String name_holder, double initialDeposit) {
        this.number_account = number_account;
        this.name_holder = name_holder;
        this.balance = balance;
        deposit(initialDeposit);
    }

    public int getNumber_account() {
        return number_account;
    }

    public String getName_holder() {
        return name_holder;
    }

    public void setName_holder(String name_holder) {
        this.name_holder = name_holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return  "Account: "
                + number_account
                + ", Holder: "
                + name_holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}