package com.company.sweets;

import com.company.models.Sweets;

public class Twix extends Sweets {
    @Override
    public String toString() {
        return "You ordered TWIX & count is " + getProductCount();
    }
}