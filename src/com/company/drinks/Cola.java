package com.company.drinks;

import com.company.models.Drinks;

public class Cola extends Drinks {
    @Override
    public String toString() {
        return "You ordered COLA & count is " + getProductCount();
    }
}