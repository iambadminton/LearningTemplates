package javarevisited.vendingmachine;

/**
 * The Vending Machine throws this exception of the user requests
 * a product that is sold out
 */
public class SoldOutException extends RuntimeException {

    private String message;

    public SoldOutException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
