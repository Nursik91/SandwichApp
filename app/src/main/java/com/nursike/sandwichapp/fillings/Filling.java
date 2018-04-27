package com.nursike.sandwichapp.fillings;

import com.nursike.sandwichapp.Ingredient;

/**
 * Created by nursultanyerezhepov on 4/27/18.
 */

public abstract class Filling implements Ingredient {

    @Override
    public abstract String name();
    @Override
    public abstract int calories();
}
