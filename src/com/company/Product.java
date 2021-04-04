package com.company;

public class Product {
    private int productCount;
    private Object MyException;

    public Product() {
    }

    public Product(int productCount) {
        this.productCount = productCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) throws Throwable {
        if (productCount > 10) {
            throw (Throwable) MyException;
        } else {
            this.productCount = productCount;
        }
    }
}
