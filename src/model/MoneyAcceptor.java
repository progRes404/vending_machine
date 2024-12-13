package model;

public class MoneyAcceptor {
    private int amount;

    public MoneyAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAmount() {
        this.amount = this.amount + 10;
    }
}
