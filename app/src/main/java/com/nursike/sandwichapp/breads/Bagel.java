package com.nursike.sandwichapp.breads;

/**
 * Created by nursultanyerezhepov on 4/27/18.
 */

public class Bagel extends Bread {

    @Override
    public String name() {
        return "Bagel";
    }

    @Override
    public int calories() {
        return 250;
    }
}
