package com.homework5.task27;

public class CardPurpose extends CardEncryption implements UseCard {
    String purpose;

    public CardPurpose(String cardholderName, String system, String type, String purpose) {
        super(cardholderName, system, type);
        this.purpose = purpose;

    }

    public String toString() {
        return purpose;
    }

    @Override
    public void useCard() {
        System.out.println(toString() + " : can be used to pay / to place money on deposit / to pay bank loan. ");
    }
}
