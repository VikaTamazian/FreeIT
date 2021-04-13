package com.space.spacecraft;

public class Stealth implements IStart {
    @Override
    public boolean checkSystem() {
        int checkedValue = (int) (Math.random() * 11);
        if (checkedValue % 2 == 0) return true;
        else {
            System.out.println("Стелс-режим поврежден.");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели стелса запущены. Все системы в норме.");

    }

    @Override
    public void startFlight() {
        System.out.println("Старт стелса.");

    }
}
