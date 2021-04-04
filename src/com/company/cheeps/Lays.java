package com.company.cheeps;

import com.company.models.Cheeps;

public class Lays extends Cheeps {
    @Override
    public String toString() {
        return "You ordered LAYS & count is " + getProductCount();
    }
}