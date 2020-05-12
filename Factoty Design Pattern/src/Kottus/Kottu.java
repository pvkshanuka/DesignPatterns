package Kottus;

import AddOns.AddOn;

import java.util.ArrayList;

public abstract class Kottu {

    public ArrayList<AddOn> addOns = new ArrayList<>();

    public Kottu(){
        makeKottu();
    }

    protected abstract void makeKottu();

    @Override
    public String toString() {
        return addOns.toString()+" Kottu";
    }
}
