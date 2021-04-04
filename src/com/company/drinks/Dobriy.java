package com.company.drinks;

import com.company.models.Drinks;

public class Dobriy extends Drinks {
    @Override
    public String toString() {
        return "You ordered DOBRIY & count is " + getProductCount();
    }
}