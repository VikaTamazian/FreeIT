package com.space.spacecraft;

public interface IStart {

    boolean checkSystem() throws InterruptedException;

    void startEngine() throws InterruptedException;

    void startFlight();
}
