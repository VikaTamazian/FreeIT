package com.transport;

import lombok.Data;

/**
 * В классе Наземный добавляются поля:
 * -Количество колёс
 * - Расход топлива(л/100км)
 * <p>
 * В конечных классах (Легковой, Грузовой, Военный, Гражданский) разработать метод
 * описание который будет возвращать составленную строку с описанием всех характеристик объекта.
 * В строку включить ещё один параметр мощность в киловаттах (кВ) .
 * Расчёт мощности в киловаттах производится в отдельном методе : 1 л.с = 0.74 кВ
 */

@Data
public class SurfaceTransport extends Transport {
    int wheelQuantity;
    double fuelRate;

    public SurfaceTransport(int power, int maxSpeed, int mass, String model, int wheelQuantity, double fuelRate) {
        super(power, maxSpeed, mass, model);
        this.wheelQuantity = wheelQuantity;
        this.fuelRate = fuelRate;
    }


    public String getData() {

        return "SURFACE TRANSPORT: " + power + "HP, " + maxSpeed + "km/h, " + mass + "kg, "
                + model + ", " + wheelQuantity + " wheels, " + fuelRate + "l/100km "
                + powerConverter() + "kW. ";
    }

    public double powerConverter() {
        return power * 0.74;
    }
}
