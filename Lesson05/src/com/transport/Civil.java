package com.transport;

import lombok.Data;

import java.util.Scanner;

/**
 * В классе Гражданский добавляются поля:
 * - Кол-во пассажиров
 * - Наличие бизнес класса (true/false)
 * Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров:
 * (Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
 * Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль
 * ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше чем то которое может
 * влезть в наш грузовик то выводим “Вам нужен грузовик побольше ”.)
 */

@Data
public class Civil extends AirTransport {
    int paxCapacity;
    boolean businessClass;

    public Civil(int power, int maxSpeed, int mass, String model, double wingspan, double minRunwayLength, int paxCapacity, boolean businessClass) {
        super(power, maxSpeed, mass, model, wingspan, minRunwayLength);
        this.paxCapacity = paxCapacity;
        this.businessClass = businessClass;
    }

    public String getData() {

        return "CIVIL AIRCRAFT: " + power + "HP, " + maxSpeed + "km/h, " + mass + "kg, "
                + model + ", " + wingspan + "m, " + minRunwayLength + "m, "
                + paxCapacity + " pax, " + "business class: " + businessClass + ", "
                + powerConverter() + "kW.";
    }


    public String checkPayload() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter passengers' number: ");
        double pax = scanner.nextDouble();
        if (pax < paxCapacity) {
            return ("Aircraft is loaded.");
        } else {
            return ("Warning. You need just a little larger aircraft.");
        }
    }
}
