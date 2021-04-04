package com.company.models;

import com.company.Product;

public class Drinks extends Product {

    public Drinks() {

    }

    public Drinks(int productCount) {
        super(productCount);
    }

    @Override
    public int getProductCount() {
        return super.getProductCount();
    }

    @Override
    public void setProductCount(int productCount) throws Throwable {
        super.setProductCount(productCount);
    }
}
