package com.transport;

import lombok.Data;

/**
 * В классе Воздушный добавляются поля:
 * - Размах крыльев (м)
 * - Минимальная длина взлётно-посадочной полосы для взлёта
 */

@Data
public class AirTransport extends Transport {
    double wingspan;
    double minRunwayLength;


    public AirTransport(int power, int maxSpeed, int mass, String model, double wingspan, double minRunwayLength) {
        super(power, maxSpeed, mass, model);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public String getData() {

        return "AIR TRANSPORT: " + power + "HP, " + maxSpeed + "km/h, " + mass + "kg, "
                + model + ", " + wingspan + "m, " + minRunwayLength + "m, "
                + powerConverter() + "kW. ";
    }

    public double powerConverter() {
        return power * 0.74;
    }
}
