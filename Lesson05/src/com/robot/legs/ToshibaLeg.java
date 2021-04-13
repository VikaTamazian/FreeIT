package com.robot.legs;

public class ToshibaLeg implements ILeg {

    private int price;

    public ToshibaLeg(int price) {

    }

    public ToshibaLeg() {

    }

    @Override
    public void step() {
        System.out.println("Шевелит ножкой Toshiba. ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
