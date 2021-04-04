package com.company;

import com.company.cheeps.Doritos;
import com.company.cheeps.Lays;
import com.company.cheeps.Pringles;
import com.company.drinks.Cola;
import com.company.drinks.Dobriy;
import com.company.drinks.Water;
import com.company.enums.CheepsType;
import com.company.enums.DrinksType;
import com.company.enums.ProductType;
import com.company.enums.SweetsType;
import com.company.sweets.ChocoPie;
import com.company.sweets.Mars;
import com.company.sweets.Twix;

public class VendingMachine {

    public Product choseProduct(Command command) throws Throwable {
        if (command.getProductType().equals(ProductType.CHEEPS)) {
            if (command.getCheepsType().equals(CheepsType.LAYS)) {
                Lays lays = new Lays();
                lays.setProductCount(command.getProductCount());
                return lays;
            } else if (command.getCheepsType().equals(CheepsType.DORITOS)) {
                Doritos doritos = new Doritos();
                doritos.setProductCount(command.getProductCount());
                return doritos;
            } else if (command.getCheepsType().equals(CheepsType.PRINGLES)) {
                Pringles pringles = new Pringles();
                pringles.setProductCount(command.getProductCount());
                return pringles;
            } else {
                return null;
            }
        } else if (command.getProductType().equals(ProductType.DRINKS)) {

            if (command.getDrinksType().equals(DrinksType.COLA)) {
                Cola cola = new Cola();
                cola.setProductCount(command.getProductCount());
                return cola;
            } else if (command.getDrinksType().equals(DrinksType.DOBRIY)) {
                Dobriy dobriy = new Dobriy();
                dobriy.setProductCount(command.getProductCount());
                return dobriy;
            } else if (command.getDrinksType().equals(DrinksType.WATER)) {
                Water water = new Water();
                water.setProductCount(command.getProductCount());
                return water;
            } else {
                return null;
            }
        } else if (command.getProductType().equals(ProductType.SWEETS)) {
            if (command.getSweetsType().equals(SweetsType.MARS)) {
                Mars mars = new Mars();
                mars.setProductCount(command.getProductCount());
                return mars;
            } else if (command.getSweetsType().equals(SweetsType.TWIX)) {
                Twix twix = new Twix();
                twix.setProductCount(command.getProductCount());
                return twix;
            } else if (command.getSweetsType().equals(SweetsType.CHOCOPIE)) {
                ChocoPie chocoPie = new ChocoPie();
                chocoPie.setProductCount(command.getProductCount());
                return chocoPie;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}