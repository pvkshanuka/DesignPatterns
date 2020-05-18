public class SilverDiscount extends DiscountHandler {
    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getDiscount()+invoice.getAmount()*0.1);
        System.out.println("Silver Discount Calculated");
        if (invoice.getUserLoyalty() == Loyalty.SILVER){
            return invoice.getDiscount();
        }else {
            return discountHandler.applyDiscount(invoice);
        }
    }
}
