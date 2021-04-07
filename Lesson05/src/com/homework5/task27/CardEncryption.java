package com.homework5.task27;

public class CardEncryption extends CardSystem implements UseCard {
    String type;

    public CardEncryption(String cardholderName, String system, String type) {
        super(cardholderName, system);
        this.type = type;

    }

    public String toString() {
        return type;
    }

    @Override
    public void useCard() {
        System.out.println(toString() + " : can be used with magnetic stripe / chip.");
    }
}
