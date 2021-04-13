package com.space;

import com.space.spacecraft.IStart;

public class SpacePort {


    public static void getLaunch(IStart shuttle) throws InterruptedException {
        if (shuttle.checkSystem()) {
            shuttle.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            shuttle.startFlight();
        } else {
            System.out.println("Предстартовая проверка провалена.");
        }

    }

}
