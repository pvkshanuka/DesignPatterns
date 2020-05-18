public class Discount extends DiscountHandler {
    @Override
    public double applyDiscount(Invoice invoice) {
        if (invoice.getUserLoyalty() == Loyalty.IRON){
            return invoice.getDiscount();
        }else {
            return discountHandler.applyDiscount(invoice);
        }
    }
}
