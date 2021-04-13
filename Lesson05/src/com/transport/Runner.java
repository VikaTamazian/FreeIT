package com.transport;

public class Runner {
    public static void main(String[] args) {
        Transport transport = new Transport(400, 300, 2000, "Tesla");
        SurfaceTransport surfaceTransport = new SurfaceTransport(400, 200, 2000,
                "Tesla", 4, 4);
        Car car = new Car(350, 200, 2000,
                "Tesla", 4, 4, "hatchback", 4);
        Lorry lorry = new Lorry(560, 200, 63000,
                "MACK", 10, 20, 60);
        AirTransport airTransport = new AirTransport(8000, 1850, 50000,
                "SRJ-200", 30, 1500);
        Civil aircraft1 = new Civil(8000, 1850, 50000,
                "SRJ-200", 30, 1500, 80, true);
        Military aircraft2 = new Military(9000, 2200, 25000,
                "MIG-29", 12, 850, true, 4);

        System.out.println(transport.getData());
        System.out.println(surfaceTransport.getData());
        System.out.println(car.getData());
        System.out.println(car.findDistance(3));
        System.out.println(lorry.getData());
        System.out.println(lorry.checkPayload());
        System.out.println(airTransport.getData());
        System.out.println(aircraft1.getData());
        System.out.println(aircraft1.checkPayload());
        System.out.println(aircraft2.getData());
        System.out.println(aircraft2.checkEjectionSystem());
        System.out.println(aircraft2.startFire());
        System.out.println(aircraft2.startFire());
        System.out.println(aircraft2.startFire());
        System.out.println(aircraft2.startFire());
        System.out.println(aircraft2.startFire());


    }
}
