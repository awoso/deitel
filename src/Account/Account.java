package Account;

public class Account {

    private int balance;

    public void deposit(int deposit) {
        balance  = deposit + balance ;
    }

    public int checkBalance() {
        return balance;
    }
}
