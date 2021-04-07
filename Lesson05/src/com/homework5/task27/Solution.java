package com.homework5.task27;

/**
 * Задание 27
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Solution {
    public static void main(String[] args) {
        CardSystem card1 = new CardSystem("Your Name", "MasterCard");
        CardEncryption card2 = new CardEncryption("Your Name", "Visa", "contactless");
        CardPurpose card3 = new CardPurpose("Your Name", "AmericanExpress", "chip", "debit");

        card1.useCard();
        card2.useCard();
        card3.useCard();

    }
}
