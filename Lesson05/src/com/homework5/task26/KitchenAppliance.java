package com.homework5.task26;

public class KitchenAppliance extends HomeAppliances {

    private String function;

    public KitchenAppliance(String name, String function) {
        super(name);
        this.function = function;

    }


    public void turnOn() {
        System.out.println(toString() + " is turned on in kitchen.");
    }
}
