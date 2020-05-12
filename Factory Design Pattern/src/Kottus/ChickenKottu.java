package Kottus;

import AddOns.Chicken;

public class ChickenKottu extends Kottu {

    @Override
    protected void makeKottu() {

        addOns.add(new Chicken());

    }

}
