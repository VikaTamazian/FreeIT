package com.clothes.shoes;

public class HighBoots implements IShoes {
    public HighBoots() {

    }

    @Override
    public void putOn() {
        System.out.println("Put on the high boots. ");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off the high boots. ");

    }
}
