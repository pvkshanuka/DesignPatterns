package Kottus;

import AddOns.Cheese;
import AddOns.Chicken;

public class CheeseChickenKottu extends Kottu{
    @Override
    protected void makeKottu() {

        addOns.add(new Cheese());
        addOns.add(new Chicken());

    }
}
