package com.homework5.task26;

public class SmallAppliances extends KitchenAppliance {
    private int quantityOfFunctions;

    public SmallAppliances(String name, String function, int quantityOfFunctions) {
        super(name, function);
        this.quantityOfFunctions = quantityOfFunctions;

    }

    public void turnOn() {
        System.out.println(toString() + "'s some function is turned on.");
    }
}
