package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Throwable {
        System.out.println("'A' for CHEEPS -> 0-LAYS, 1-DORITOS, 2-PRINGLES" +
                "\n'B' for DRINKS -> 0-COLA, 1-DOBRIY, 2-WATER" +
                "\n'C' for SWEETS -> 0-MARS, 1-TWIX, 2-CHOCOPIE" +
                "\nDon't forget about count!\n");

        while (true)
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your choice:  ");
                Command command = new Command(sc.nextLine());
                VendingMachine vendingMachine = new VendingMachine();
                System.out.println(vendingMachine.choseProduct(command));
                break;

            } catch (NullPointerException |
                    NumberFormatException |
                    ArrayIndexOutOfBoundsException exception) {
                System.out.println("Please enter a valid choice.");
            }
    }
}