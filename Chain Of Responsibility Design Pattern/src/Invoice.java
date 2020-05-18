public class Invoice {

    private int invoideID;
    private Loyalty userLoyalty;
    private double amount;
    private double discount;

    public Invoice(int invoideID, Loyalty userLoyalty, double amount) {
        this.invoideID = invoideID;
        this.userLoyalty = userLoyalty;
        this.amount = amount;
    }

    public int getInvoideID() {
        return invoideID;
    }

    public Loyalty getUserLoyalty() {
        return userLoyalty;
    }

    public double getAmount() {
        return amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoideID=" + invoideID +
                ", userLoyalty=" + userLoyalty +
                ", amount=" + amount +
                ", discount=" + discount +
                ", discount presentage=" + discount/amount*100 +"%"+
                ", TOTAL=" + (amount-discount) +
                '}';
    }
}
