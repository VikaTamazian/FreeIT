package com.space.spacecraft;

import java.util.Scanner;

public class CargoSpacecraft implements IStart {
    @Override
    public boolean checkSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу груза (в тоннах): ");
        int mass = scanner.nextInt();
        if (mass < 50) return true;
        else {
            System.out.println("Перегрузка.");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели грузового корабля запущены. Все системы в норме.");

    }

    @Override
    public void startFlight() {
        System.out.println("Старт грузового корабля.");

    }
}
