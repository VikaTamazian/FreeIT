package com.robot.hands;

public class SonyHand implements IHand {

    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {

    }

    @Override
    public void upHand() {
        System.out.print("Поднята рука Sony. ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
