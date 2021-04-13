package com.transport;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * В классе Транспорт есть поля:
 * - Мощность(в лошадиных силах)
 * - Максимальная скорость(км/ч)
 * - Масса (кг)
 * - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )
 */

@Data
@AllArgsConstructor
public class Transport {
    int power;
    int maxSpeed;
    int mass;
    String model;

    public String getData() {
        return ("Full information: " + power + "HP, " + maxSpeed + " max speed, " + mass + "kg, " + model);
    }

}
