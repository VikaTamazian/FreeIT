package com.homework5.task25;

import java.util.Scanner;

/**
 * Задание 25
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */

public class Solution {
    public static void main(String[] args) {

        Atm.startWorking();

    }
}

class Atm {
    static Scanner scanner = new Scanner(System.in);
    private static int banknote20;
    private static int banknote50;
    private static int banknote100;
    private static int banknote;
    private static int sum;

    public Atm(int banknote) {
        Atm.banknote = banknote;
    }

    public Atm(int banknote20, int banknote50, int banknote100) {
        Atm.banknote20 = banknote20;
        Atm.banknote50 = banknote50;
        Atm.banknote100 = banknote100;
    }

    public static void startWorking() {
        System.out.println("Welcome to ATM. 1 - cash-in to ATM. 2 - withdraw money from ATM.");
        int userChoice = scanner.nextInt();
        while (userChoice < 1 || userChoice > 2) {
            System.out.println("Please, enter 1 to cash-in or 2 to withdraw money.");
            startWorking();
        }
        switch (userChoice) {
            case 1 -> {
                cashIn();
                System.out.println("Do you need one more operation? 1 - Yes. 2 - No.");
                switch (scanner.nextInt()) {
                    case 1 -> startWorking();
                    case 2 -> System.out.println("Have a nice day!");
                }

            }
            case 2 -> {
                withdraw(banknote);
                System.out.println("Do you need one more operation? 1 - Yes. 2 - No.");
                userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1 -> startWorking();
                    case 2 -> System.out.println("Have a nice day!");
                }
            }
        }

    }

    public static void cashIn() {
        sum = 0;
        boolean isWorking = true;
        String answer = null;

        while (true) {
            System.out.println("Please, select the amount you want to cash-in: 20, 50, 100.");
            int banknote = scanner.nextInt();
            switch (banknote) {
                case 20 -> {
                    sum += 20;
                    banknote20 += 20;
                }
                case 50 -> {
                    sum += 50;
                    banknote50 += 50;
                }
                case 100 -> {
                    sum += 100;
                    banknote100 += 100;
                }
            }
            System.out.println("Your deposit is: " + sum);
            System.out.println("Do you want to continue? Y/N ");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("N")) {
                isWorking = false;
                break;
            }
        }

    }

    public static boolean withdraw(int cash) {
        System.out.println("Please enter required amount: ");
        cash = scanner.nextInt();
        int finalCash = cash;

        if (sum == 0) {
            System.out.println("Sorry, ATM is empty.");
            return false;
        }
        if (sum < cash) {
            System.out.println("Sorry, not enough cash in ATM.");
            return false;
        } else {
            int hundy = cash / 100;
            int fifty = (cash % 100) / 50;
            int twenty = ((cash % 100) % 50) / 20;
            cash -= (hundy * 100 + fifty * 50 + twenty * 20);
            if (cash > 0) {
                System.out.println("Incorrect sum. Next bills are accessible: 20,50,100");
                return withdraw(scanner.nextInt());
            } else {
                System.out.println("Please, take your money: " + finalCash + " || 20*" + twenty + " 50*" + fifty + " 100*" + hundy);
                System.out.println("Your deposit is " + (sum - finalCash));
                return true;
            }

        }
    }
}


