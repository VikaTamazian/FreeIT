package com.homework5.task24;

/**
 * Задание 24
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток
 * в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения
 * двух объектов (метод должен работать аналогично compareTo в строках). Создать
 * два конструктора: получающий общее количество секунд, и часы, минуты и секунды
 * по отдельности. Сделать метод для вывода данных.
 */

public class Solution {
    public static void main(String[] args) {

        Time interval1 = new Time(1, 15, 00);
        Time interval2 = new Time(4500);
        System.out.println(interval1.toString());
        System.out.println(interval2.toString());
        System.out.println(interval1.getOnlySeconds());
        System.out.println(interval1.compareTime(interval2));

    }
}

class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int sec) {
        seconds = sec % 60;
        int min = (sec - seconds) / 60;
        minutes = min % 60;
        hours = (min - minutes) / 60;

    }

    @Override
    public String toString() {
        return String.format("%dh%dm%ds", hours, minutes, seconds);
    }

    public int getOnlySeconds() {
        return ((hours * 3600) + (minutes * 60) + seconds);
    }

    public int compareTime(Time time) {
        final int comparedHours = Integer.compare(hours, time.hours);
        if (comparedHours != 0) {
            return comparedHours;
        }
        final int compareMinutes = Integer.compare(minutes, time.minutes);
        if (compareMinutes != 0) {
            return compareMinutes;
        }
        return Integer.compare(seconds, time.seconds);
    }

}
