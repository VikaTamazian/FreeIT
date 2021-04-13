package com.robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {

    }

    @Override
    public void upHand() {
        System.out.print("Поднята рука Toshiba.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
