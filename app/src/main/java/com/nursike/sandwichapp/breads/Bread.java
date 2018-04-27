package com.nursike.sandwichapp.breads;

import com.nursike.sandwichapp.Ingredient;

/**
 * Created by nursultanyerezhepov on 4/27/18.
 */

public abstract class Bread implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}
