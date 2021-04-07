package com.homework5.task26;

/**
 * Задание 26
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько
 * объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Solution {
    public static void main(String[] args) {
        HomeAppliances homeAppliances = new HomeAppliances("Radio");
        KitchenAppliance kitchenAppliance = new KitchenAppliance("Oven", "baking");
        SmallAppliances smallAppliances = new SmallAppliances("Mixer", "cooking", 3);
        homeAppliances.turnOn();
        kitchenAppliance.turnOn();
        smallAppliances.turnOn();
    }
}
