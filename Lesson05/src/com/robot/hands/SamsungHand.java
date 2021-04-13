package com.robot.hands;

public class SamsungHand implements IHand {

    int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {

    }


    @Override
    public void upHand() {
        System.out.print("Поднята рука Samsung. ");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
