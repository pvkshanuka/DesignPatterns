package Kottus;

import AddOns.Vegetable;

public class VegetableKottu extends Kottu {

    @Override
    protected void makeKottu() {

        addOns.add(new Vegetable());

    }

}
