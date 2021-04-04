package com.company.cheeps;

import com.company.models.Cheeps;

public class Pringles extends Cheeps {
    @Override
    public String toString() {
        return "You ordered PRINGLES & count is " + getProductCount();
    }
}