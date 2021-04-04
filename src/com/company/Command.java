package com.company;

import com.company.enums.CheepsType;
import com.company.enums.DrinksType;
import com.company.enums.ProductType;
import com.company.enums.SweetsType;

public class Command {
    ProductType productType;
    CheepsType cheepsType;
    SweetsType sweetsType;
    DrinksType drinksType;
    private int productCount;

    public Command(String input) {
        String[] split = input.split(":");

        this.productCount = Integer.parseInt(split[2]);

        switch (split[0]) {
            case "A":
                this.productType = ProductType.CHEEPS;
                if (split[1].equals("0")) {
                    this.cheepsType = CheepsType.LAYS;
                } else if (split[1].equals("1")) {
                    this.cheepsType = CheepsType.DORITOS;
                } else if (split[1].equals("2")) {
                    this.cheepsType = CheepsType.PRINGLES;
                }
                break;
            case "B":
                this.productType = ProductType.DRINKS;
                if (split[1].equals("0")) {
                    this.drinksType = DrinksType.COLA;
                } else if (split[1].equals("1")) {
                    this.drinksType = DrinksType.DOBRIY;
                } else if (split[1].equals("2")) {
                    this.drinksType = DrinksType.WATER;
                }
                break;
            case "C":
                this.productType = ProductType.SWEETS;
                if (split[1].equals("0")) {
                    this.sweetsType = SweetsType.MARS;
                } else if (split[1].equals("1")) {
                    this.sweetsType = SweetsType.TWIX;
                } else if (split[1].equals("2")) {
                    this.sweetsType = SweetsType.CHOCOPIE;
                }
                break;
        }
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public CheepsType getCheepsType() {
        return cheepsType;
    }

    public void setCheepsType(CheepsType cheepsType) {
        this.cheepsType = cheepsType;
    }

    public SweetsType getSweetsType() {
        return sweetsType;
    }

    public void setSweetsType(SweetsType sweetsType) {
        this.sweetsType = sweetsType;
    }

    public DrinksType getDrinksType() {
        return drinksType;
    }

    public void setDrinksType(DrinksType drinksType) {
        this.drinksType = drinksType;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}