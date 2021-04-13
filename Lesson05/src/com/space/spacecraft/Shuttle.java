package com.space.spacecraft;


public class Shuttle implements IStart {

    @Override
    public boolean checkSystem() throws InterruptedException {
        int checkedValue = (int) (Math.random() * 11);
        if (checkedValue > 3) return true;
        else return false;
    }

    @Override
    public void startEngine() throws InterruptedException {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");

    }

    @Override
    public void startFlight() {
        System.out.println("Старт Шатла.");

    }
}
