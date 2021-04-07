package com.computer;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        Computer computer = new Computer(2.90d, 8, 2, 10);
        computer.getData();
        computer.turnOn();
        computer.turnOff();
    }
}
