package com.robot.hеads;

public class SamsungHead implements IHead {

    private int price;

    public SamsungHead(int price) {

        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.print("Говорит голова Samsung. ");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
