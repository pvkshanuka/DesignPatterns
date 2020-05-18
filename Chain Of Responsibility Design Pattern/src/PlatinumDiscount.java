public class PlatinumDiscount extends DiscountHandler {
    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getDiscount()+invoice.getAmount()*0.2);
        System.out.println("Platinum Discount Calculated");
            return invoice.getDiscount();
    }
}
