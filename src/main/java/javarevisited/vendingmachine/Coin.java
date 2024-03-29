package javarevisited.vendingmachine;

/**
 * Java Enum to represent Coins supported by Vending Machine
 */
public enum Coin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int denomination;

    Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}
