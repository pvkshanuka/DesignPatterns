import java.util.logging.Handler;

public abstract class DiscountHandler {

    protected DiscountHandler discountHandler;

    public void setDiscountHandler(DiscountHandler discountHandler){
        this.discountHandler = discountHandler;
    }

    public abstract double applyDiscount(Invoice invoice);

}
