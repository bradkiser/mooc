public class Purchase {
    private final String product;
    private int amount;
    private final int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.amount * this.unitPrice;
    }

    public void increaseAmount() {
        this.amount += 1;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }
}