package com.robot.hеads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {

        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.print("Говорит голова Toshiba. ");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
