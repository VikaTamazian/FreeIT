package com.clothes.jacket;


public class Sweater implements IJacket {

    public Sweater() {

    }

    @Override
    public void putOn() {
        System.out.print("Put on the sweater. ");
    }

    @Override
    public void takeOff() {
        System.out.print("Take off the sweater. ");

    }
}
