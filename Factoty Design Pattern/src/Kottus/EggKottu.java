package Kottus;

import AddOns.Egg;

public class EggKottu extends Kottu {

    @Override
    protected void makeKottu() {

        addOns.add(new Egg());

    }

}
