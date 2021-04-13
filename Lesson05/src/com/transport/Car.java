package com.transport;

import lombok.Data;

/**
 * В классе Легковой добавляются поля:
 * - Тип кузова
 * - Кол-во пассажиров
 * <p>
 * Для легкового разработать метод который будет принимать время и считать сколько километров
 * проедет машина двигаясь с максимальной скоростью и сколько топлива она израсходует за это время,
 * результат вывести в консоль, расчёт расходуемого топлива вынести в отдельный метод private.
 * Результат работы метода должен вывести такую строчку:
 * За время (ваше введённое время) ч, автомобиль (марка автомобиля)
 * двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
 * проедет (xxx) км  и израсходует (xxx) литров топлива.
 * <p>
 * Мой результат выглядит так:
 * “За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует
 * 46.0 литров топлива”
 */

@Data
public class Car extends SurfaceTransport {
    String bodyType;
    int passengerCapacity;
    double distance;

    public Car(int power, int maxSpeed, int mass, String model, int wheelQuantity, double fuelRate, String bodyType, int passengerCapacity) {
        super(power, maxSpeed, mass, model, wheelQuantity, fuelRate);
        this.bodyType = bodyType;
        this.passengerCapacity = passengerCapacity;
    }

    private double getFuelConsumed() {
        return distance / 100 * fuelRate;
    }

    public String getData() {

        return "CAR: " + power + "HP, " + maxSpeed + "km/h, " + mass + "kg, "
                + model + ", " + bodyType + ", " + passengerCapacity + " pax, "
                + powerConverter() + "kW. ";
    }

    public String findDistance(double hour) {
        distance = maxSpeed * hour;
        String result = "За время " + hour + " час(а), автомобиль " + model
                + ", двигаясь с максимальной скоростью " + maxSpeed + " км/ч израсходует " + getFuelConsumed() +
                " литров топлива.";
        return result;
    }
}
