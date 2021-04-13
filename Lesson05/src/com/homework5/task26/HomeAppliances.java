package com.homework5.task26;

import javax.sound.midi.Soundbank;

public class HomeAppliances {
    private String name;

    public HomeAppliances(String name) {
        this.name = name;

    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        System.out.println(toString() + " is turned on.");
    }

}
