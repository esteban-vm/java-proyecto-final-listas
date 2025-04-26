import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private final double limit;
    private final List<Item> cart;
    private double balance;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.cart = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Item> getCart() {
        return cart;
    }

    public boolean checkItem(Item item) {
        double itemValue = item.getValue();

        if (this.balance >= itemValue) {
            this.balance -= itemValue;
            this.cart.add(item);
            return true;
        }

        return false;
    }
}
