public class BronzeDiscount extends DiscountHandler {
    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getAmount()*0.05);
        System.out.println("Bronze Discount Calculated");
        if (invoice.getUserLoyalty() == Loyalty.BRONZE){
            return invoice.getDiscount();
        }else {
            return discountHandler.applyDiscount(invoice);
        }
    }
}
