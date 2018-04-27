package com.nursike.sandwichapp.breads;

/**
 * Created by nursultanyerezhepov on 4/27/18.
 */

public class Bun extends Bread {

    @Override
    public String name() {
        return "Bun";
    }

    @Override
    public int calories() {
        return 150;
    }

}
