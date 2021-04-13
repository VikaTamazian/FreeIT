package com.clothes.trousers;

public class Shorts implements ITrousers{

    public Shorts() {

    }

    @Override
    public void putOn() {
        System.out.print("Put on the shorts. ");
    }

    @Override
    public void takeOff() {
        System.out.print("Take off the shorts. ");

    }
}
