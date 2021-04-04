package com.company.drinks;

import com.company.models.Drinks;

public class Water extends Drinks {
    @Override
    public String toString() {
        return "You ordered WATER & count is " + getProductCount();
    }
}