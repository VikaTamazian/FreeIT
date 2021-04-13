package com.clothes.trousers;

public class Jeans implements ITrousers {
    public Jeans() {

    }

    @Override
    public void putOn() {
        System.out.print("Put on the jeans. ");
    }

    @Override
    public void takeOff() {
        System.out.print("Take off the jeans. ");

    }
}
