package com.company.sweets;

import com.company.models.Sweets;

public class Mars extends Sweets {
    @Override
    public String toString() {
        return "You ordered MARS & count is " + getProductCount();
    }
}