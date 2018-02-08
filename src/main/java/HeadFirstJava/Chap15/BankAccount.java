package HeadFirstJava.Chap15;

/**
 * Created by a.shipulin on 19.12.17.
 */
public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
