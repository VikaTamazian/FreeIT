package com.computer;

import java.util.Scanner;

/**
 * Создать класс компьютер.
 * Поля:
 * - процессор
 * - оперативка
 * - жесткий диск
 * - ресурс полных циклов работы (включений/выключений)
 * <p>
 * Методы:
 * - метод описание(вывод всех полей)
 * - метод включить, при включении может произойти сбой,
 * при вызове метода рандом загадывает число (0 либо 1),
 * вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.
 * Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец.
 * - выключить (аналогично включению)
 * - при превышении лимита ресурса комп сгорает
 */

public class Computer {

    private final double processor;
    private final int ram;
    private final int hardDrive;
    private int workCycles;

    public Computer(double processor, int ram, int hardDrive, int workCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.workCycles = workCycles;
    }

    public String toString() {
        return (processor + "GHz " + ram + "Gb " + hardDrive + "Tb " + workCycles + " cycles");
    }

    public void getData() {
        System.out.println("Data: " + toString());
    }

    public void turnOn() {
        while (workCycles > 0) {
            int random = (int) (Math.random() * 2);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Computer starts running. Please, choose the right number (0 or 1).");
            int answer = scanner.nextInt();

            System.out.println(random);

            workCycles--;
            if (random != answer) {
                System.out.println("Failed.");
                burnedOut();
                turnOn();

            } else {
                System.out.println("Computer is working now.");
            }
            return;
        }
    }

    public boolean turnOff() {
        while (workCycles > 0) {
            int random = (int) (Math.random() * 2);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Computer starts quiting. Please, choose the right number (0 or 1).");
            int answer = scanner.nextInt();

            System.out.println(random);

            workCycles--;
            if (random != answer) {
                System.out.println("Failed.");
                burnedOut();
                turnOff();
                return false;

            } else {
                System.out.println("Computer is quite now.");
                burnedOut();
                return true;

            }
        }
        return true;

    }

    private void burnedOut() {
        if (workCycles == 0) {
            System.out.println("Fatality.");
        }
    }


}
