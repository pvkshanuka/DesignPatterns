package Kottus;

import AddOns.Chicken;
import AddOns.Egg;
import AddOns.Poke;

public class MixKottu extends Kottu{

    @Override
    protected void makeKottu() {

        addOns.add(new Chicken());
        addOns.add(new Poke());
        addOns.add(new Egg());

    }

    @Override
    public String toString() {
        return "[Mix] Kottu";
    }
}
