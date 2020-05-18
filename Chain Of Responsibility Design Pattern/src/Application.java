public class Application {

    public static void main(String[] args) {

        Discount discount = new Discount();
        BronzeDiscount bronzeDiscount = new BronzeDiscount();
        SilverDiscount silverDiscount = new SilverDiscount();
        GoldDiscount goldDiscount = new GoldDiscount();
        PlatinumDiscount platinumDiscount = new PlatinumDiscount();

        discount.setDiscountHandler(bronzeDiscount);
        bronzeDiscount.setDiscountHandler(silverDiscount);
        silverDiscount.setDiscountHandler(goldDiscount);
        goldDiscount.setDiscountHandler(platinumDiscount);

        System.out.println("---------------------------------------");

        Invoice invoicei = new Invoice(1,Loyalty.IRON,30450);
        discount.applyDiscount(invoicei);
        System.out.println(invoicei);

        System.out.println("---------------------------------------");

        Invoice invoiceb = new Invoice(1,Loyalty.BRONZE,30450);
        discount.applyDiscount(invoiceb);
        System.out.println(invoiceb);

        System.out.println("---------------------------------------");

        Invoice invoices = new Invoice(2,Loyalty.SILVER,30450);
        discount.applyDiscount(invoices);
        System.out.println(invoices);

        System.out.println("---------------------------------------");

        Invoice invoiceg = new Invoice(3,Loyalty.GOLD,30450);
        discount.applyDiscount(invoiceg);
        System.out.println(invoiceg);


        System.out.println("---------------------------------------");

        Invoice invoicep = new Invoice(4,Loyalty.PLATINUM,30450);
        discount.applyDiscount(invoicep);
        System.out.println(invoicep);

    }

}
