package com.transport;

import lombok.Data;

/**
 * В классе Военный  добавляются поля:
 * - Наличие системы катапультирования (true/false)
 * - Кол-во ракет на борту
 * Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет
 * не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то “Боеприпасы отсутствуют”.
 * А так же метод катапультирование, который проверит если наличие системы катапультирования true,
 * то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”
 */
@Data
public class Military extends AirTransport {
    boolean ejectionSystem;
    int missileCapacity;

    public Military(int power, int maxSpeed, int mass, String model, double wingspan, double minRunwayLength, boolean ejectionSystem, int missileCapacity) {
        super(power, maxSpeed, mass, model, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.missileCapacity = missileCapacity;
    }

    public String getData() {

        return "MILITARY AIRCRAFT: " + power + "HP, " + maxSpeed + "km/h, " + mass + "kg, "
                + model + ", " + wingspan + "m, " + minRunwayLength + "m, "
                + "ejection system: " + ejectionSystem + ", " + missileCapacity + " missile(s), "
                + powerConverter() + "kW. ";
    }

    public String startFire() {
        if (missileCapacity != 0) {
            missileCapacity--;
            return ("Missile is launched.");

        } else {
            return ("No missiles left.");
        }
    }

    public String checkEjectionSystem() {
        if (ejectionSystem) {
            return ("Ejection pass.");
        } else {
            return ("Ejection fail. The system is disassembled.");
        }
    }


}
