package Kottus;

import AddOns.Chicken;
import AddOns.StringHoppers;

public class SHChickenKottu extends Kottu {

    @Override
    protected void makeKottu() {

        addOns.add(new StringHoppers());
        addOns.add(new Chicken());

    }

}
