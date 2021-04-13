package com.transport;

import lombok.Data;

import java.util.Scanner;

/**
 * В классе Грузовой добавляется  поле:
 * - Грузоподъёмность(т)
 * Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
 * Метод должен проверять если это кол-во груза помещается в грузовик то выводит
 * в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше,
 * чем то которое может влезть в наш грузовик то выводим “Вам нужен грузовик побольше ”.
 */

@Data
public class Lorry extends SurfaceTransport {
    double payload;

    public Lorry(int power, int maxSpeed, int mass, String model, int wheelQuantity, double fuelRate, double payload) {
        super(power, maxSpeed, mass, model, wheelQuantity, fuelRate);
        this.payload = payload;
    }

    public String getData() {

        return "LORRY: " + power + "HP, " + maxSpeed + "km/h, " + mass + "kg, "
                + model + ", " + payload + "t, "
                + powerConverter() + "kW. ";
    }

    public String checkPayload() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter cargo weight (in tonnes): ");
        double weight = scanner.nextDouble();
        if (weight < payload) {
            return ("Lorry is loaded.");
        } else {
            return ("Warning. You need just a little larger lorry.");
        }
    }
}
