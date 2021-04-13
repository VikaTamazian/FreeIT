package com.robot.hеads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {

        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.print("Говорит голова Sony. ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
