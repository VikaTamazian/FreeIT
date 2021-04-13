package com.clothes.jacket;

public class TShirt implements IJacket {

    public TShirt() {

    }

    @Override
    public void putOn() {
        System.out.print("Put on the T-shirt. ");

    }

    @Override
    public void takeOff() {
        System.out.print("Take off the T-shirt. ");

    }
}
