package com.homework5.task27;

public abstract class BankCard {
    String cardholderName;

    BankCard(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String toString() {
        return cardholderName;
    }
}
