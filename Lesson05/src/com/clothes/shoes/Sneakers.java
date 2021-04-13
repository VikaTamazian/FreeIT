package com.clothes.shoes;

public class Sneakers implements IShoes {

    public Sneakers() {

    }

    @Override
    public void putOn() {
        System.out.println("Put on the sneakers. ");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off the sneakers. ");

    }
}
