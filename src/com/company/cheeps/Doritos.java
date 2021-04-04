package com.company.cheeps;

import com.company.models.Cheeps;

public class Doritos extends Cheeps {
    @Override
    public String toString() {
        return "You ordered DORITOS & count is " + getProductCount();
    }
}