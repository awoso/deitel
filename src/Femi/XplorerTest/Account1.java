package Femi.XplorerTest;

public class Account1 {

    private int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
