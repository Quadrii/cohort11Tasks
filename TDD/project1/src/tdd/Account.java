package tdd;

public class Account {
    private int balance;
    public int getBalance() {
        return  balance;
    }

    public void deposit(int amount) {
        if (amount > 0 ) {
            balance = balance + amount;
        }
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        }
        else {
            balance = balance;
        }
    }

}
