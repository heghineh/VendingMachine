package com.company.sweets;

import com.company.models.Sweets;

public class ChocoPie extends Sweets {
    @Override
    public String toString() {
        return "You ordered CHOCOPIE & count is " + getProductCount();
    }
}
