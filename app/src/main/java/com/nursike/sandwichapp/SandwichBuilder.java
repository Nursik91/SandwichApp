package com.nursike.sandwichapp;

import com.nursike.sandwichapp.breads.Bagel;
import com.nursike.sandwichapp.fillings.CreamCheese;
import com.nursike.sandwichapp.fillings.SmokedSalmon;

/**
 * Created by nursultanyerezhepov on 4/27/18.
 */

public class SandwichBuilder {
    // Off the shelf sandwich
    public static Sandwich readyMade() {
        Sandwich sandwich = new Sandwich();
        sandwich.addIngredient(new Bagel());
        sandwich.addIngredient(new SmokedSalmon());
        sandwich.addIngredient(new CreamCheese());
        return sandwich;
    }

    // Customized sandwich
    public static Sandwich build(Sandwich s, Ingredient i) {
        s.addIngredient(i);
        return s;
    }
}
