public class GoldDiscount extends DiscountHandler {
    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getDiscount()+invoice.getAmount()*0.15);
        System.out.println("Gold Discount Calculated");
        if (invoice.getUserLoyalty() == Loyalty.GOLD){
            return invoice.getDiscount();
        }else {
            return discountHandler.applyDiscount(invoice);
        }
    }
}
