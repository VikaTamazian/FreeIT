package com.homework5.task27;

public class CardSystem extends BankCard implements UseCard {
    String system;

    public CardSystem(String cardholderName, String system) {
        super(cardholderName);
        this.system = system;

    }

    public String toString() {
        return system;
    }

    @Override
    public void useCard() {
        System.out.println(toString() + " : can be MasterCard / Visa / AmericanExpress. ");
    }


}
